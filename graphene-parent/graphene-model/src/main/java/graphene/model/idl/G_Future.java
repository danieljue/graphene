/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** Represents the future results of an asyncrhonous task.
	 Can be passed into the FutureResults service API */
@org.apache.avro.specific.AvroGenerated
public class G_Future extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_Future\",\"namespace\":\"graphene.model.idl\",\"doc\":\"Represents the future results of an asyncrhonous task.\\n\\t Can be passed into the FutureResults service API\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"unique id of this task\"},{\"name\":\"label\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"short human-readable description of task for display\"},{\"name\":\"service\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"uid of the service task is running on\",\"default\":null},{\"name\":\"started\",\"type\":\"long\",\"doc\":\"date/time task was started\"},{\"name\":\"completed\",\"type\":\"long\",\"doc\":\"date/time task was completed (negative if not completed yet)\",\"default\":-1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** unique id of this task */
   private java.lang.String uid;
  /** short human-readable description of task for display */
   private java.lang.String label;
  /** uid of the service task is running on */
   private java.lang.String service;
  /** date/time task was started */
   private long started;
  /** date/time task was completed (negative if not completed yet) */
   private long completed;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_Future() {}

  /**
   * All-args constructor.
   */
  public G_Future(java.lang.String uid, java.lang.String label, java.lang.String service, java.lang.Long started, java.lang.Long completed) {
    this.uid = uid;
    this.label = label;
    this.service = service;
    this.started = started;
    this.completed = completed;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return label;
    case 2: return service;
    case 3: return started;
    case 4: return completed;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.String)value$; break;
    case 1: label = (java.lang.String)value$; break;
    case 2: service = (java.lang.String)value$; break;
    case 3: started = (java.lang.Long)value$; break;
    case 4: completed = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * unique id of this task   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * unique id of this task   * @param value the value to set.
   */
  public void setUid(java.lang.String value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'label' field.
   * short human-readable description of task for display   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * short human-readable description of task for display   * @param value the value to set.
   */
  public void setLabel(java.lang.String value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'service' field.
   * uid of the service task is running on   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Sets the value of the 'service' field.
   * uid of the service task is running on   * @param value the value to set.
   */
  public void setService(java.lang.String value) {
    this.service = value;
  }

  /**
   * Gets the value of the 'started' field.
   * date/time task was started   */
  public java.lang.Long getStarted() {
    return started;
  }

  /**
   * Sets the value of the 'started' field.
   * date/time task was started   * @param value the value to set.
   */
  public void setStarted(java.lang.Long value) {
    this.started = value;
  }

  /**
   * Gets the value of the 'completed' field.
   * date/time task was completed (negative if not completed yet)   */
  public java.lang.Long getCompleted() {
    return completed;
  }

  /**
   * Sets the value of the 'completed' field.
   * date/time task was completed (negative if not completed yet)   * @param value the value to set.
   */
  public void setCompleted(java.lang.Long value) {
    this.completed = value;
  }

  /** Creates a new G_Future RecordBuilder */
  public static graphene.model.idl.G_Future.Builder newBuilder() {
    return new graphene.model.idl.G_Future.Builder();
  }
  
  /** Creates a new G_Future RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_Future.Builder newBuilder(graphene.model.idl.G_Future.Builder other) {
    return new graphene.model.idl.G_Future.Builder(other);
  }
  
  /** Creates a new G_Future RecordBuilder by copying an existing G_Future instance */
  public static graphene.model.idl.G_Future.Builder newBuilder(graphene.model.idl.G_Future other) {
    return new graphene.model.idl.G_Future.Builder(other);
  }
  
  /**
   * RecordBuilder for G_Future instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_Future>
    implements org.apache.avro.data.RecordBuilder<G_Future> {

    private java.lang.String uid;
    private java.lang.String label;
    private java.lang.String service;
    private long started;
    private long completed;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_Future.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_Future.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.service)) {
        this.service = data().deepCopy(fields()[2].schema(), other.service);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.started)) {
        this.started = data().deepCopy(fields()[3].schema(), other.started);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.completed)) {
        this.completed = data().deepCopy(fields()[4].schema(), other.completed);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_Future instance */
    private Builder(graphene.model.idl.G_Future other) {
            super(graphene.model.idl.G_Future.SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.service)) {
        this.service = data().deepCopy(fields()[2].schema(), other.service);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.started)) {
        this.started = data().deepCopy(fields()[3].schema(), other.started);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.completed)) {
        this.completed = data().deepCopy(fields()[4].schema(), other.completed);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'uid' field */
    public java.lang.String getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public graphene.model.idl.G_Future.Builder setUid(java.lang.String value) {
      validate(fields()[0], value);
      this.uid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uid' field has been set */
    public boolean hasUid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uid' field */
    public graphene.model.idl.G_Future.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.String getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public graphene.model.idl.G_Future.Builder setLabel(java.lang.String value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'label' field */
    public graphene.model.idl.G_Future.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'service' field */
    public java.lang.String getService() {
      return service;
    }
    
    /** Sets the value of the 'service' field */
    public graphene.model.idl.G_Future.Builder setService(java.lang.String value) {
      validate(fields()[2], value);
      this.service = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'service' field has been set */
    public boolean hasService() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'service' field */
    public graphene.model.idl.G_Future.Builder clearService() {
      service = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'started' field */
    public java.lang.Long getStarted() {
      return started;
    }
    
    /** Sets the value of the 'started' field */
    public graphene.model.idl.G_Future.Builder setStarted(long value) {
      validate(fields()[3], value);
      this.started = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'started' field has been set */
    public boolean hasStarted() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'started' field */
    public graphene.model.idl.G_Future.Builder clearStarted() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'completed' field */
    public java.lang.Long getCompleted() {
      return completed;
    }
    
    /** Sets the value of the 'completed' field */
    public graphene.model.idl.G_Future.Builder setCompleted(long value) {
      validate(fields()[4], value);
      this.completed = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'completed' field has been set */
    public boolean hasCompleted() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'completed' field */
    public graphene.model.idl.G_Future.Builder clearCompleted() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public G_Future build() {
      try {
        G_Future record = new G_Future();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.String) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.String) defaultValue(fields()[1]);
        record.service = fieldSetFlags()[2] ? this.service : (java.lang.String) defaultValue(fields()[2]);
        record.started = fieldSetFlags()[3] ? this.started : (java.lang.Long) defaultValue(fields()[3]);
        record.completed = fieldSetFlags()[4] ? this.completed : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
