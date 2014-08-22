/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;  
@SuppressWarnings("all")
/** * The links in the social, financial, communications or other graphs. May
	 * represent communication events, financial transactions or social
	 * connections. */
@org.apache.avro.specific.AvroGenerated
public class G_Link extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"G_Link\",\"namespace\":\"graphene.model.idl\",\"doc\":\"* The links in the social, financial, communications or other graphs. May\\r\\n\\t * represent communication events, financial transactions or social\\r\\n\\t * connections.\",\"fields\":[{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"G_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a\\r\\n\\t * required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"G_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a\\r\\n\\t * required field in any service calls.\\r\\n\\t *\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"* Placeholder for now. Express original source confidence as a single\\r\\n\\t\\t * number from 0 to 1.\",\"default\":1},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"* For describing the nature of the uncertainty (source data, algorithm,\\r\\n\\t\\t * unit, etc)\",\"default\":null}]},\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Property\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type\\r\\n\\t * information, as well as optional provenance. Tags provide a way for the\\r\\n\\t * data provider to associate semantic annotations to each property in terms\\r\\n\\t * of the semantics of the application.\\r\\n\\t *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"* Single value\\r\\n\\t *\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"IMAGE\",\"URI\",\"OTHER\",\"REDACTED\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"* List of values\\r\\n\\t *\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\r\\n\\t *\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"* If true, range includes specified endpoint. If false, range is\\r\\n\\t\\t * exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\r\\n\\t *\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\r\\n\\t *\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\r\\n\\t *\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarized\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"* The type of value that the distribution describes. One of DOUBLE,\\r\\n\\t\\t * LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and\\r\\n\\t * application concepts, independent of the data sources. This allows\\r\\n\\t * application semantics to be re-used with new data, with a minimum of new\\r\\n\\t * software design and development. Data layer entity types, link types and\\r\\n\\t * properties should be mapped into the list of tags. The application layer\\r\\n\\t * must be able to search by native field name or by tag interchangeably,\\r\\n\\t * and properties returned must contain both native field names as well as\\r\\n\\t * tags.\\r\\n\\t * \\r\\n\\t * The list of tags may change as application features evolve, though that\\r\\n\\t * will require collaboration with the data layer providers. Evolving the\\r\\n\\t * tag list should not change the Data Access or Search APIs.\\r\\n\\t * \\r\\n\\t * This is the current list of tags for Properties:\\r\\n\\t * \\r\\n\\t *\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"VIDEO\",\"AUDIO\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\",\"REDACTED\"]}},\"doc\":\"* one or more tags from the Tag list, used to map this source-specific\\r\\n\\t\\t * field into the semantics of applications\"}]}}},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"G_RelationshipType\",\"doc\":\"* The 21st century meaning, \\\"conceal from unauthorized\\r\\n\\t\\t\\t\\t\\t\\t\\t * view; censor but do not destroy\\\"\",\"symbols\":[\"ISA\",\"SUPERSEDES\",\"HAS_ID\",\"MAY_BE_THE_SAME\",\"RELATED_TO_ID\",\"HAS_GLOBAL_ID\",\"OTHER_RELATION\",\"STARTED_ON\",\"ENDED_ON\",\"BORN_ON\",\"DIED_ON\",\"IN_REPORT\",\"IN_DOCUMENT\",\"IN_EVENT\",\"CREATOR_OF\",\"FRIEND_OF\",\"ENEMY_OF\",\"LOVES\",\"HATES\",\"KNOWS\",\"FAMILIAL_TIE\",\"KIN_OF\",\"GUARDIAN_OF\",\"FATHER_OF\",\"SON_OF\",\"MOTHER_OF\",\"DAUGHTER_OF\",\"BROTHER_OF\",\"SISTER_OF\",\"COUSIN_OF\",\"WIFE_OF\",\"HUSBAND_OF\",\"MARRIED_TO\",\"SKILL_OF\",\"PERSONAL_FACTOR_OF\",\"ATTRIBUTE_OF\",\"COMMUNICATION_ID_OF\",\"DEVICE_OF\",\"PROPER_NAME_OF\",\"USERNAME_OF\",\"ALIAS_OF\",\"ADDRESS_OF\",\"GEOLOCATION_OF\",\"CONTAINED_IN\",\"GOVERNMENT_ID_OF\",\"MEMBER_OF\",\"PART_OF\",\"COMMERCIAL_ID_OF\",\"HAS_PATRONAGE\",\"SELLER_OF\",\"BUYER_OF\",\"TRANSACTION\",\"PHYSICAL_PROPERTY_OF\",\"BIOLOGICAL_PROPERTY_OF\",\"GENETIC_TRAIT_OF\",\"PRECURSOR_OF\",\"DECAY_PRODUCT_OF\",\"ISOTOPE_OF\",\"USED_IN\",\"EFFECT_OF\",\"SENT\",\"RECEIVED\",\"PLACED_CALL\",\"RECEIVED_CALL\",\"SENT_MAIL\",\"EMAIL_FORWA","RD_OF\",\"EMAIL_REPLY_TO\",\"SENT_EMAIL\",\"EMAIL_TO\",\"EMAIL_BCC\",\"EMAIL_CC\",\"WORKED_ON\",\"WORKS_FOR\",\"EMPLOYEE_OF\",\"OWNER_OF\",\"INTERESTED_IN\",\"PARTICIPATED_IN\",\"WORKED_WITH\",\"MANAGES\",\"CONTROLS\",\"PEER_OF\",\"POSITIVELY_BENEFITS\",\"NEUTRALLY_BENEFITS\",\"NEGATIVELY_BENEFITS\",\"REDACTED\"]}},\"doc\":\"Link Tags\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** source entity uid */
   private java.lang.String source;
  /** target entity uid */
   private java.lang.String target;
  /** true if directed, false if undirected */
   private boolean directed;
   private graphene.model.idl.G_Provenance provenance;
   private graphene.model.idl.G_Uncertainty uncertainty;
   private java.util.List<graphene.model.idl.G_Property> properties;
  /** Link Tags */
   private java.util.List<graphene.model.idl.G_RelationshipType> tags;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public G_Link() {}

  /**
   * All-args constructor.
   */
  public G_Link(java.lang.String source, java.lang.String target, java.lang.Boolean directed, graphene.model.idl.G_Provenance provenance, graphene.model.idl.G_Uncertainty uncertainty, java.util.List<graphene.model.idl.G_Property> properties, java.util.List<graphene.model.idl.G_RelationshipType> tags) {
    this.source = source;
    this.target = target;
    this.directed = directed;
    this.provenance = provenance;
    this.uncertainty = uncertainty;
    this.properties = properties;
    this.tags = tags;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return source;
    case 1: return target;
    case 2: return directed;
    case 3: return provenance;
    case 4: return uncertainty;
    case 5: return properties;
    case 6: return tags;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: source = (java.lang.String)value$; break;
    case 1: target = (java.lang.String)value$; break;
    case 2: directed = (java.lang.Boolean)value$; break;
    case 3: provenance = (graphene.model.idl.G_Provenance)value$; break;
    case 4: uncertainty = (graphene.model.idl.G_Uncertainty)value$; break;
    case 5: properties = (java.util.List<graphene.model.idl.G_Property>)value$; break;
    case 6: tags = (java.util.List<graphene.model.idl.G_RelationshipType>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'source' field.
   * source entity uid   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * source entity uid   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'target' field.
   * target entity uid   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Sets the value of the 'target' field.
   * target entity uid   * @param value the value to set.
   */
  public void setTarget(java.lang.String value) {
    this.target = value;
  }

  /**
   * Gets the value of the 'directed' field.
   * true if directed, false if undirected   */
  public java.lang.Boolean getDirected() {
    return directed;
  }

  /**
   * Sets the value of the 'directed' field.
   * true if directed, false if undirected   * @param value the value to set.
   */
  public void setDirected(java.lang.Boolean value) {
    this.directed = value;
  }

  /**
   * Gets the value of the 'provenance' field.
   */
  public graphene.model.idl.G_Provenance getProvenance() {
    return provenance;
  }

  /**
   * Sets the value of the 'provenance' field.
   * @param value the value to set.
   */
  public void setProvenance(graphene.model.idl.G_Provenance value) {
    this.provenance = value;
  }

  /**
   * Gets the value of the 'uncertainty' field.
   */
  public graphene.model.idl.G_Uncertainty getUncertainty() {
    return uncertainty;
  }

  /**
   * Sets the value of the 'uncertainty' field.
   * @param value the value to set.
   */
  public void setUncertainty(graphene.model.idl.G_Uncertainty value) {
    this.uncertainty = value;
  }

  /**
   * Gets the value of the 'properties' field.
   */
  public java.util.List<graphene.model.idl.G_Property> getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * @param value the value to set.
   */
  public void setProperties(java.util.List<graphene.model.idl.G_Property> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * Link Tags   */
  public java.util.List<graphene.model.idl.G_RelationshipType> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * Link Tags   * @param value the value to set.
   */
  public void setTags(java.util.List<graphene.model.idl.G_RelationshipType> value) {
    this.tags = value;
  }

  /** Creates a new G_Link RecordBuilder */
  public static graphene.model.idl.G_Link.Builder newBuilder() {
    return new graphene.model.idl.G_Link.Builder();
  }
  
  /** Creates a new G_Link RecordBuilder by copying an existing Builder */
  public static graphene.model.idl.G_Link.Builder newBuilder(graphene.model.idl.G_Link.Builder other) {
    return new graphene.model.idl.G_Link.Builder(other);
  }
  
  /** Creates a new G_Link RecordBuilder by copying an existing G_Link instance */
  public static graphene.model.idl.G_Link.Builder newBuilder(graphene.model.idl.G_Link other) {
    return new graphene.model.idl.G_Link.Builder(other);
  }
  
  /**
   * RecordBuilder for G_Link instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<G_Link>
    implements org.apache.avro.data.RecordBuilder<G_Link> {

    private java.lang.String source;
    private java.lang.String target;
    private boolean directed;
    private graphene.model.idl.G_Provenance provenance;
    private graphene.model.idl.G_Uncertainty uncertainty;
    private java.util.List<graphene.model.idl.G_Property> properties;
    private java.util.List<graphene.model.idl.G_RelationshipType> tags;

    /** Creates a new Builder */
    private Builder() {
      super(graphene.model.idl.G_Link.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(graphene.model.idl.G_Link.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.source)) {
        this.source = data().deepCopy(fields()[0].schema(), other.source);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.target)) {
        this.target = data().deepCopy(fields()[1].schema(), other.target);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.directed)) {
        this.directed = data().deepCopy(fields()[2].schema(), other.directed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provenance)) {
        this.provenance = data().deepCopy(fields()[3].schema(), other.provenance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uncertainty)) {
        this.uncertainty = data().deepCopy(fields()[4].schema(), other.uncertainty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.properties)) {
        this.properties = data().deepCopy(fields()[5].schema(), other.properties);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tags)) {
        this.tags = data().deepCopy(fields()[6].schema(), other.tags);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing G_Link instance */
    private Builder(graphene.model.idl.G_Link other) {
            super(graphene.model.idl.G_Link.SCHEMA$);
      if (isValidValue(fields()[0], other.source)) {
        this.source = data().deepCopy(fields()[0].schema(), other.source);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.target)) {
        this.target = data().deepCopy(fields()[1].schema(), other.target);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.directed)) {
        this.directed = data().deepCopy(fields()[2].schema(), other.directed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.provenance)) {
        this.provenance = data().deepCopy(fields()[3].schema(), other.provenance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uncertainty)) {
        this.uncertainty = data().deepCopy(fields()[4].schema(), other.uncertainty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.properties)) {
        this.properties = data().deepCopy(fields()[5].schema(), other.properties);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tags)) {
        this.tags = data().deepCopy(fields()[6].schema(), other.tags);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'source' field */
    public java.lang.String getSource() {
      return source;
    }
    
    /** Sets the value of the 'source' field */
    public graphene.model.idl.G_Link.Builder setSource(java.lang.String value) {
      validate(fields()[0], value);
      this.source = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'source' field has been set */
    public boolean hasSource() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'source' field */
    public graphene.model.idl.G_Link.Builder clearSource() {
      source = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'target' field */
    public java.lang.String getTarget() {
      return target;
    }
    
    /** Sets the value of the 'target' field */
    public graphene.model.idl.G_Link.Builder setTarget(java.lang.String value) {
      validate(fields()[1], value);
      this.target = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'target' field has been set */
    public boolean hasTarget() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'target' field */
    public graphene.model.idl.G_Link.Builder clearTarget() {
      target = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'directed' field */
    public java.lang.Boolean getDirected() {
      return directed;
    }
    
    /** Sets the value of the 'directed' field */
    public graphene.model.idl.G_Link.Builder setDirected(boolean value) {
      validate(fields()[2], value);
      this.directed = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'directed' field has been set */
    public boolean hasDirected() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'directed' field */
    public graphene.model.idl.G_Link.Builder clearDirected() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'provenance' field */
    public graphene.model.idl.G_Provenance getProvenance() {
      return provenance;
    }
    
    /** Sets the value of the 'provenance' field */
    public graphene.model.idl.G_Link.Builder setProvenance(graphene.model.idl.G_Provenance value) {
      validate(fields()[3], value);
      this.provenance = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'provenance' field has been set */
    public boolean hasProvenance() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'provenance' field */
    public graphene.model.idl.G_Link.Builder clearProvenance() {
      provenance = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'uncertainty' field */
    public graphene.model.idl.G_Uncertainty getUncertainty() {
      return uncertainty;
    }
    
    /** Sets the value of the 'uncertainty' field */
    public graphene.model.idl.G_Link.Builder setUncertainty(graphene.model.idl.G_Uncertainty value) {
      validate(fields()[4], value);
      this.uncertainty = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'uncertainty' field has been set */
    public boolean hasUncertainty() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'uncertainty' field */
    public graphene.model.idl.G_Link.Builder clearUncertainty() {
      uncertainty = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'properties' field */
    public java.util.List<graphene.model.idl.G_Property> getProperties() {
      return properties;
    }
    
    /** Sets the value of the 'properties' field */
    public graphene.model.idl.G_Link.Builder setProperties(java.util.List<graphene.model.idl.G_Property> value) {
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
    public graphene.model.idl.G_Link.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'tags' field */
    public java.util.List<graphene.model.idl.G_RelationshipType> getTags() {
      return tags;
    }
    
    /** Sets the value of the 'tags' field */
    public graphene.model.idl.G_Link.Builder setTags(java.util.List<graphene.model.idl.G_RelationshipType> value) {
      validate(fields()[6], value);
      this.tags = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'tags' field has been set */
    public boolean hasTags() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'tags' field */
    public graphene.model.idl.G_Link.Builder clearTags() {
      tags = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public G_Link build() {
      try {
        G_Link record = new G_Link();
        record.source = fieldSetFlags()[0] ? this.source : (java.lang.String) defaultValue(fields()[0]);
        record.target = fieldSetFlags()[1] ? this.target : (java.lang.String) defaultValue(fields()[1]);
        record.directed = fieldSetFlags()[2] ? this.directed : (java.lang.Boolean) defaultValue(fields()[2]);
        record.provenance = fieldSetFlags()[3] ? this.provenance : (graphene.model.idl.G_Provenance) defaultValue(fields()[3]);
        record.uncertainty = fieldSetFlags()[4] ? this.uncertainty : (graphene.model.idl.G_Uncertainty) defaultValue(fields()[4]);
        record.properties = fieldSetFlags()[5] ? this.properties : (java.util.List<graphene.model.idl.G_Property>) defaultValue(fields()[5]);
        record.tags = fieldSetFlags()[6] ? this.tags : (java.util.List<graphene.model.idl.G_RelationshipType>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
