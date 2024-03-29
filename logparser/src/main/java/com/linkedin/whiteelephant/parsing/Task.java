/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.whiteelephant.parsing;  
@SuppressWarnings("all")
public class Task extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Task\",\"namespace\":\"com.linkedin.whiteelephant.parsing\",\"fields\":[{\"name\":\"jobId\",\"type\":\"string\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"TaskType\",\"symbols\":[\"MAP\",\"REDUCE\"]}},{\"name\":\"taskId\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TaskStatus\",\"symbols\":[\"SUCCESS\",\"FAILED\",\"KILLED\"]}]},{\"name\":\"startTime\",\"type\":[\"long\",\"null\"]},{\"name\":\"finishTime\",\"type\":[\"long\",\"null\"]},{\"name\":\"attempts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Attempt\",\"fields\":[{\"name\":\"jobId\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"TaskType\"},{\"name\":\"taskId\",\"type\":\"string\"},{\"name\":\"taskAttemptId\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":[\"null\",\"TaskStatus\"]},{\"name\":\"startTime\",\"type\":[\"long\",\"null\"]},{\"name\":\"finishTime\",\"type\":[\"long\",\"null\"]},{\"name\":\"shuffleFinished\",\"type\":[\"long\",\"null\"]},{\"name\":\"sortFinished\",\"type\":[\"long\",\"null\"]},{\"name\":\"counters\",\"type\":{\"type\":\"map\",\"values\":\"long\"}},{\"name\":\"derived\",\"type\":{\"type\":\"record\",\"name\":\"DerivedAttemptData\",\"fields\":[{\"name\":\"excess\",\"type\":[\"boolean\",\"null\"]},{\"name\":\"minutes\",\"type\":[\"double\",\"null\"]},{\"name\":\"cpuMinutes\",\"type\":[\"double\",\"null\"]}]}}]}}}]}");
  @Deprecated public java.lang.CharSequence jobId;
  @Deprecated public com.linkedin.whiteelephant.parsing.TaskType type;
  @Deprecated public java.lang.CharSequence taskId;
  @Deprecated public com.linkedin.whiteelephant.parsing.TaskStatus taskStatus;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long finishTime;
  @Deprecated public java.util.List<com.linkedin.whiteelephant.parsing.Attempt> attempts;

  /**
   * Default constructor.
   */
  public Task() {}

  /**
   * All-args constructor.
   */
  public Task(java.lang.CharSequence jobId, com.linkedin.whiteelephant.parsing.TaskType type, java.lang.CharSequence taskId, com.linkedin.whiteelephant.parsing.TaskStatus taskStatus, java.lang.Long startTime, java.lang.Long finishTime, java.util.List<com.linkedin.whiteelephant.parsing.Attempt> attempts) {
    this.jobId = jobId;
    this.type = type;
    this.taskId = taskId;
    this.taskStatus = taskStatus;
    this.startTime = startTime;
    this.finishTime = finishTime;
    this.attempts = attempts;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return jobId;
    case 1: return type;
    case 2: return taskId;
    case 3: return taskStatus;
    case 4: return startTime;
    case 5: return finishTime;
    case 6: return attempts;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: jobId = (java.lang.CharSequence)value$; break;
    case 1: type = (com.linkedin.whiteelephant.parsing.TaskType)value$; break;
    case 2: taskId = (java.lang.CharSequence)value$; break;
    case 3: taskStatus = (com.linkedin.whiteelephant.parsing.TaskStatus)value$; break;
    case 4: startTime = (java.lang.Long)value$; break;
    case 5: finishTime = (java.lang.Long)value$; break;
    case 6: attempts = (java.util.List<com.linkedin.whiteelephant.parsing.Attempt>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'jobId' field.
   */
  public java.lang.CharSequence getJobId() {
    return jobId;
  }

  /**
   * Sets the value of the 'jobId' field.
   * @param value the value to set.
   */
  public void setJobId(java.lang.CharSequence value) {
    this.jobId = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public com.linkedin.whiteelephant.parsing.TaskType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.linkedin.whiteelephant.parsing.TaskType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'taskId' field.
   */
  public java.lang.CharSequence getTaskId() {
    return taskId;
  }

  /**
   * Sets the value of the 'taskId' field.
   * @param value the value to set.
   */
  public void setTaskId(java.lang.CharSequence value) {
    this.taskId = value;
  }

  /**
   * Gets the value of the 'taskStatus' field.
   */
  public com.linkedin.whiteelephant.parsing.TaskStatus getTaskStatus() {
    return taskStatus;
  }

  /**
   * Sets the value of the 'taskStatus' field.
   * @param value the value to set.
   */
  public void setTaskStatus(com.linkedin.whiteelephant.parsing.TaskStatus value) {
    this.taskStatus = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Long value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'finishTime' field.
   */
  public java.lang.Long getFinishTime() {
    return finishTime;
  }

  /**
   * Sets the value of the 'finishTime' field.
   * @param value the value to set.
   */
  public void setFinishTime(java.lang.Long value) {
    this.finishTime = value;
  }

  /**
   * Gets the value of the 'attempts' field.
   */
  public java.util.List<com.linkedin.whiteelephant.parsing.Attempt> getAttempts() {
    return attempts;
  }

  /**
   * Sets the value of the 'attempts' field.
   * @param value the value to set.
   */
  public void setAttempts(java.util.List<com.linkedin.whiteelephant.parsing.Attempt> value) {
    this.attempts = value;
  }

  /** Creates a new Task RecordBuilder */
  public static com.linkedin.whiteelephant.parsing.Task.Builder newBuilder() {
    return new com.linkedin.whiteelephant.parsing.Task.Builder();
  }
  
  /** Creates a new Task RecordBuilder by copying an existing Builder */
  public static com.linkedin.whiteelephant.parsing.Task.Builder newBuilder(com.linkedin.whiteelephant.parsing.Task.Builder other) {
    return new com.linkedin.whiteelephant.parsing.Task.Builder(other);
  }
  
  /** Creates a new Task RecordBuilder by copying an existing Task instance */
  public static com.linkedin.whiteelephant.parsing.Task.Builder newBuilder(com.linkedin.whiteelephant.parsing.Task other) {
    return new com.linkedin.whiteelephant.parsing.Task.Builder(other);
  }
  
  /**
   * RecordBuilder for Task instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Task>
    implements org.apache.avro.data.RecordBuilder<Task> {

    private java.lang.CharSequence jobId;
    private com.linkedin.whiteelephant.parsing.TaskType type;
    private java.lang.CharSequence taskId;
    private com.linkedin.whiteelephant.parsing.TaskStatus taskStatus;
    private java.lang.Long startTime;
    private java.lang.Long finishTime;
    private java.util.List<com.linkedin.whiteelephant.parsing.Attempt> attempts;

    /** Creates a new Builder */
    private Builder() {
      super(com.linkedin.whiteelephant.parsing.Task.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.linkedin.whiteelephant.parsing.Task.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Task instance */
    private Builder(com.linkedin.whiteelephant.parsing.Task other) {
            super(com.linkedin.whiteelephant.parsing.Task.SCHEMA$);
      if (isValidValue(fields()[0], other.jobId)) {
        this.jobId = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.jobId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = (com.linkedin.whiteelephant.parsing.TaskType) data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.taskId)) {
        this.taskId = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.taskId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taskStatus)) {
        this.taskStatus = (com.linkedin.whiteelephant.parsing.TaskStatus) data().deepCopy(fields()[3].schema(), other.taskStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.startTime)) {
        this.startTime = (java.lang.Long) data().deepCopy(fields()[4].schema(), other.startTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.finishTime)) {
        this.finishTime = (java.lang.Long) data().deepCopy(fields()[5].schema(), other.finishTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.attempts)) {
        this.attempts = (java.util.List<com.linkedin.whiteelephant.parsing.Attempt>) data().deepCopy(fields()[6].schema(), other.attempts);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'jobId' field */
    public java.lang.CharSequence getJobId() {
      return jobId;
    }
    
    /** Sets the value of the 'jobId' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setJobId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.jobId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'jobId' field has been set */
    public boolean hasJobId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'jobId' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearJobId() {
      jobId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public com.linkedin.whiteelephant.parsing.TaskType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setType(com.linkedin.whiteelephant.parsing.TaskType value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'type' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'taskId' field */
    public java.lang.CharSequence getTaskId() {
      return taskId;
    }
    
    /** Sets the value of the 'taskId' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setTaskId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.taskId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'taskId' field has been set */
    public boolean hasTaskId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'taskId' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearTaskId() {
      taskId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'taskStatus' field */
    public com.linkedin.whiteelephant.parsing.TaskStatus getTaskStatus() {
      return taskStatus;
    }
    
    /** Sets the value of the 'taskStatus' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setTaskStatus(com.linkedin.whiteelephant.parsing.TaskStatus value) {
      validate(fields()[3], value);
      this.taskStatus = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'taskStatus' field has been set */
    public boolean hasTaskStatus() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'taskStatus' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearTaskStatus() {
      taskStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Long getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setStartTime(java.lang.Long value) {
      validate(fields()[4], value);
      this.startTime = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'startTime' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'finishTime' field */
    public java.lang.Long getFinishTime() {
      return finishTime;
    }
    
    /** Sets the value of the 'finishTime' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setFinishTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.finishTime = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'finishTime' field has been set */
    public boolean hasFinishTime() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'finishTime' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearFinishTime() {
      finishTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'attempts' field */
    public java.util.List<com.linkedin.whiteelephant.parsing.Attempt> getAttempts() {
      return attempts;
    }
    
    /** Sets the value of the 'attempts' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder setAttempts(java.util.List<com.linkedin.whiteelephant.parsing.Attempt> value) {
      validate(fields()[6], value);
      this.attempts = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'attempts' field has been set */
    public boolean hasAttempts() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'attempts' field */
    public com.linkedin.whiteelephant.parsing.Task.Builder clearAttempts() {
      attempts = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Task build() {
      try {
        Task record = new Task();
        record.jobId = fieldSetFlags()[0] ? this.jobId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (com.linkedin.whiteelephant.parsing.TaskType) defaultValue(fields()[1]);
        record.taskId = fieldSetFlags()[2] ? this.taskId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.taskStatus = fieldSetFlags()[3] ? this.taskStatus : (com.linkedin.whiteelephant.parsing.TaskStatus) defaultValue(fields()[3]);
        record.startTime = fieldSetFlags()[4] ? this.startTime : (java.lang.Long) defaultValue(fields()[4]);
        record.finishTime = fieldSetFlags()[5] ? this.finishTime : (java.lang.Long) defaultValue(fields()[5]);
        record.attempts = fieldSetFlags()[6] ? this.attempts : (java.util.List<com.linkedin.whiteelephant.parsing.Attempt>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
