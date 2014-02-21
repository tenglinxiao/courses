package com.ebay.cascading;

import cascading.flow.Flow;
import cascading.flow.FlowConnector;
import cascading.flow.FlowProcess;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.flow.local.LocalFlowConnector;
import cascading.operation.Function;
import cascading.operation.Identity;
import cascading.operation.aggregator.Count;
import cascading.operation.regex.RegexGenerator;
import cascading.pipe.Each;
import cascading.pipe.Every;
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.Scheme;
import cascading.scheme.SinkCall;
import cascading.scheme.SourceCall;

import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tap.hadoop.Lfs;
import cascading.tap.local.FileTap;
import cascading.tuple.Fields;
import com.ebay.cascading.base.Base;
import org.codehaus.jackson.map.MapperConfig;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Sample App for cascading.
 * @author  James
 * @version 1.0
 *
 */
public class App extends Base
{
    private static String WORDCOUNT = "wordcount";
    private String inputPath = null;
    private String outputPath = null;
    public App(String args[]) throws Exception
    {
        super(true);
        Properties properties = new Properties();
        try {
            properties.load(App.class.getResourceAsStream("/job.properties"));
            inputPath = properties.get("input").toString();
            outputPath = String.format(properties.get("output").toString(), System.currentTimeMillis());
            if(inputPath == null || outputPath == null)
                throw new Exception("inputPath & outputPath MUST be offered in the properties file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Pipe createPipe()
    {
        String regex = "\\w+";
        Function generator = new RegexGenerator(new Fields("word"), regex);
        Pipe dataPipe = new Each(App.WORDCOUNT, new Fields("line"), generator);
        dataPipe = new GroupBy(dataPipe, new Fields("word"));
        dataPipe = new Every(dataPipe, new Count(new Fields("count")));
        return dataPipe;
    }
    public void runLocalMode()
    {
        String inputPath = new String("/home/tenglinxiao/courses/cascading-study/src/main/resources/input.txt");
        String outputPath = new String("/home/tenglinxiao/courses/cascading-study/output.txt");

        // Local mode can't use hadoop package classes.
        Tap input = createTap(new cascading.scheme.local.TextLine(new Fields("line")), inputPath, null);
        Tap output = createTap(new cascading.scheme.local.TextLine(new Fields("word", "count")), outputPath, SinkMode.REPLACE);
        complete(App.WORDCOUNT, input, output, createPipe());
    }
    public void runHadoopMode()
    {
        // Hadoop mode.
        Tap input = createTap(new TextLine(new Fields("line")), inputPath, null);
        Tap output = createTap(new TextLine(new Fields("word", "count")), outputPath, SinkMode.REPLACE);
        complete(App.WORDCOUNT, input, output, createPipe());
    }



    public static void main( String[] args ) throws Exception {
        new App(args).run();
    }
}
