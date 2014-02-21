package com.ebay.hadoop;

import com.linkedin.whiteelephant.parsing.LogData;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *                                                  File file = new File("");
 DatumReader<GenericRecord> datumReader = new SpecificDatumReader<GenericRecord>(LogData);
 DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(file, datumReader);
 GenericRecord logData = null;
 while (dataFileReader.hasNext()) {
 // Reuse user object by passing it to next(). This saves us from
 // allocating and garbage collecting many objects for files with
 // many items.
 logData = dataFileReader.next(logData);
 System.out.println(logData);
 }
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Schema schema = new Schema.Parser().parse(App.class.getResourceAsStream("/avro_schemas/LogData.avsc"));
        File file = new File("/home/tenglinxiao/courses/logparser/avro/output/parsed-confs/ares-jt.vip.ebay.com_1390306900405_/2014/02/01");

        DatumReader<GenericRecord> datumReader = new SpecificDatumReader<GenericRecord>(schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(file, datumReader);
        GenericRecord logData = null;
        while (dataFileReader.hasNext()) {
            // Reuse user object by passing it to next(). This saves us from
            // allocating and garbage collecting many objects for files with
            // many items.
            logData = dataFileReader.next(logData);
            System.out.println(logData);
        }
    }
}
