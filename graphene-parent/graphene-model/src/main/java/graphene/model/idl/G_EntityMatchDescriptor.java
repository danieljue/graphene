/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** Description of entity match criteria within a pattern.
	 
	 CHANGED IN 1.5:
	  - removed sameAs
	  - replaced weight with constraint */
@org.apache.avro.specific.AvroGenerated
public class G_EntityMatchDescriptor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_EntityMatchDescriptor\",\"namespace\":\"graphene.model.idl\",\"doc\":\"Description of entity match criteria within a pattern.\\r\\n\\t \\r\\n\\t CHANGED IN 1.5:\\r\\n\\t  - removed sameAs\\r\\n\\t  - replaced weight with constraint\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The UID of the PATTERN node (NOT the underlying matched entity ID).\\r\\n\\t\\t Will be referenced by G_LinkMatchDescriptors as source or target, and in results.\\r\\n\\t\\t Cannot be null.\"},{\"name\":\"role\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Optional role name, for labeling the pattern for human understanding\",\"default\":null},{\"name\":\"entities\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"],\"doc\":\"entities should match AT LEAST ONE OF the given entity IDs, if provided\",\"default\":null},{\"name\":\"tags\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_EntityTag\",\"doc\":\"This is the current list of tags for Entities:\\r\\n\\t \\r\\n\\t CHANGED in 1.6:\\r\\n\\t   - added ACCOUNT_OWNER, CLUSTER_SUMMARY\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"CLUSTER_SUMMARY\",\"FILE\",\"ANONYMOUS\",\"PROMPT_FOR_DETAILS\",\"OTHER\"]}},\"null\"],\"doc\":\"entities should match AT LEAST ONE OF the given tags (e.g ACCOUNT), if provided\",\"default\":null},{\"name\":\"properties\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_PropertyMatchDescriptor\",\"doc\":\"A PropertyDescriptor is used to describe a possible property that can be present in an entity or link. It describes \\r\\n\\t a single property that can be used in a property search. It can optionally include example or suggested values \\r\\n\\t for searching on.\\r\\n\\t \\r\\n\\t CHANGED IN 1.5\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field name or G_PropertyTag (or G_PathMatchTag) that could be searched on\"},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"Single value\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\r\\n\\r\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"List of values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"Bounded or unbounded range values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]}],\"doc\":\"value of the Property to search on\",\"default\":null},{\"name\":\"variable\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If not null/empty, the value is relative to a logical variable specified here (e.g. \\\"X\\\")\\r\\n\\t\\t *  Other parameters using the same logical variable name are relative to this value.\\r\\n\\t\\t *  For instance, for a {key=\\\"amount\\\", value=\\\"0.98\\\", variable=\\\"A\\\"} means that the value\\r\\n\\t\\t *  of amount is 0.98A.  Another amount might be 0.55A, and the property match engine\\r\\n\\t\\t *  (e.g. search engine, database query or pattern match algorithm) should understand\\r\\n\\t\\t *  the relative values.\\r\\n\\t\\t *  \\r\\n\\t\\t *  If no variable is specified, then the value is an absolute number. For example,\\r\\n\\t\\t *  {key=\\\"amount\\\", value=\\\"0.98\\\"} refers to an amount of exactly 0.98.\",\"default\":\"\"},{\"name\":\"weight\",\"type\":[\"float\",\"null\"],\"doc\":\"Relative importance of this match criteria, where the default is 1.0.\",\"default\":1.0},{\"name\":\"similarity\",\"type\":[\"float\",\"null\"],\"doc\":\"Require similarity for fuzzy searches, the default is null.\",\"default\":1.0},{\"name\":\"include\",\"type\":\"boolean\",\"doc\":\"If true, INCLUDE all values matching this descriptor. If false, EXCLUDE all values matching this descriptor.\",\"default\":true},{\"name\":\"constraint\",\"type\":[{\"type\":\"enum\",\"name\":\"G_Constraint\",\"doc\":\"Property value matching constraints\\r\\n\\r\\n\\t CHANGED IN 1.5\",\"symbols\":[\"REQUIRED_EQUALS\",\"FUZZY_PARTIAL_OPTIONAL\",\"NOT\",\"OPTIONAL_EQUALS\",\"FUZZY_REQUIRED\"]},\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"}]}},\"null\"],\"doc\":\"entities should match ALL of the provided property descriptors (e.g. LABEL, GEO, etc)\\r\\n\\t\\t    e.g. logical \\\"AND\\\". Partial matches may be returned, if scoring is provided.\",\"default\":null},{\"name\":\"examplars\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"],\"doc\":\"used for QBE -- not used to match like the entities list, this list of entities\\r\\n\\t\\t    should be used by the system to infer the above constraints when the user does not\\r\\n\\t\\t    provide them.\",\"default\":null},{\"name\":\"constraint\",\"type\":[\"G_Constraint\",\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The UID of the PATTERN node (NOT the underlying matched entity ID).
		 Will be referenced by G_LinkMatchDescriptors as source or target, and in results.
		 Cannot be null. */
   private java.lang.String uid;
  /** Optional role name, for labeling the pattern for human understanding */
   private java.lang.String role;
  /** entities should match AT LEAST ONE OF the given entity IDs, if provided */
   private java.util.List<java.lang.String> entities;
  /** entities should match AT LEAST ONE OF the given tags (e.g ACCOUNT), if provided */
   private java.util.List<graphene.model.idl.G_EntityTag> tags;
  /** entities should match ALL of the provided property descriptors (e.g. LABEL, GEO, etc)
		    e.g. logical "AND". Partial matches may be returned, if scoring is provided. */
   private java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties;
  /** used for QBE -- not used to match like the entities list, this list of entities
		    should be used by the system to infer the above constraints when the user does not
		    provide them. */
   private java.util.List<java.lang.String> examplars;
  /** MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT */
   private graphene.model.idl.G_Constraint constraint;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_EntityMatchDescriptor() {}

  /**
   * All-args constructor.
   */
  public G_EntityMatchDescriptor(java.lang.String uid, java.lang.String role, java.util.List<java.lang.String> entities, java.util.List<graphene.model.idl.G_EntityTag> tags, java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties, java.util.List<java.lang.String> examplars, graphene.model.idl.G_Constraint constraint) {
    this.uid = uid;
    this.role = role;
    this.entities = entities;
    this.tags = tags;
    this.properties = properties;
    this.examplars = examplars;
    this.constraint = constraint;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return role;
    case 2: return entities;
    case 3: return tags;
    case 4: return properties;
    case 5: return examplars;
    case 6: return constraint;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.String)value$; break;
    case 1: role = (java.lang.String)value$; break;
    case 2: entities = (java.util.List<java.lang.String>)value$; break;
    case 3: tags = (java.util.List<graphene.model.idl.G_EntityTag>)value$; break;
    case 4: properties = (java.util.List<graphene.model.idl.G_PropertyMatchDescriptor>)value$; break;
    case 5: examplars = (java.util.List<java.lang.String>)value$; break;
    case 6: constraint = (graphene.model.idl.G_Constraint)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * The UID of the PATTERN node (NOT the underlying matched entity ID).
		 Will be referenced by G_LinkMatchDescriptors as source or target, and in results.
		 Cannot be null.   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * The UID of the PATTERN node (NOT the underlying matched entity ID).
		 Will be referenced by G_LinkMatchDescriptors as source or target, and in results.
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
   * Gets the value of the 'entities' field.
   * entities should match AT LEAST ONE OF the given entity IDs, if provided   */
  public java.util.List<java.lang.String> getEntities() {
    return entities;
  }

  /**
   * Sets the value of the 'entities' field.
   * entities should match AT LEAST ONE OF the given entity IDs, if provided   * @param value the value to set.
   */
  public void setEntities(java.util.List<java.lang.String> value) {
    this.entities = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * entities should match AT LEAST ONE OF the given tags (e.g ACCOUNT), if provided   */
  public java.util.List<graphene.model.idl.G_EntityTag> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * entities should match AT LEAST ONE OF the given tags (e.g ACCOUNT), if provided   * @param value the value to set.
   */
  public void setTags(java.util.List<graphene.model.idl.G_EntityTag> value) {
    this.tags = value;
  }

  /**
   * Gets the value of the 'properties' field.
   * entities should match ALL of the provided property descriptors (e.g. LABEL, GEO, etc)
		    e.g. logical "AND". Partial matches may be returned, if scoring is provided.   */
  public java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * entities should match ALL of the provided property descriptors (e.g. LABEL, GEO, etc)
		    e.g. logical "AND". Partial matches may be returned, if scoring is provided.   * @param value the value to set.
   */
  public void setProperties(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'examplars' field.
   * used for QBE -- not used to match like the entities list, this list of entities
		    should be used by the system to infer the above constraints when the user does not
		    provide them.   */
  public java.util.List<java.lang.String> getExamplars() {
    return examplars;
  }

  /**
   * Sets the value of the 'examplars' field.
   * used for QBE -- not used to match like the entities list, this list of entities
		    should be used by the system to infer the above constraints when the user does not
		    provide them.   * @param value the value to set.
   */
  public void setExamplars(java.util.List<java.lang.String> value) {
    this.examplars = value;
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

  /** Creates a new G_EntityMatchDescriptor RecordBuilder */
  public static graphene.model.idl.G_EntityMatchDescriptor.Builder newBuilder() {
    return new graphene.model.idl.G_EntityMatchDescriptor.Builder();
  }
  
  /** Creates a new G_EntityMatchDescriptor RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_EntityMatchDescriptor.Builder newBuilder(graphene.model.idl.G_EntityMatchDescriptor.Builder other) {
    return new graphene.model.idl.G_EntityMatchDescriptor.Builder(other);
  }
  
  /** Creates a new G_EntityMatchDescriptor RecordBuilder by copying an existing G_EntityMatchDescriptor instance */
  public static graphene.model.idl.G_EntityMatchDescriptor.Builder newBuilder(graphene.model.idl.G_EntityMatchDescriptor other) {
    return new graphene.model.idl.G_EntityMatchDescriptor.Builder(other);
  }
  
  /**
   * RecordBuilder for G_EntityMatchDescriptor instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_EntityMatchDescriptor>
    implements org.apache.avro.data.RecordBuilder<G_EntityMatchDescriptor> {

    private java.lang.String uid;
    private java.lang.String role;
    private java.util.List<java.lang.String> entities;
    private java.util.List<graphene.model.idl.G_EntityTag> tags;
    private java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> properties;
    private java.util.List<java.lang.String> examplars;
    private graphene.model.idl.G_Constraint constraint;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_EntityMatchDescriptor.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_EntityMatchDescriptor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.entities)) {
        this.entities = data().deepCopy(fields()[2].schema(), other.entities);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tags)) {
        this.tags = data().deepCopy(fields()[3].schema(), other.tags);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.properties)) {
        this.properties = data().deepCopy(fields()[4].schema(), other.properties);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.examplars)) {
        this.examplars = data().deepCopy(fields()[5].schema(), other.examplars);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.constraint)) {
        this.constraint = data().deepCopy(fields()[6].schema(), other.constraint);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_EntityMatchDescriptor instance */
    private Builder(graphene.model.idl.G_EntityMatchDescriptor other) {
            super(graphene.model.idl.G_EntityMatchDescriptor.SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.entities)) {
        this.entities = data().deepCopy(fields()[2].schema(), other.entities);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tags)) {
        this.tags = data().deepCopy(fields()[3].schema(), other.tags);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.properties)) {
        this.properties = data().deepCopy(fields()[4].schema(), other.properties);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.examplars)) {
        this.examplars = data().deepCopy(fields()[5].schema(), other.examplars);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.constraint)) {
        this.constraint = data().deepCopy(fields()[6].schema(), other.constraint);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'uid' field */
    public java.lang.String getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setUid(java.lang.String value) {
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
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'role' field */
    public java.lang.String getRole() {
      return role;
    }
    
    /** Sets the value of the 'role' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setRole(java.lang.String value) {
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
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearRole() {
      role = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'entities' field */
    public java.util.List<java.lang.String> getEntities() {
      return entities;
    }
    
    /** Sets the value of the 'entities' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setEntities(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.entities = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'entities' field has been set */
    public boolean hasEntities() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'entities' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearEntities() {
      entities = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'tags' field */
    public java.util.List<graphene.model.idl.G_EntityTag> getTags() {
      return tags;
    }
    
    /** Sets the value of the 'tags' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setTags(java.util.List<graphene.model.idl.G_EntityTag> value) {
      validate(fields()[3], value);
      this.tags = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'tags' field has been set */
    public boolean hasTags() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'tags' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearTags() {
      tags = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'properties' field */
    public java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> getProperties() {
      return properties;
    }
    
    /** Sets the value of the 'properties' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setProperties(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> value) {
      validate(fields()[4], value);
      this.properties = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'properties' field has been set */
    public boolean hasProperties() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'properties' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'examplars' field */
    public java.util.List<java.lang.String> getExamplars() {
      return examplars;
    }
    
    /** Sets the value of the 'examplars' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setExamplars(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.examplars = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'examplars' field has been set */
    public boolean hasExamplars() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'examplars' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearExamplars() {
      examplars = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'constraint' field */
    public graphene.model.idl.G_Constraint getConstraint() {
      return constraint;
    }
    
    /** Sets the value of the 'constraint' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder setConstraint(graphene.model.idl.G_Constraint value) {
      validate(fields()[6], value);
      this.constraint = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'constraint' field has been set */
    public boolean hasConstraint() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'constraint' field */
    public graphene.model.idl.G_EntityMatchDescriptor.Builder clearConstraint() {
      constraint = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public G_EntityMatchDescriptor build() {
      try {
        G_EntityMatchDescriptor record = new G_EntityMatchDescriptor();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.String) defaultValue(fields()[0]);
        record.role = fieldSetFlags()[1] ? this.role : (java.lang.String) defaultValue(fields()[1]);
        record.entities = fieldSetFlags()[2] ? this.entities : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.tags = fieldSetFlags()[3] ? this.tags : (java.util.List<graphene.model.idl.G_EntityTag>) defaultValue(fields()[3]);
        record.properties = fieldSetFlags()[4] ? this.properties : (java.util.List<graphene.model.idl.G_PropertyMatchDescriptor>) defaultValue(fields()[4]);
        record.examplars = fieldSetFlags()[5] ? this.examplars : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.constraint = fieldSetFlags()[6] ? this.constraint : (graphene.model.idl.G_Constraint) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
