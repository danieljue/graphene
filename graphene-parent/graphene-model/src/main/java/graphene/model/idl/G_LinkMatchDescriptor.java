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
/** * CHANGED in 1.5 - The PathMatchDescriptor was removed, and replaced with G_PathMatchTags,
	 *   which can be used as they key in a PropertyMatch Descriptor. Set these to require
	 *   certain path lengths or path time window matches. */
@org.apache.avro.specific.AvroGenerated
public class G_LinkMatchDescriptor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_LinkMatchDescriptor\",\"namespace\":\"graphene.model.idl\",\"doc\":\"* CHANGED in 1.5 - The PathMatchDescriptor was removed, and replaced with G_PathMatchTags,\\n\\t *   which can be used as they key in a PropertyMatch Descriptor. Set these to require\\n\\t *   certain path lengths or path time window matches.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The UID of the PATTERN link (NOT the underlying matched link ID). Will be referenced in results.\\n\\t\\t Cannot be null.\"},{\"name\":\"role\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Optional role name, for labeling the pattern for human understanding\",\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) \\n\\t\\t\\tBeing null indicates that matched links should have no source node\"},{\"name\":\"target\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) \\n\\t\\t\\tBeing null indicates that matched links should have no target node\"},{\"name\":\"tags\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_LinkTag\",\"doc\":\"This is the current list of tags for Links:\",\"symbols\":[\"FINANCIAL\",\"SOCIAL\",\"COMMUNICATION\",\"OTHER\"]}},\"null\"],\"doc\":\"entities should match AT LEAST ONE OF the given tags (e.g FINANCIAL, COMMUNICATION, SOCIAL), if provided\",\"default\":null},{\"name\":\"properties\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_PropertyMatchDescriptor\",\"doc\":\"A PropertyDescriptor is used to describe a possible property that can be present in an entity or link. It describes \\n\\t a single property that can be used in a property search. It can optionally include example or suggested values \\n\\t for searching on.\\n\\t \\n\\t CHANGED IN 1.8\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field name or G_PropertyTag (or G_PathMatchTag) that could be searched on\"},{\"name\":\"singletonRange\",\"type\":{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"Single value\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\n\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},\"doc\":\"value of the Property to search on\",\"default\":null},{\"name\":\"listRange\",\"type\":{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"List of values\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},\"default\":null},{\"name\":\"boundedRange\",\"type\":{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"Bounded or unbounded range values\\n\\t\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},\"default\":null},{\"name\":\"variable\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If not null/empty, the value is relative to a logical variable specified here (e.g. \\\"X\\\")\\n\\t\\t *  Other parameters using the same logical variable name are relative to this value.\\n\\t\\t *  For instance, for a {key=\\\"amount\\\", value=\\\"0.98\\\", variable=\\\"A\\\"} means that the value\\n\\t\\t *  of amount is 0.98A.  Another amount might be 0.55A, and the property match engine\\n\\t\\t *  (e.g. search engine, database query or pattern match algorithm) should understand\\n\\t\\t *  the relative values.\\n\\t\\t *  \\n\\t\\t *  If no variable is specified, then the value is an absolute number. For example,\\n\\t\\t *  {key=\\\"amount\\\", value=\\\"0.98\\\"} refers to an amount of exactly 0.98.\",\"default\":\"\"},{\"name\":\"weight\",\"type\":[\"float\",\"null\"],\"doc\":\"Relative importance of this match criteria, where the default is 1.0.\",\"default\":1.0},{\"name\":\"similarity\",\"type\":[\"float\",\"null\"],\"doc\":\"Require similarity for fuzzy searches, the default is null.\",\"default\":1.0},{\"name\":\"include\",\"type\":\"boolean\",\"doc\":\"If true, INCLUDE all values matching this descriptor. If false, EXCLUDE all values matching this descriptor.\",\"default\":true},{\"name\":\"constraint\",\"type\":[{\"type\":\"enum\",\"name\":\"G_Constraint\",\"doc\":\"Property value matching constraints\\n\\n\\t ADDED IN 1.8\",\"symbols\":[\"EQUALS\",\"NOT\",\"OPTIONAL_EQUALS\",\"LIKE\",\"CONTAINS\",\"ENDS_WITH\",\"REGEX\",\"STARTS_WITH\",\"BETWEEN\",\"FUZZY_PARTIAL_OPTIONAL\"]},\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"},{\"name\":\"typeMappings\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_TypeMapping\",\"doc\":\"Used to describe how an G_PropertyDescriptor maps to given a type.\\n\\n\\t\\tADDED IN 1.8\\n\\t *\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type that the mapping applies to *\"},{\"name\":\"memberKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field that the G_Property maps to in the type *\"}]}},\"doc\":\"List of type mappings to match in *\",\"default\":null}]}},\"null\"],\"doc\":\"entities should match ALL of the provided property descriptors (e.g. LABEL, etc), if provided\",\"default\":null},{\"name\":\"stage\",\"type\":\"int\",\"doc\":\"If not negative, indicates the relative order of events within the pattern. Need not be unique.\\n\\t\\t    If not provided, then transaction order must be inferred from the graph structure.\",\"default\":-1},{\"name\":\"constraint\",\"type\":[\"G_Constraint\",\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The UID of the PATTERN link (NOT the underlying matched link ID). Will be referenced in results.
		 Cannot be null. */
   private java.lang.String uid;
  /** Optional role name, for labeling the pattern for human understanding */
   private java.lang.String role;
  /** The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no source node */
   private java.lang.String source;
  /** The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no target node */
   private java.lang.String target;
  /** entities should match AT LEAST ONE OF the given tags (e.g FINANCIAL, COMMUNICATION, SOCIAL), if provided */
   private java.util.List<graphene.model.idl.G_LinkTag> tags;
  /** entities should match ALL of the provided property descriptors (e.g. LABEL, etc), if provided */
   private java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties;
  /** If not negative, indicates the relative order of events within the pattern. Need not be unique.
		    If not provided, then transaction order must be inferred from the graph structure. */
   private int stage;
  /** MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT */
   private graphene.model.idl.G_Constraint constraint;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_LinkMatchDescriptor() {}

  /**
   * All-args constructor.
   */
  public G_LinkMatchDescriptor(java.lang.String uid, java.lang.String role, java.lang.String source, java.lang.String target, java.util.List<graphene.model.idl.G_LinkTag> tags, java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties, java.lang.Integer stage, graphene.model.idl.G_Constraint constraint) {
    this.uid = uid;
    this.role = role;
    this.source = source;
    this.target = target;
    this.tags = tags;
    this.properties = properties;
    this.stage = stage;
    this.constraint = constraint;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return role;
    case 2: return source;
    case 3: return target;
    case 4: return tags;
    case 5: return properties;
    case 6: return stage;
    case 7: return constraint;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.String)value$; break;
    case 1: role = (java.lang.String)value$; break;
    case 2: source = (java.lang.String)value$; break;
    case 3: target = (java.lang.String)value$; break;
    case 4: tags = (java.util.List<graphene.model.idl.G_LinkTag>)value$; break;
    case 5: properties = (java.util.List<graphene.model.idl.G_PropertyMatchDescriptor>)value$; break;
    case 6: stage = (java.lang.Integer)value$; break;
    case 7: constraint = (graphene.model.idl.G_Constraint)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * The UID of the PATTERN link (NOT the underlying matched link ID). Will be referenced in results.
		 Cannot be null.   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * The UID of the PATTERN link (NOT the underlying matched link ID). Will be referenced in results.
		 Cannot be null.   * @param value the value to set.
   */
  public void setUid(java.lang.String value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'role' field.
   * Optional role name, for labeling the pattern for human understanding   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Sets the value of the 'role' field.
   * Optional role name, for labeling the pattern for human understanding   * @param value the value to set.
   */
  public void setRole(java.lang.String value) {
    this.role = value;
  }

  /**
   * Gets the value of the 'source' field.
   * The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no source node   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no source node   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'target' field.
   * The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no target node   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Sets the value of the 'target' field.
   * The UID of a G_EntityMatchDescriptor node (not an underlying Entity UID) 
			Being null indicates that matched links should have no target node   * @param value the value to set.
   */
  public void setTarget(java.lang.String value) {
    this.target = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * entities should match AT LEAST ONE OF the given tags (e.g FINANCIAL, COMMUNICATION, SOCIAL), if provided   */
  public java.util.List<graphene.model.idl.G_LinkTag> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * entities should match AT LEAST ONE OF the given tags (e.g FINANCIAL, COMMUNICATION, SOCIAL), if provided   * @param value the value to set.
   */
  public void setTags(java.util.List<graphene.model.idl.G_LinkTag> value) {
    this.tags = value;
  }

  /**
   * Gets the value of the 'properties' field.
   * entities should match ALL of the provided property descriptors (e.g. LABEL, etc), if provided   */
  public java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * entities should match ALL of the provided property descriptors (e.g. LABEL, etc), if provided   * @param value the value to set.
   */
  public void setProperties(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'stage' field.
   * If not negative, indicates the relative order of events within the pattern. Need not be unique.
		    If not provided, then transaction order must be inferred from the graph structure.   */
  public java.lang.Integer getStage() {
    return stage;
  }

  /**
   * Sets the value of the 'stage' field.
   * If not negative, indicates the relative order of events within the pattern. Need not be unique.
		    If not provided, then transaction order must be inferred from the graph structure.   * @param value the value to set.
   */
  public void setStage(java.lang.Integer value) {
    this.stage = value;
  }

  /**
   * Gets the value of the 'constraint' field.
   * MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT   */
  public graphene.model.idl.G_Constraint getConstraint() {
    return constraint;
  }

  /**
   * Sets the value of the 'constraint' field.
   * MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT   * @param value the value to set.
   */
  public void setConstraint(graphene.model.idl.G_Constraint value) {
    this.constraint = value;
  }

  /** Creates a new G_LinkMatchDescriptor RecordBuilder */
  public static graphene.model.idl.G_LinkMatchDescriptor.Builder newBuilder() {
    return new graphene.model.idl.G_LinkMatchDescriptor.Builder();
  }
  
  /** Creates a new G_LinkMatchDescriptor RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_LinkMatchDescriptor.Builder newBuilder(graphene.model.idl.G_LinkMatchDescriptor.Builder other) {
    return new graphene.model.idl.G_LinkMatchDescriptor.Builder(other);
  }
  
  /** Creates a new G_LinkMatchDescriptor RecordBuilder by copying an existing G_LinkMatchDescriptor instance */
  public static graphene.model.idl.G_LinkMatchDescriptor.Builder newBuilder(graphene.model.idl.G_LinkMatchDescriptor other) {
    return new graphene.model.idl.G_LinkMatchDescriptor.Builder(other);
  }
  
  /**
   * RecordBuilder for G_LinkMatchDescriptor instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_LinkMatchDescriptor>
    implements org.apache.avro.data.RecordBuilder<G_LinkMatchDescriptor> {

    private java.lang.String uid;
    private java.lang.String role;
    private java.lang.String source;
    private java.lang.String target;
    private java.util.List<graphene.model.idl.G_LinkTag> tags;
    private java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties;
    private int stage;
    private graphene.model.idl.G_Constraint constraint;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_LinkMatchDescriptor.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_LinkMatchDescriptor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.target)) {
        this.target = data().deepCopy(fields()[3].schema(), other.target);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tags)) {
        this.tags = data().deepCopy(fields()[4].schema(), other.tags);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.properties)) {
        this.properties = data().deepCopy(fields()[5].schema(), other.properties);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.stage)) {
        this.stage = data().deepCopy(fields()[6].schema(), other.stage);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.constraint)) {
        this.constraint = data().deepCopy(fields()[7].schema(), other.constraint);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_LinkMatchDescriptor instance */
    private Builder(graphene.model.idl.G_LinkMatchDescriptor other) {
            super(graphene.model.idl.G_LinkMatchDescriptor.SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.target)) {
        this.target = data().deepCopy(fields()[3].schema(), other.target);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tags)) {
        this.tags = data().deepCopy(fields()[4].schema(), other.tags);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.properties)) {
        this.properties = data().deepCopy(fields()[5].schema(), other.properties);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.stage)) {
        this.stage = data().deepCopy(fields()[6].schema(), other.stage);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.constraint)) {
        this.constraint = data().deepCopy(fields()[7].schema(), other.constraint);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'uid' field */
    public java.lang.String getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setUid(java.lang.String value) {
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
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'role' field */
    public java.lang.String getRole() {
      return role;
    }
    
    /** Sets the value of the 'role' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setRole(java.lang.String value) {
      validate(fields()[1], value);
      this.role = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'role' field has been set */
    public boolean hasRole() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'role' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearRole() {
      role = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'source' field */
    public java.lang.String getSource() {
      return source;
    }
    
    /** Sets the value of the 'source' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setSource(java.lang.String value) {
      validate(fields()[2], value);
      this.source = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'source' field has been set */
    public boolean hasSource() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'source' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearSource() {
      source = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'target' field */
    public java.lang.String getTarget() {
      return target;
    }
    
    /** Sets the value of the 'target' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setTarget(java.lang.String value) {
      validate(fields()[3], value);
      this.target = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'target' field has been set */
    public boolean hasTarget() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'target' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearTarget() {
      target = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'tags' field */
    public java.util.List<graphene.model.idl.G_LinkTag> getTags() {
      return tags;
    }
    
    /** Sets the value of the 'tags' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setTags(java.util.List<graphene.model.idl.G_LinkTag> value) {
      validate(fields()[4], value);
      this.tags = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'tags' field has been set */
    public boolean hasTags() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'tags' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearTags() {
      tags = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'properties' field */
    public java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> getProperties() {
      return properties;
    }
    
    /** Sets the value of the 'properties' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setProperties(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> value) {
      validate(fields()[5], value);
      this.properties = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'properties' field has been set */
    public boolean hasProperties() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'properties' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'stage' field */
    public java.lang.Integer getStage() {
      return stage;
    }
    
    /** Sets the value of the 'stage' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setStage(int value) {
      validate(fields()[6], value);
      this.stage = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'stage' field has been set */
    public boolean hasStage() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'stage' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearStage() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'constraint' field */
    public graphene.model.idl.G_Constraint getConstraint() {
      return constraint;
    }
    
    /** Sets the value of the 'constraint' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder setConstraint(graphene.model.idl.G_Constraint value) {
      validate(fields()[7], value);
      this.constraint = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'constraint' field has been set */
    public boolean hasConstraint() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'constraint' field */
    public graphene.model.idl.G_LinkMatchDescriptor.Builder clearConstraint() {
      constraint = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public G_LinkMatchDescriptor build() {
      try {
        G_LinkMatchDescriptor record = new G_LinkMatchDescriptor();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.String) defaultValue(fields()[0]);
        record.role = fieldSetFlags()[1] ? this.role : (java.lang.String) defaultValue(fields()[1]);
        record.source = fieldSetFlags()[2] ? this.source : (java.lang.String) defaultValue(fields()[2]);
        record.target = fieldSetFlags()[3] ? this.target : (java.lang.String) defaultValue(fields()[3]);
        record.tags = fieldSetFlags()[4] ? this.tags : (java.util.List<graphene.model.idl.G_LinkTag>) defaultValue(fields()[4]);
        record.properties = fieldSetFlags()[5] ? this.properties : (java.util.List<graphene.model.idl.G_PropertyMatchDescriptor>) defaultValue(fields()[5]);
        record.stage = fieldSetFlags()[6] ? this.stage : (java.lang.Integer) defaultValue(fields()[6]);
        record.constraint = fieldSetFlags()[7] ? this.constraint : (graphene.model.idl.G_Constraint) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
