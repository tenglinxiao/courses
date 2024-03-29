/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.whiteelephant.analysis;  
@SuppressWarnings("all")
public class AttemptStats extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AttemptStats\",\"namespace\":\"com.linkedin.whiteelephant.analysis\",\"fields\":[{\"name\":\"entry\",\"type\":[{\"type\":\"record\",\"name\":\"AttemptStatsKey\",\"fields\":[{\"name\":\"user\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"long\"},{\"name\":\"unit\",\"type\":{\"type\":\"enum\",\"name\":\"TimeUnit\",\"symbols\":[\"HOURS\"]}},{\"name\":\"cluster\",\"type\":\"string\"},{\"name\":\"excess\",\"type\":\"boolean\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"TaskType\",\"symbols\":[\"MAP\",\"REDUCE\"]}},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"TaskStatus\",\"symbols\":[\"SUCCESS\",\"FAILED\",\"KILLED\"]}}]},{\"type\":\"record\",\"name\":\"AttemptStatsValue\",\"fields\":[{\"name\":\"started\",\"type\":\"int\"},{\"name\":\"finished\",\"type\":\"int\"},{\"name\":\"elapsedMinutes\",\"type\":\"double\"},{\"name\":\"cpuMinutes\",\"type\":[\"double\",\"null\"]},{\"name\":\"spilledRecords\",\"type\":[\"long\",\"null\"]},{\"name\":\"reduceShuffleBytes\",\"type\":[\"long\",\"null\"]}]}]}]}");
  @Deprecated public java.lang.Object entry;

  /**
   * Default constructor.
   */
  public AttemptStats() {}

  /**
   * All-args constructor.
   */
  public AttemptStats(java.lang.Object entry) {
    this.entry = entry;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return entry;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: entry = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'entry' field.
   */
  public java.lang.Object getEntry() {
    return entry;
  }

  /**
   * Sets the value of the 'entry' field.
   * @param value the value to set.
   */
  public void setEntry(java.lang.Object value) {
    this.entry = value;
  }

  /** Creates a new AttemptStats RecordBuilder */
  public static com.linkedin.whiteelephant.analysis.AttemptStats.Builder newBuilder() {
    return new com.linkedin.whiteelephant.analysis.AttemptStats.Builder();
  }
  
  /** Creates a new AttemptStats RecordBuilder by copying an existing Builder */
  public static com.linkedin.whiteelephant.analysis.AttemptStats.Builder newBuilder(com.linkedin.whiteelephant.analysis.AttemptStats.Builder other) {
    return new com.linkedin.whiteelephant.analysis.AttemptStats.Builder(other);
  }
  
  /** Creates a new AttemptStats RecordBuilder by copying an existing AttemptStats instance */
  public static com.linkedin.whiteelephant.analysis.AttemptStats.Builder newBuilder(com.linkedin.whiteelephant.analysis.AttemptStats other) {
    return new com.linkedin.whiteelephant.analysis.AttemptStats.Builder(other);
  }
  
  /**
   * RecordBuilder for AttemptStats instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AttemptStats>
    implements org.apache.avro.data.RecordBuilder<AttemptStats> {

    private java.lang.Object entry;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.whiteelephant.analysis.AttemptStats.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.whiteelephant.analysis.AttemptStats.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing AttemptStats instance */
    private Builder(com.linkedin.whiteelephant.analysis.AttemptStats other) {
            super(com.linkedin.whiteelephant.analysis.AttemptStats.SCHEMA$);
      if (isValidValue(fields()[0], other.entry)) {
        this.entry = (java.lang.Object) data().deepCopy(fields()[0].schema(), other.entry);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'entry' field */
    public java.lang.Object getEntry() {
      return entry;
    }
    
    /** Sets the value of the 'entry' field */
    public com.linkedin.whiteelephant.analysis.AttemptStats.Builder setEntry(java.lang.Object value) {
      validate(fields()[0], value);
      this.entry = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'entry' field has been set */
    public boolean hasEntry() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'entry' field */
    public com.linkedin.whiteelephant.analysis.AttemptStats.Builder clearEntry() {
      entry = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public AttemptStats build() {
      try {
        AttemptStats record = new AttemptStats();
        record.entry = fieldSetFlags()[0] ? this.entry : (java.lang.Object) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
