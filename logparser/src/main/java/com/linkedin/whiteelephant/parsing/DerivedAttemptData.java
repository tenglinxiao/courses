/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.whiteelephant.parsing;  
@SuppressWarnings("all")
public class DerivedAttemptData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DerivedAttemptData\",\"namespace\":\"com.linkedin.whiteelephant.parsing\",\"fields\":[{\"name\":\"excess\",\"type\":[\"boolean\",\"null\"]},{\"name\":\"minutes\",\"type\":[\"double\",\"null\"]},{\"name\":\"cpuMinutes\",\"type\":[\"double\",\"null\"]}]}");
  @Deprecated public java.lang.Boolean excess;
  @Deprecated public java.lang.Double minutes;
  @Deprecated public java.lang.Double cpuMinutes;

  /**
   * Default constructor.
   */
  public DerivedAttemptData() {}

  /**
   * All-args constructor.
   */
  public DerivedAttemptData(java.lang.Boolean excess, java.lang.Double minutes, java.lang.Double cpuMinutes) {
    this.excess = excess;
    this.minutes = minutes;
    this.cpuMinutes = cpuMinutes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return excess;
    case 1: return minutes;
    case 2: return cpuMinutes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: excess = (java.lang.Boolean)value$; break;
    case 1: minutes = (java.lang.Double)value$; break;
    case 2: cpuMinutes = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'excess' field.
   */
  public java.lang.Boolean getExcess() {
    return excess;
  }

  /**
   * Sets the value of the 'excess' field.
   * @param value the value to set.
   */
  public void setExcess(java.lang.Boolean value) {
    this.excess = value;
  }

  /**
   * Gets the value of the 'minutes' field.
   */
  public java.lang.Double getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the 'minutes' field.
   * @param value the value to set.
   */
  public void setMinutes(java.lang.Double value) {
    this.minutes = value;
  }

  /**
   * Gets the value of the 'cpuMinutes' field.
   */
  public java.lang.Double getCpuMinutes() {
    return cpuMinutes;
  }

  /**
   * Sets the value of the 'cpuMinutes' field.
   * @param value the value to set.
   */
  public void setCpuMinutes(java.lang.Double value) {
    this.cpuMinutes = value;
  }

  /** Creates a new DerivedAttemptData RecordBuilder */
  public static com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder newBuilder() {
    return new com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder();
  }
  
  /** Creates a new DerivedAttemptData RecordBuilder by copying an existing Builder */
  public static com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder newBuilder(com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder other) {
    return new com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder(other);
  }
  
  /** Creates a new DerivedAttemptData RecordBuilder by copying an existing DerivedAttemptData instance */
  public static com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder newBuilder(com.linkedin.whiteelephant.parsing.DerivedAttemptData other) {
    return new com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder(other);
  }
  
  /**
   * RecordBuilder for DerivedAttemptData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DerivedAttemptData>
    implements org.apache.avro.data.RecordBuilder<DerivedAttemptData> {

    private java.lang.Boolean excess;
    private java.lang.Double minutes;
    private java.lang.Double cpuMinutes;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.whiteelephant.parsing.DerivedAttemptData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DerivedAttemptData instance */
    private Builder(com.linkedin.whiteelephant.parsing.DerivedAttemptData other) {
            super(com.linkedin.whiteelephant.parsing.DerivedAttemptData.SCHEMA$);
      if (isValidValue(fields()[0], other.excess)) {
        this.excess = (java.lang.Boolean) data().deepCopy(fields()[0].schema(), other.excess);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.minutes)) {
        this.minutes = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.minutes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cpuMinutes)) {
        this.cpuMinutes = (java.lang.Double) data().deepCopy(fields()[2].schema(), other.cpuMinutes);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'excess' field */
    public java.lang.Boolean getExcess() {
      return excess;
    }
    
    /** Sets the value of the 'excess' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder setExcess(java.lang.Boolean value) {
      validate(fields()[0], value);
      this.excess = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'excess' field has been set */
    public boolean hasExcess() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'excess' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder clearExcess() {
      excess = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'minutes' field */
    public java.lang.Double getMinutes() {
      return minutes;
    }
    
    /** Sets the value of the 'minutes' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder setMinutes(java.lang.Double value) {
      validate(fields()[1], value);
      this.minutes = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'minutes' field has been set */
    public boolean hasMinutes() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'minutes' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder clearMinutes() {
      minutes = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'cpuMinutes' field */
    public java.lang.Double getCpuMinutes() {
      return cpuMinutes;
    }
    
    /** Sets the value of the 'cpuMinutes' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder setCpuMinutes(java.lang.Double value) {
      validate(fields()[2], value);
      this.cpuMinutes = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'cpuMinutes' field has been set */
    public boolean hasCpuMinutes() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'cpuMinutes' field */
    public com.linkedin.whiteelephant.parsing.DerivedAttemptData.Builder clearCpuMinutes() {
      cpuMinutes = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DerivedAttemptData build() {
      try {
        DerivedAttemptData record = new DerivedAttemptData();
        record.excess = fieldSetFlags()[0] ? this.excess : (java.lang.Boolean) defaultValue(fields()[0]);
        record.minutes = fieldSetFlags()[1] ? this.minutes : (java.lang.Double) defaultValue(fields()[1]);
        record.cpuMinutes = fieldSetFlags()[2] ? this.cpuMinutes : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
