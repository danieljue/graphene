/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** Single value
	
	ADDED IN 1.5 */
@org.apache.avro.specific.AvroGenerated
public class G_SingletonRange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"namespace\":\"graphene.model.idl\",\"doc\":\"Single value\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\n\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.Object value;
  /** One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER */
   private graphene.model.idl.G_PropertyType type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_SingletonRange() {}

  /**
   * All-args constructor.
   */
  public G_SingletonRange(java.lang.Object value, graphene.model.idl.G_PropertyType type) {
    this.value = value;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Object)value$; break;
    case 1: type = (graphene.model.idl.G_PropertyType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Object value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'type' field.
   * One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER   */
  public graphene.model.idl.G_PropertyType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER   * @param value the value to set.
   */
  public void setType(graphene.model.idl.G_PropertyType value) {
    this.type = value;
  }

  /** Creates a new G_SingletonRange RecordBuilder */
  public static graphene.model.idl.G_SingletonRange.Builder newBuilder() {
    return new graphene.model.idl.G_SingletonRange.Builder();
  }
  
  /** Creates a new G_SingletonRange RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_SingletonRange.Builder newBuilder(graphene.model.idl.G_SingletonRange.Builder other) {
    return new graphene.model.idl.G_SingletonRange.Builder(other);
  }
  
  /** Creates a new G_SingletonRange RecordBuilder by copying an existing G_SingletonRange instance */
  public static graphene.model.idl.G_SingletonRange.Builder newBuilder(graphene.model.idl.G_SingletonRange other) {
    return new graphene.model.idl.G_SingletonRange.Builder(other);
  }
  
  /**
   * RecordBuilder for G_SingletonRange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_SingletonRange>
    implements org.apache.avro.data.RecordBuilder<G_SingletonRange> {

    private java.lang.Object value;
    private graphene.model.idl.G_PropertyType type;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_SingletonRange.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_SingletonRange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_SingletonRange instance */
    private Builder(graphene.model.idl.G_SingletonRange other) {
            super(graphene.model.idl.G_SingletonRange.SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'value' field */
    public java.lang.Object getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public graphene.model.idl.G_SingletonRange.Builder setValue(java.lang.Object value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'value' field */
    public graphene.model.idl.G_SingletonRange.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public graphene.model.idl.G_PropertyType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public graphene.model.idl.G_SingletonRange.Builder setType(graphene.model.idl.G_PropertyType value) {
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
    public graphene.model.idl.G_SingletonRange.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public G_SingletonRange build() {
      try {
        G_SingletonRange record = new G_SingletonRange();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Object) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (graphene.model.idl.G_PropertyType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
