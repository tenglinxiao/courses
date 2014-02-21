package com.ebay.hadoop;

import com.ebay.hadoop.ioformat.HttpOutputFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class Main extends Configured implements Tool{
	public static class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>
	{
		protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
		{
			StringTokenizer tokenizer = new StringTokenizer(value.toString(), " ");
			while(tokenizer.hasMoreTokens())
			{
				context.write(new Text(tokenizer.nextToken().trim()), new IntWritable(1));
			}
		}
	}
	
	public static class MyReducer extends Reducer<Text, IntWritable, Text, IntWritable>
	{
		protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
		{
			Iterator<IntWritable> iter = values.iterator();
			int counter = 0;
			while(iter.hasNext())
			{
				counter++;
				iter.next();
			}
			context.write(new Text(key), new IntWritable(counter));
		}
	}

	@Override
	public int run(String[] args) throws Exception {
		Job job = new Job(getConf());
		job.setJobName("WordCount");
		job.setJarByClass(Main.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		HttpOutputFormat.setOutputPath(job, new Path(args[1]));
		job.setMapperClass(Main.MyMapper.class);
		job.setReducerClass(Main.MyReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(HttpOutputFormat.class);

		return job.waitForCompletion(true)? 0: 1;
	}
	
	public static void main(String args[]) throws Exception
	{
		int exitCode = ToolRunner.run(new Main(), args);
		System.exit(exitCode);
	}

}
