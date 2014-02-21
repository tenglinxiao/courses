package com.ebay.cascading;

import cascading.operation.Function;
import cascading.operation.aggregator.Count;
import cascading.operation.regex.RegexGenerator;
import cascading.pipe.Each;
import cascading.pipe.Every;
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tuple.Fields;
import com.ebay.cascading.base.Base;

import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: tenglinxiao
 * Date: 2/21/14
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeTest extends Base {
    private static String JOB_NAME = "MergeTest";
    private String inputPath = null;
    private String outputPath = null;
    public MergeTest(String args[]) throws Exception
    {
        super(false);
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
        Pipe dataPipe = new Each(JOB_NAME, new Fields("line"), generator);
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
        complete(JOB_NAME, input, output, createPipe());
    }
    public void runHadoopMode()
    {
    }
    public static void main(String args[])
    {

    }
}
