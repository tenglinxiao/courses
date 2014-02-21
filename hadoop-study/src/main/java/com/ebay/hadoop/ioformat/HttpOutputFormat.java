package com.ebay.hadoop.ioformat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpOutputFormat<K, V> extends FileOutputFormat<K, V>{
	private static Path OUTPUT_PATH = null;
	private static URL PUSH_URL = null;
	public static final String RETURN = "\n";
    private static Job JOB = null;
    public static enum FilesCounter {
        FILES_SENT
    }

	public static void setOutputPath(Job job, Path path)
	{
        JOB = job;
		OUTPUT_PATH = path;
        FileOutputFormat.setOutputPath(job, path);
	}
	public static void setPushUrl(Job job, URL url)
	{
		PUSH_URL = url;
	}
	public static class HttpRecordWriter<K, V> extends RecordWriter<K, V>{
		private DataOutputStream output;
		private FileSystem fs;
        private String keyValueSeparator = null;
        private Path outputPath;
		public HttpRecordWriter(FileSystem fs, DataOutputStream output, Path outputPath, String keyValueSeparator){
			this.fs = fs;
			this.output = output;
            this.outputPath = outputPath;
            this.keyValueSeparator = keyValueSeparator;
		}

		@Override
		public synchronized void write(K key, V value) throws IOException {
			output.writeChars(key.toString());
            output.writeChars(keyValueSeparator);
			output.writeChars(value.toString());
			output.writeBytes(RETURN);
		}

		@Override
		public synchronized void close(TaskAttemptContext context) throws IOException,
				InterruptedException {
			this.output.close();
            Path outputPath = getOutputPath(context);
            FSDataOutputStream output = fs.create(new Path(outputPath, "mylog-" + System.currentTimeMillis()), false);
            output.writeChars(HttpOutputFormat.JOB == null ? "null": "not null");
            output.writeChars("once");
            output.close();
//            Counters counters = HttpOutputFormat.JOB.getCounters();
//            org.apache.hadoop.mapreduce.Counter counter = counters.findCounter(FilesCounter.FILES_SENT);
//            {
//                counter.increment(1);
//            }
//          System.out.println("done...");
			CloseableHttpClient client = HttpClients.createDefault();
			HttpPost post = new HttpPost("http://localhost:8888");
            FSDataInputStream input = fs.open(this.outputPath);
            byte[] content = new byte[input.available()];
            input.readFully(0, content);
            input.close();
            ByteArrayEntity entity = new ByteArrayEntity(content, ContentType.MULTIPART_FORM_DATA);
			post.setEntity(entity);
			CloseableHttpResponse response = client.execute(post);
			System.out.println(response.getStatusLine());
		}
	}

	@Override
	public RecordWriter<K, V> getRecordWriter(
			TaskAttemptContext context) throws IOException, InterruptedException {
        Configuration conf = context.getConfiguration();
        String keyValueSeparator= conf.get("mapred.textoutputformat.separator", "\t");
        FileSystem fs = FileSystem.get(conf);
        Path outputPath = getDefaultWorkFile(context, "");
		FSDataOutputStream output = fs.create(outputPath, false);
		return new HttpRecordWriter<K, V>(fs, output, outputPath, keyValueSeparator);
	}

}
