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
/** Describes a distribution of values. 
	 
	ADDED IN 1.6 */
@org.apache.avro.specific.AvroGenerated
public class G_DistributionRange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"namespace\":\"graphene.model.idl\",\"doc\":\"Describes a distribution of values. \\n\\t \\n\\tADDED IN 1.6\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"A frequency or probability element of a distribution.\\n\\t \\n\\tADDED IN 1.6\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"List of values\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\n\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"Bounded or unbounded range values\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]}],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"Allowed types for Ranges of values.\\n\\t\\n\\tCHANGED IN 1.6\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarised\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"The type of value that the distribution describes. One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.util.List<graphene.model.idl.G_Frequency> distribution;
  /** Describes how the values in the distribution are summarised */
   private graphene.model.idl.G_RangeType rangeType;
  /** The type of value that the distribution describes. One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER */
   private graphene.model.idl.G_PropertyType type;
  /** True if a probability distribution, false if a frequency distribution */
   private boolean isProbability;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_DistributionRange() {}

  /**
   * All-args constructor.
   */
  public G_DistributionRange(java.util.List<graphene.model.idl.G_Frequency> distribution, graphene.model.idl.G_RangeType rangeType, graphene.model.idl.G_PropertyType type, java.lang.Boolean isProbability) {
    this.distribution = distribution;
    this.rangeType = rangeType;
    this.type = type;
    this.isProbability = isProbability;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return distribution;
    case 1: return rangeType;
    case 2: return type;
    case 3: return isProbability;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: distribution = (java.util.List<graphene.model.idl.G_Frequency>)value$; break;
    case 1: rangeType = (graphene.model.idl.G_RangeType)value$; break;
    case 2: type = (graphene.model.idl.G_PropertyType)value$; break;
    case 3: isProbability = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'distribution' field.
   */
  public java.util.List<graphene.model.idl.G_Frequency> getDistribution() {
    return distribution;
  }

  /**
   * Sets the value of the 'distribution' field.
   * @param value the value to set.
   */
  public void setDistribution(java.util.List<graphene.model.idl.G_Frequency> value) {
    this.distribution = value;
  }

  /**
   * Gets the value of the 'rangeType' field.
   * Describes how the values in the distribution are summarised   */
  public graphene.model.idl.G_RangeType getRangeType() {
    return rangeType;
  }

  /**
   * Sets the value of the 'rangeType' field.
   * Describes how the values in the distribution are summarised   * @param value the value to set.
   */
  public void setRangeType(graphene.model.idl.G_RangeType value) {
    this.rangeType = value;
  }

  /**
   * Gets the value of the 'type' field.
   * The type of value that the distribution describes. One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER   */
  public graphene.model.idl.G_PropertyType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * The type of value that the distribution describes. One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER   * @param value the value to set.
   */
  public void setType(graphene.model.idl.G_PropertyType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'isProbability' field.
   * True if a probability distribution, false if a frequency distribution   */
  public java.lang.Boolean getIsProbability() {
    return isProbability;
  }

  /**
   * Sets the value of the 'isProbability' field.
   * True if a probability distribution, false if a frequency distribution   * @param value the value to set.
   */
  public void setIsProbability(java.lang.Boolean value) {
    this.isProbability = value;
  }

  /** Creates a new G_DistributionRange RecordBuilder */
  public static graphene.model.idl.G_DistributionRange.Builder newBuilder() {
    return new graphene.model.idl.G_DistributionRange.Builder();
  }
  
  /** Creates a new G_DistributionRange RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_DistributionRange.Builder newBuilder(graphene.model.idl.G_DistributionRange.Builder other) {
    return new graphene.model.idl.G_DistributionRange.Builder(other);
  }
  
  /** Creates a new G_DistributionRange RecordBuilder by copying an existing G_DistributionRange instance */
  public static graphene.model.idl.G_DistributionRange.Builder newBuilder(graphene.model.idl.G_DistributionRange other) {
    return new graphene.model.idl.G_DistributionRange.Builder(other);
  }
  
  /**
   * RecordBuilder for G_DistributionRange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_DistributionRange>
    implements org.apache.avro.data.RecordBuilder<G_DistributionRange> {

    private java.util.List<graphene.model.idl.G_Frequency> distribution;
    private graphene.model.idl.G_RangeType rangeType;
    private graphene.model.idl.G_PropertyType type;
    private boolean isProbability;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_DistributionRange.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_DistributionRange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.distribution)) {
        this.distribution = data().deepCopy(fields()[0].schema(), other.distribution);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rangeType)) {
        this.rangeType = data().deepCopy(fields()[1].schema(), other.rangeType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isProbability)) {
        this.isProbability = data().deepCopy(fields()[3].schema(), other.isProbability);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_DistributionRange instance */
    private Builder(graphene.model.idl.G_DistributionRange other) {
            super(graphene.model.idl.G_DistributionRange.SCHEMA$);
      if (isValidValue(fields()[0], other.distribution)) {
        this.distribution = data().deepCopy(fields()[0].schema(), other.distribution);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rangeType)) {
        this.rangeType = data().deepCopy(fields()[1].schema(), other.rangeType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isProbability)) {
        this.isProbability = data().deepCopy(fields()[3].schema(), other.isProbability);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'distribution' field */
    public java.util.List<graphene.model.idl.G_Frequency> getDistribution() {
      return distribution;
    }
    
    /** Sets the value of the 'distribution' field */
    public graphene.model.idl.G_DistributionRange.Builder setDistribution(java.util.List<graphene.model.idl.G_Frequency> value) {
      validate(fields()[0], value);
      this.distribution = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'distribution' field has been set */
    public boolean hasDistribution() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'distribution' field */
    public graphene.model.idl.G_DistributionRange.Builder clearDistribution() {
      distribution = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'rangeType' field */
    public graphene.model.idl.G_RangeType getRangeType() {
      return rangeType;
    }
    
    /** Sets the value of the 'rangeType' field */
    public graphene.model.idl.G_DistributionRange.Builder setRangeType(graphene.model.idl.G_RangeType value) {
      validate(fields()[1], value);
      this.rangeType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'rangeType' field has been set */
    public boolean hasRangeType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'rangeType' field */
    public graphene.model.idl.G_DistributionRange.Builder clearRangeType() {
      rangeType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public graphene.model.idl.G_PropertyType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public graphene.model.idl.G_DistributionRange.Builder setType(graphene.model.idl.G_PropertyType value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public graphene.model.idl.G_DistributionRange.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'isProbability' field */
    public java.lang.Boolean getIsProbability() {
      return isProbability;
    }
    
    /** Sets the value of the 'isProbability' field */
    public graphene.model.idl.G_DistributionRange.Builder setIsProbability(boolean value) {
      validate(fields()[3], value);
      this.isProbability = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'isProbability' field has been set */
    public boolean hasIsProbability() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'isProbability' field */
    public graphene.model.idl.G_DistributionRange.Builder clearIsProbability() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public G_DistributionRange build() {
      try {
        G_DistributionRange record = new G_DistributionRange();
        record.distribution = fieldSetFlags()[0] ? this.distribution : (java.util.List<graphene.model.idl.G_Frequency>) defaultValue(fields()[0]);
        record.rangeType = fieldSetFlags()[1] ? this.rangeType : (graphene.model.idl.G_RangeType) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (graphene.model.idl.G_PropertyType) defaultValue(fields()[2]);
        record.isProbability = fieldSetFlags()[3] ? this.isProbability : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
