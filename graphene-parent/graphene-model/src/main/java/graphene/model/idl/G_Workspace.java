/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class G_Workspace extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_Workspace\",\"namespace\":\"graphene.model.idl\",\"fields\":[{\"name\":\"active\",\"type\":\"boolean\",\"default\":true},{\"name\":\"description\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":null},{\"name\":\"reports\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":null},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"untitled\"},{\"name\":\"savedReports\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_ReportViewEvent\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"reportId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"reportType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"reportPageLink\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeInitiated\",\"type\":\"long\"},{\"name\":\"userId\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":\"None\"},{\"name\":\"userName\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":\"None\"}]}}},{\"name\":\"queryObjects\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_EntityQuery\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"targetSchema\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"firstResult\",\"type\":\"long\",\"default\":0},{\"name\":\"maxResult\",\"type\":\"long\",\"default\":0},{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"None\"},{\"name\":\"username\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"None\"},{\"name\":\"timeInitiated\",\"type\":\"long\"},{\"name\":\"propertyMatchDescriptors\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_PropertyMatchDescriptor\",\"doc\":\"A PropertyDescriptor is used to describe a possible property that can be present in an entity or link. It describes \\r\\n\\t a single property that can be used in a property search. It can optionally include example or suggested values \\r\\n\\t for searching on.\\r\\n\\t \\r\\n\\t CHANGED IN 1.8\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field name or G_PropertyTag (or G_PathMatchTag) that could be searched on\"},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"Single value\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\r\\n\\r\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"List of values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"Bounded or unbounded range values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]}],\"doc\":\"value of the Property to search on\",\"default\":null},{\"name\":\"variable\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If not null/empty, the value is relative to a logical variable specified here (e.g. \\\"X\\\")\\r\\n\\t\\t *  Other parameters using the same logical variable name are relative to this value.\\r\\n\\t\\t *  For instance, for a {key=\\\"amount\\\", value=\\\"0.98\\\", variable=\\\"A\\\"} means that the value\\r\\n\\t\\t *  of amount is 0.98A.  Another amount might be 0.55A, and the property match engine\\r\\n\\t\\t *  (e.g. search engine, database query or pattern match algorithm) should understand\\r\\n\\t\\t *  the relative values.\\r\\n\\t\\t *  \\r\\n\\t\\t *  If no variable is specified, then the value is an absolute number. For example,\\r\\n\\t\\t *  {key=\\\"amount\\\", value=\\\"0.98\\\"} refers to an amount of exactly 0.98.\",\"default\":\"\"},{\"name\":\"weight\",\"type\":[\"float\",\"null\"],\"doc\":\"Relative importance of this match criteria, where the default is 1.0.\",\"default\":1.0},{\"name\":\"similarity\",\"type\":[\"float\",\"null\"],\"doc\":\"Require similarity for fuzzy searches, the default is null.\",\"default\":1.0},{\"name\":\"include\",\"type\":\"boolean\",\"doc\":\"If true, INCLUDE all values matching this descriptor. If false, EXCLUDE all values matching this descriptor.\",\"default\":true},{\"name\":\"constraint\",\"type\":[{\"type\":\"enum\",\"name\":\"G_Constraint\",\"doc\":\"Property value matching constraints\\r\\n\\r\\n\\t ADDED IN 1.8\",\"symbols\":[\"REQUIRED_EQUALS\",\"FUZZY_PARTIAL_OPTIONAL\",\"NOT\",\"OPTIONAL_EQUALS\",\"FUZZY_REQUIRED\",\"COMPARE_CONTAINS\",\"COMPARE_ENDSWITH\",\"COMPARE_EQUALS\",\"COMPARE_GREATER\",\"COMPARE_INCLUDE\",\"COMPARE_LESS\",\"COMPARE_NOTINCLUDE\",\"COMPARE_REGEX\",\"COMPARE_SIMPLE\",\"COMPARE_SOUNDSLIKE\",\"COMPARE_STARTSWITH\"]},\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"},{\"name\":\"typeMappings\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_TypeMapping\",\"doc\":\"Used to describe how an G_PropertyDescriptor maps to given a type.\\r\\n\\r\\n\\t\\tADDED IN 1.8\\r\\n\\t *\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type that the mapping applies to *\"},{\"name\":\"memberKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field that the G_Property maps to in the type *\"}]}},\"doc\":\"List of type mappings to match in *\",\"default\":null}]}}],\"default\":null},{\"name\":\"caseSensitive\",\"type\":\"boolean\",\"default\":false},{\"name\":\"searchFreeText\",\"type\":\"boolean\",\"default\":false},{\"name\":\"minimumScore\",\"type\":\"double\",\"default\":0.25},{\"name\":\"initiatorId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"modified\",\"type\":\"long\",\"doc\":\"workspace's modified datetime\",\"default\":0},{\"name\":\"created\",\"type\":\"long\",\"doc\":\"workspace's created datetime\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private boolean active;
   private java.lang.String description;
   private java.lang.String reports;
   private java.lang.String title;
   private java.util.List<graphene.model.idl.G_ReportViewEvent> savedReports;
   private java.util.List<graphene.model.idl.G_EntityQuery> queryObjects;
   private java.lang.String id;
  /** workspace's modified datetime */
   private long modified;
  /** workspace's created datetime */
   private long created;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_Workspace() {}

  /**
   * All-args constructor.
   */
  public G_Workspace(java.lang.Boolean active, java.lang.String description, java.lang.String reports, java.lang.String title, java.util.List<graphene.model.idl.G_ReportViewEvent> savedReports, java.util.List<graphene.model.idl.G_EntityQuery> queryObjects, java.lang.String id, java.lang.Long modified, java.lang.Long created) {
    this.active = active;
    this.description = description;
    this.reports = reports;
    this.title = title;
    this.savedReports = savedReports;
    this.queryObjects = queryObjects;
    this.id = id;
    this.modified = modified;
    this.created = created;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return active;
    case 1: return description;
    case 2: return reports;
    case 3: return title;
    case 4: return savedReports;
    case 5: return queryObjects;
    case 6: return id;
    case 7: return modified;
    case 8: return created;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: active = (java.lang.Boolean)value$; break;
    case 1: description = (java.lang.String)value$; break;
    case 2: reports = (java.lang.String)value$; break;
    case 3: title = (java.lang.String)value$; break;
    case 4: savedReports = (java.util.List<graphene.model.idl.G_ReportViewEvent>)value$; break;
    case 5: queryObjects = (java.util.List<graphene.model.idl.G_EntityQuery>)value$; break;
    case 6: id = (java.lang.String)value$; break;
    case 7: modified = (java.lang.Long)value$; break;
    case 8: created = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'active' field.
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(java.lang.Boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'reports' field.
   */
  public java.lang.String getReports() {
    return reports;
  }

  /**
   * Sets the value of the 'reports' field.
   * @param value the value to set.
   */
  public void setReports(java.lang.String value) {
    this.reports = value;
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'savedReports' field.
   */
  public java.util.List<graphene.model.idl.G_ReportViewEvent> getSavedReports() {
    return savedReports;
  }

  /**
   * Sets the value of the 'savedReports' field.
   * @param value the value to set.
   */
  public void setSavedReports(java.util.List<graphene.model.idl.G_ReportViewEvent> value) {
    this.savedReports = value;
  }

  /**
   * Gets the value of the 'queryObjects' field.
   */
  public java.util.List<graphene.model.idl.G_EntityQuery> getQueryObjects() {
    return queryObjects;
  }

  /**
   * Sets the value of the 'queryObjects' field.
   * @param value the value to set.
   */
  public void setQueryObjects(java.util.List<graphene.model.idl.G_EntityQuery> value) {
    this.queryObjects = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'modified' field.
   * workspace's modified datetime   */
  public java.lang.Long getModified() {
    return modified;
  }

  /**
   * Sets the value of the 'modified' field.
   * workspace's modified datetime   * @param value the value to set.
   */
  public void setModified(java.lang.Long value) {
    this.modified = value;
  }

  /**
   * Gets the value of the 'created' field.
   * workspace's created datetime   */
  public java.lang.Long getCreated() {
    return created;
  }

  /**
   * Sets the value of the 'created' field.
   * workspace's created datetime   * @param value the value to set.
   */
  public void setCreated(java.lang.Long value) {
    this.created = value;
  }

  /** Creates a new G_Workspace RecordBuilder */
  public static graphene.model.idl.G_Workspace.Builder newBuilder() {
    return new graphene.model.idl.G_Workspace.Builder();
  }
  
  /** Creates a new G_Workspace RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_Workspace.Builder newBuilder(graphene.model.idl.G_Workspace.Builder other) {
    return new graphene.model.idl.G_Workspace.Builder(other);
  }
  
  /** Creates a new G_Workspace RecordBuilder by copying an existing G_Workspace instance */
  public static graphene.model.idl.G_Workspace.Builder newBuilder(graphene.model.idl.G_Workspace other) {
    return new graphene.model.idl.G_Workspace.Builder(other);
  }
  
  /**
   * RecordBuilder for G_Workspace instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_Workspace>
    implements org.apache.avro.data.RecordBuilder<G_Workspace> {

    private boolean active;
    private java.lang.String description;
    private java.lang.String reports;
    private java.lang.String title;
    private java.util.List<graphene.model.idl.G_ReportViewEvent> savedReports;
    private java.util.List<graphene.model.idl.G_EntityQuery> queryObjects;
    private java.lang.String id;
    private long modified;
    private long created;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_Workspace.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_Workspace.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.reports)) {
        this.reports = data().deepCopy(fields()[2].schema(), other.reports);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.savedReports)) {
        this.savedReports = data().deepCopy(fields()[4].schema(), other.savedReports);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.queryObjects)) {
        this.queryObjects = data().deepCopy(fields()[5].schema(), other.queryObjects);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.modified)) {
        this.modified = data().deepCopy(fields()[7].schema(), other.modified);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.created)) {
        this.created = data().deepCopy(fields()[8].schema(), other.created);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_Workspace instance */
    private Builder(graphene.model.idl.G_Workspace other) {
            super(graphene.model.idl.G_Workspace.SCHEMA$);
      if (isValidValue(fields()[0], other.active)) {
        this.active = data().deepCopy(fields()[0].schema(), other.active);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.reports)) {
        this.reports = data().deepCopy(fields()[2].schema(), other.reports);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.savedReports)) {
        this.savedReports = data().deepCopy(fields()[4].schema(), other.savedReports);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.queryObjects)) {
        this.queryObjects = data().deepCopy(fields()[5].schema(), other.queryObjects);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.modified)) {
        this.modified = data().deepCopy(fields()[7].schema(), other.modified);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.created)) {
        this.created = data().deepCopy(fields()[8].schema(), other.created);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'active' field */
    public java.lang.Boolean getActive() {
      return active;
    }
    
    /** Sets the value of the 'active' field */
    public graphene.model.idl.G_Workspace.Builder setActive(boolean value) {
      validate(fields()[0], value);
      this.active = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'active' field has been set */
    public boolean hasActive() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'active' field */
    public graphene.model.idl.G_Workspace.Builder clearActive() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.String getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public graphene.model.idl.G_Workspace.Builder setDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'description' field */
    public graphene.model.idl.G_Workspace.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'reports' field */
    public java.lang.String getReports() {
      return reports;
    }
    
    /** Sets the value of the 'reports' field */
    public graphene.model.idl.G_Workspace.Builder setReports(java.lang.String value) {
      validate(fields()[2], value);
      this.reports = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'reports' field has been set */
    public boolean hasReports() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'reports' field */
    public graphene.model.idl.G_Workspace.Builder clearReports() {
      reports = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.String getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public graphene.model.idl.G_Workspace.Builder setTitle(java.lang.String value) {
      validate(fields()[3], value);
      this.title = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'title' field */
    public graphene.model.idl.G_Workspace.Builder clearTitle() {
      title = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'savedReports' field */
    public java.util.List<graphene.model.idl.G_ReportViewEvent> getSavedReports() {
      return savedReports;
    }
    
    /** Sets the value of the 'savedReports' field */
    public graphene.model.idl.G_Workspace.Builder setSavedReports(java.util.List<graphene.model.idl.G_ReportViewEvent> value) {
      validate(fields()[4], value);
      this.savedReports = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'savedReports' field has been set */
    public boolean hasSavedReports() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'savedReports' field */
    public graphene.model.idl.G_Workspace.Builder clearSavedReports() {
      savedReports = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'queryObjects' field */
    public java.util.List<graphene.model.idl.G_EntityQuery> getQueryObjects() {
      return queryObjects;
    }
    
    /** Sets the value of the 'queryObjects' field */
    public graphene.model.idl.G_Workspace.Builder setQueryObjects(java.util.List<graphene.model.idl.G_EntityQuery> value) {
      validate(fields()[5], value);
      this.queryObjects = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'queryObjects' field has been set */
    public boolean hasQueryObjects() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'queryObjects' field */
    public graphene.model.idl.G_Workspace.Builder clearQueryObjects() {
      queryObjects = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public graphene.model.idl.G_Workspace.Builder setId(java.lang.String value) {
      validate(fields()[6], value);
      this.id = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'id' field */
    public graphene.model.idl.G_Workspace.Builder clearId() {
      id = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'modified' field */
    public java.lang.Long getModified() {
      return modified;
    }
    
    /** Sets the value of the 'modified' field */
    public graphene.model.idl.G_Workspace.Builder setModified(long value) {
      validate(fields()[7], value);
      this.modified = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'modified' field has been set */
    public boolean hasModified() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'modified' field */
    public graphene.model.idl.G_Workspace.Builder clearModified() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'created' field */
    public java.lang.Long getCreated() {
      return created;
    }
    
    /** Sets the value of the 'created' field */
    public graphene.model.idl.G_Workspace.Builder setCreated(long value) {
      validate(fields()[8], value);
      this.created = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'created' field has been set */
    public boolean hasCreated() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'created' field */
    public graphene.model.idl.G_Workspace.Builder clearCreated() {
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public G_Workspace build() {
      try {
        G_Workspace record = new G_Workspace();
        record.active = fieldSetFlags()[0] ? this.active : (java.lang.Boolean) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
        record.reports = fieldSetFlags()[2] ? this.reports : (java.lang.String) defaultValue(fields()[2]);
        record.title = fieldSetFlags()[3] ? this.title : (java.lang.String) defaultValue(fields()[3]);
        record.savedReports = fieldSetFlags()[4] ? this.savedReports : (java.util.List<graphene.model.idl.G_ReportViewEvent>) defaultValue(fields()[4]);
        record.queryObjects = fieldSetFlags()[5] ? this.queryObjects : (java.util.List<graphene.model.idl.G_EntityQuery>) defaultValue(fields()[5]);
        record.id = fieldSetFlags()[6] ? this.id : (java.lang.String) defaultValue(fields()[6]);
        record.modified = fieldSetFlags()[7] ? this.modified : (java.lang.Long) defaultValue(fields()[7]);
        record.created = fieldSetFlags()[8] ? this.created : (java.lang.Long) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
