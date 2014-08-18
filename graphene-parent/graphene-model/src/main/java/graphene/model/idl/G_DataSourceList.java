/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class G_DataSourceList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_DataSourceList\",\"namespace\":\"graphene.model.idl\",\"fields\":[{\"name\":\"dataSources\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_DataSource\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"id of the data source\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"name of the data source\"},{\"name\":\"friendlyName\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"isEntity\",\"type\":\"boolean\",\"default\":true},{\"name\":\"isTransaction\",\"type\":\"boolean\",\"default\":true},{\"name\":\"dataSets\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_DataSet\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"name of the dataset\"},{\"name\":\"isEntity\",\"type\":\"boolean\",\"default\":true},{\"name\":\"isTransaction\",\"type\":\"boolean\",\"default\":true},{\"name\":\"fields\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_DataSetField\",\"doc\":\"* A field within a DataSet, which in turn is a real or virtual table within\\r\\n\\t * a DataSource. From Non Avro version by PWG.\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"name of the field\"},{\"name\":\"friendlyName\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"IMAGE\",\"URI\",\"OTHER\",\"REDACTED\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"sortable\",\"type\":\"boolean\",\"default\":true},{\"name\":\"searchable\",\"type\":\"boolean\",\"default\":true},{\"name\":\"reportable\",\"type\":\"boolean\",\"default\":true}]}}}]}}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.util.List<graphene.model.idl.G_DataSource> dataSources;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_DataSourceList() {}

  /**
   * All-args constructor.
   */
  public G_DataSourceList(java.util.List<graphene.model.idl.G_DataSource> dataSources) {
    this.dataSources = dataSources;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dataSources;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dataSources = (java.util.List<graphene.model.idl.G_DataSource>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dataSources' field.
   */
  public java.util.List<graphene.model.idl.G_DataSource> getDataSources() {
    return dataSources;
  }

  /**
   * Sets the value of the 'dataSources' field.
   * @param value the value to set.
   */
  public void setDataSources(java.util.List<graphene.model.idl.G_DataSource> value) {
    this.dataSources = value;
  }

  /** Creates a new G_DataSourceList RecordBuilder */
  public static graphene.model.idl.G_DataSourceList.Builder newBuilder() {
    return new graphene.model.idl.G_DataSourceList.Builder();
  }
  
  /** Creates a new G_DataSourceList RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_DataSourceList.Builder newBuilder(graphene.model.idl.G_DataSourceList.Builder other) {
    return new graphene.model.idl.G_DataSourceList.Builder(other);
  }
  
  /** Creates a new G_DataSourceList RecordBuilder by copying an existing G_DataSourceList instance */
  public static graphene.model.idl.G_DataSourceList.Builder newBuilder(graphene.model.idl.G_DataSourceList other) {
    return new graphene.model.idl.G_DataSourceList.Builder(other);
  }
  
  /**
   * RecordBuilder for G_DataSourceList instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_DataSourceList>
    implements org.apache.avro.data.RecordBuilder<G_DataSourceList> {

    private java.util.List<graphene.model.idl.G_DataSource> dataSources;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_DataSourceList.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_DataSourceList.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dataSources)) {
        this.dataSources = data().deepCopy(fields()[0].schema(), other.dataSources);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_DataSourceList instance */
    private Builder(graphene.model.idl.G_DataSourceList other) {
            super(graphene.model.idl.G_DataSourceList.SCHEMA$);
      if (isValidValue(fields()[0], other.dataSources)) {
        this.dataSources = data().deepCopy(fields()[0].schema(), other.dataSources);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'dataSources' field */
    public java.util.List<graphene.model.idl.G_DataSource> getDataSources() {
      return dataSources;
    }
    
    /** Sets the value of the 'dataSources' field */
    public graphene.model.idl.G_DataSourceList.Builder setDataSources(java.util.List<graphene.model.idl.G_DataSource> value) {
      validate(fields()[0], value);
      this.dataSources = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dataSources' field has been set */
    public boolean hasDataSources() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dataSources' field */
    public graphene.model.idl.G_DataSourceList.Builder clearDataSources() {
      dataSources = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public G_DataSourceList build() {
      try {
        G_DataSourceList record = new G_DataSourceList();
        record.dataSources = fieldSetFlags()[0] ? this.dataSources : (java.util.List<graphene.model.idl.G_DataSource>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}