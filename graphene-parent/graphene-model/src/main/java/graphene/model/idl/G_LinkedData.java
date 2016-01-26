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
/** A URL and MIME type representing a pointer to text, image or other external resource. */
@org.apache.avro.specific.AvroGenerated
public class G_LinkedData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_LinkedData\",\"namespace\":\"graphene.model.idl\",\"doc\":\"A URL and MIME type representing a pointer to text, image or other external resource.\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"URL of the resource\"},{\"name\":\"mimeType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"MIME type of the resource\",\"default\":null},{\"name\":\"title\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"description of the linked resource (suitable for display to the user in an hypertext link)\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** URL of the resource */
   private java.lang.String url;
  /** MIME type of the resource */
   private java.lang.String mimeType;
  /** description of the linked resource (suitable for display to the user in an hypertext link) */
   private java.lang.String title;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_LinkedData() {}

  /**
   * All-args constructor.
   */
  public G_LinkedData(java.lang.String url, java.lang.String mimeType, java.lang.String title) {
    this.url = url;
    this.mimeType = mimeType;
    this.title = title;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return url;
    case 1: return mimeType;
    case 2: return title;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: url = (java.lang.String)value$; break;
    case 1: mimeType = (java.lang.String)value$; break;
    case 2: title = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   * URL of the resource   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * URL of the resource   * @param value the value to set.
   */
  public void setUrl(java.lang.String value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'mimeType' field.
   * MIME type of the resource   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the 'mimeType' field.
   * MIME type of the resource   * @param value the value to set.
   */
  public void setMimeType(java.lang.String value) {
    this.mimeType = value;
  }

  /**
   * Gets the value of the 'title' field.
   * description of the linked resource (suitable for display to the user in an hypertext link)   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * description of the linked resource (suitable for display to the user in an hypertext link)   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /** Creates a new G_LinkedData RecordBuilder */
  public static graphene.model.idl.G_LinkedData.Builder newBuilder() {
    return new graphene.model.idl.G_LinkedData.Builder();
  }
  
  /** Creates a new G_LinkedData RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_LinkedData.Builder newBuilder(graphene.model.idl.G_LinkedData.Builder other) {
    return new graphene.model.idl.G_LinkedData.Builder(other);
  }
  
  /** Creates a new G_LinkedData RecordBuilder by copying an existing G_LinkedData instance */
  public static graphene.model.idl.G_LinkedData.Builder newBuilder(graphene.model.idl.G_LinkedData other) {
    return new graphene.model.idl.G_LinkedData.Builder(other);
  }
  
  /**
   * RecordBuilder for G_LinkedData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_LinkedData>
    implements org.apache.avro.data.RecordBuilder<G_LinkedData> {

    private java.lang.String url;
    private java.lang.String mimeType;
    private java.lang.String title;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_LinkedData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_LinkedData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[1].schema(), other.mimeType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.title)) {
        this.title = data().deepCopy(fields()[2].schema(), other.title);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_LinkedData instance */
    private Builder(graphene.model.idl.G_LinkedData other) {
            super(graphene.model.idl.G_LinkedData.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[1].schema(), other.mimeType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.title)) {
        this.title = data().deepCopy(fields()[2].schema(), other.title);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'url' field */
    public java.lang.String getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public graphene.model.idl.G_LinkedData.Builder setUrl(java.lang.String value) {
      validate(fields()[0], value);
      this.url = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'url' field */
    public graphene.model.idl.G_LinkedData.Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'mimeType' field */
    public java.lang.String getMimeType() {
      return mimeType;
    }
    
    /** Sets the value of the 'mimeType' field */
    public graphene.model.idl.G_LinkedData.Builder setMimeType(java.lang.String value) {
      validate(fields()[1], value);
      this.mimeType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'mimeType' field has been set */
    public boolean hasMimeType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'mimeType' field */
    public graphene.model.idl.G_LinkedData.Builder clearMimeType() {
      mimeType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.String getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public graphene.model.idl.G_LinkedData.Builder setTitle(java.lang.String value) {
      validate(fields()[2], value);
      this.title = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'title' field */
    public graphene.model.idl.G_LinkedData.Builder clearTitle() {
      title = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public G_LinkedData build() {
      try {
        G_LinkedData record = new G_LinkedData();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.String) defaultValue(fields()[0]);
        record.mimeType = fieldSetFlags()[1] ? this.mimeType : (java.lang.String) defaultValue(fields()[1]);
        record.title = fieldSetFlags()[2] ? this.title : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
