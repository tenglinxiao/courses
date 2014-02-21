package com.ebay.cascading.base;

import cascading.flow.FlowConnector;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.flow.local.LocalFlowConnector;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.Scheme;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tap.local.FileTap;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: tenglinxiao
 * Date: 2/20/14
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Base {
    private boolean localMode = false;
    private Properties properties = new Properties();
    public Base(){}
    public Base(boolean localMode)
    {
        this.localMode = localMode;
    }
    public FlowConnector getConnector()
    {
        AppProps.setApplicationJarClass(properties, this.getClass());
        if(localMode)
        {
            return new LocalFlowConnector(properties);
        }
        return new HadoopFlowConnector(properties);
    }
    public Tap createTap(Scheme scheme, String path, SinkMode mode)
    {
        if(this.localMode)
        {
            return new FileTap(scheme, path, mode == null? SinkMode.KEEP: SinkMode.REPLACE);
        }
        return new Hfs(scheme, path);
    }

    public abstract Pipe createPipe();
    public abstract void runLocalMode();
    public abstract void runHadoopMode();

    public void complete(String name, Tap input, Tap output, Pipe dataPipe)
    {
        getConnector().connect(name, input, output, dataPipe).complete();
    }

    public boolean isLocalMode()
    {
        return this.localMode;
    }

    public void run()
    {
        if(isLocalMode())
        {
            runLocalMode();
        }
        else
        {
            runHadoopMode();
        }

    }
}
