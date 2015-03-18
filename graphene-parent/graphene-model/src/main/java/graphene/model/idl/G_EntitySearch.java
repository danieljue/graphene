/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package graphene.model.idl;

@SuppressWarnings("all")
/**  */
@org.apache.avro.specific.AvroGenerated
public interface G_EntitySearch {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"G_EntitySearch\",\"namespace\":\"graphene.model.idl\",\"doc\":\"\",\"types\":[{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"doc\":\"Tags are defined by the application layer as a taxonomy of user and application concepts,\\r\\n\\t independent of the data sources. This allows application semantics to be re-used with new\\r\\n\\t data, with a minimum of new software design and development. Data layer entity types, link\\r\\n\\t types and properties should be mapped into the list of tags. The application layer must be\\r\\n\\t able to search by native field name or by tag interchangeably, and properties returned must\\r\\n\\t contain both native field names as well as tags.\\r\\n\\t \\r\\n\\t The list of tags may change as application features evolve, though that will require\\r\\n\\t collaboration with the data layer providers. Evolving the tag list should not change the\\r\\n\\t Data Access or Search APIs.\\r\\n\\r\\n\\t This is the current list of tags for Properties:\\r\\n\\t \\r\\n\\t CHANGED in 1.5:\\r\\n\\t   - CREDIT/DEBIT changed to INFLOWING/OUTFLOWING\\r\\n\\t   - added USD\\r\\n\\t   - added DURATION\\r\\n\\t   \\r\\n\\t CHANGED in 1.6:\\r\\n\\t   - added ENTITY_TYPE\\r\\n\\t   - added ACCOUNT_OWNER, CLUSTER_SUMMARY, COUNTRY_CODE\\r\\n\\t   \\r\\n\\t CHANGED in 1.7:\\r\\n\\t   - added CLUSTER\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"CLUSTER\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\"]},{\"type\":\"enum\",\"name\":\"G_EntityTag\",\"doc\":\"This is the current list of tags for Entities:\\r\\n\\t \\r\\n\\t CHANGED in 1.6:\\r\\n\\t   - added ACCOUNT_OWNER, CLUSTER_SUMMARY\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"CLUSTER_SUMMARY\",\"FILE\",\"ANONYMOUS\",\"PROMPT_FOR_DETAILS\",\"OTHER\"]},{\"type\":\"enum\",\"name\":\"G_LinkTag\",\"doc\":\"This is the current list of tags for Links:\",\"symbols\":[\"FINANCIAL\",\"SOCIAL\",\"COMMUNICATION\",\"OTHER\"]},{\"type\":\"enum\",\"name\":\"G_PropertyType\",\"doc\":\"Allowed types for Property values.\\r\\n\\r\\n\\t CHANGED in 1.5\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"OTHER\"]},{\"type\":\"record\",\"name\":\"G_Provenance\",\"doc\":\"This is a placeholder for future modeling of provenance. It is not a required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},{\"type\":\"record\",\"name\":\"G_Uncertainty\",\"doc\":\"This is a placeholder for future modeling of uncertainty. It is not a required field in any service calls.\\r\\n\\t\\r\\n\\tCHANGED IN 1.6\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express original source confidence as a single number from 0 to 1.\",\"default\":1},{\"name\":\"currency\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express confidence in currency of data as a single number from 0 to 1.\",\"default\":1}]},{\"type\":\"record\",\"name\":\"G_LinkedData\",\"doc\":\"A URL and MIME type representing a pointer to text, image or other external resource.\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"URL of the resource\"},{\"name\":\"mimeType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"MIME type of the resource\",\"default\":null},{\"name\":\"title\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"description of the linked resource (suitable for display to the user in an hypertext link)\",\"default\":null}]},{\"type\":\"record\",\"name\":\"G_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]},{\"type\":\"enum\",\"name\":\"G_ContinentCode\",\"doc\":\"Standard two letter continent code\\r\\n\\t  \\r\\n\\t ADDED IN 1.6\",\"symbols\":[\"AF\",\"AS\",\"EU\",\"NA\",\"SA\",\"OC\",\"AN\"]},{\"type\":\"record\",\"name\":\"G_Country\",\"doc\":\"Structured representation of country data, which includes geo-spatial data.\\r\\n\\t  \\r\\n\\t ADDED IN 1.6\",\"fields\":[{\"name\":\"country\",\"type\":\"G_GeoData\",\"doc\":\"country geo data, including the name as text\"},{\"name\":\"region\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the name of the global region to which the country belongs; any common classification here is acceptable\"},{\"name\":\"continent\",\"type\":\"G_ContinentCode\",\"doc\":\"continent\"}]},{\"type\":\"enum\",\"name\":\"G_DateInterval\",\"doc\":\"Temporal resolution of a duration\\r\\n\\t \\r\\n\\t CHANGED IN 1.5\",\"symbols\":[\"SECONDS\",\"HOURS\",\"DAYS\",\"WEEKS\",\"MONTHS\",\"QUARTERS\",\"YEARS\"]},{\"type\":\"record\",\"name\":\"G_Duration\",\"doc\":\"A temporal duration\\r\\n\\t \\r\\n\\t ADDED IN 1.5\",\"fields\":[{\"name\":\"interval\",\"type\":\"G_DateInterval\",\"doc\":\"time aggregation level, e.g. use monthly data\"},{\"name\":\"numIntervals\",\"type\":\"long\",\"doc\":\"number of intervals, e.g. 12 monthly intervals is a 1 year duration\"}]},{\"type\":\"record\",\"name\":\"G_DateRange\",\"doc\":\"Describes a date range at a specific resolution.\\r\\n\\t \\r\\n\\t CHANGED IN 1.5\",\"fields\":[{\"name\":\"startDate\",\"type\":\"long\"},{\"name\":\"numBins\",\"type\":\"long\",\"doc\":\"number of bins to return, e.g. 12 monthly bins for 1 year of data\"},{\"name\":\"durationPerBin\",\"type\":\"G_Duration\",\"doc\":\"number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data\"}]},{\"type\":\"enum\",\"name\":\"G_RangeType\",\"doc\":\"Allowed types for Ranges of values.\\r\\n\\t\\r\\n\\tCHANGED IN 1.6\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},{\"type\":\"record\",\"name\":\"G_SingletonRange\",\"doc\":\"Single value\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_ListRange\",\"doc\":\"List of values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\"]}},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_BoundedRange\",\"doc\":\"Bounded or unbounded range values\\r\\n\\t\\r\\n\\tADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"}]},{\"type\":\"record\",\"name\":\"G_Frequency\",\"doc\":\"A frequency or probability element of a distribution.\\r\\n\\t \\r\\n\\tADDED IN 1.6\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"G_GeoData\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]},{\"type\":\"record\",\"name\":\"G_DistributionRange\",\"doc\":\"Describes a distribution of values. \\r\\n\\t \\r\\n\\tADDED IN 1.6\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":\"G_Frequency\"}},{\"name\":\"rangeType\",\"type\":\"G_RangeType\",\"doc\":\"Describes how the values in the distribution are summarised\"},{\"name\":\"type\",\"type\":\"G_PropertyType\",\"doc\":\"The type of value that the distribution describes. One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, OTHER\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]},{","\"type\":\"record\",\"name\":\"G_Property\",\"doc\":\"Each property on an Entity or Link is a name-value pair, with data type information, as well as optional\\r\\n\\t provenance. Tags provide a way for the data provider to associate semantic annotations to each property\\r\\n\\t in terms of the semantics of the application.  \\r\\n\\t \\r\\n\\t CHANGED IN 1.6\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"styleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"range\",\"type\":[\"G_SingletonRange\",\"G_ListRange\",\"G_BoundedRange\",\"G_DistributionRange\"],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"G_PropertyTag\"},\"doc\":\"one or more tags from the Tag list, used to map this source-specific field into the semantics of applications\"}]},{\"type\":\"record\",\"name\":\"G_Entity\",\"doc\":\"The nodes in the social, financial, communications or other graphs. May represent concrete individuals or organizations,\\r\\n\\t specific proxies such as accounts, or the implicit individuals or groups behind those other entities.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"This uid must represent either (1) a globally unique identifier that can be used to retrieve data for an\\r\\n\\t\\t\\texplicit entity, or (2) encoded query information that can be used to find a set of associated record\\r\\n\\t\\t\\tnotionally representing an implicit entity (e.g. Loans&FirstName&LastName&Gender). Must not be used for\\r\\n\\t\\t\\tIDs that aren't globally unique.  For example, in Kiva, \\\"Lenders\\\" has a UID (\\\"L12345\\\") while \\\"Borrowers\\\"\\r\\n\\t\\t\\thave an encoded search in the Loans table for uid (\\\"B{loan:23456;name=Daniel}\\\").  The encoded information\\r\\n\\t\\t\\tis data layer-specific, may be different from entity to entity or data set to data set, and should be\\r\\n\\t\\t\\tconsidered opaque to the consumers of the entities.  Entities of type 2 should always have the Entity Tag\\r\\n\\t\\t\\tANONYMOUS to help distinguish them when required.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"G_EntityTag\"},\"doc\":\"Entity Tags (see above, e.g. \\\"ACCOUNT\\\")\"},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":\"G_Property\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"G_Link\",\"doc\":\"* The links in the social, financial, communications or other graphs. May represent communication events, financial transactions\\r\\n\\t * or social connections.\",\"fields\":[{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"G_LinkTag\"},\"doc\":\"Link Tags (see above, e.g. \\\"FINANCIAL\\\")\"},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":\"G_Property\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"G_Cluster\",\"doc\":\"Cluster of nodes in the social, financial, communications or other graphs. \\r\\n\\t \\r\\n\\t CHANGED in 1.7:\\r\\n\\t    - added version\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"G_EntityTag\"},\"doc\":\"Entity Tags (see DataTypes, e.g. \\\"CLUSTER\\\")\"},{\"name\":\"provenance\",\"type\":[\"G_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"G_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"G_Property\"}},{\"name\":\"members\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of id's of the members of this cluster\"},{\"name\":\"subclusters\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of id's of the subclusters of this cluster - empty if this is a leaf cluster in cluster hierarchy\"},{\"name\":\"parent\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"root\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"level\",\"type\":\"int\",\"doc\":\"The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster *\",\"default\":0},{\"name\":\"version\",\"type\":\"int\",\"doc\":\"The version number of the cluster - each time the cluster contents is modified the version should be incremented *\",\"default\":1}]},{\"type\":\"record\",\"name\":\"G_Future\",\"doc\":\"Represents the future results of an asyncrhonous task.\\r\\n\\t Can be passed into the FutureResults service API\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"unique id of this task\"},{\"name\":\"label\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"short human-readable description of task for display\"},{\"name\":\"service\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"uid of the service task is running on\",\"default\":null},{\"name\":\"started\",\"type\":\"long\",\"doc\":\"date/time task was started\"},{\"name\":\"completed\",\"type\":\"long\",\"doc\":\"date/time task was completed (negative if not completed yet)\",\"default\":-1}]},{\"type\":\"record\",\"name\":\"G_Service\",\"doc\":\"Selectable services, returned by getServices() in various APIs\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"unique id of this service\"},{\"name\":\"label\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"short human-readable description of service for display\"}]},{\"type\":\"record\",\"name\":\"G_SearchResult\",\"fields\":[{\"name\":\"score\",\"type\":\"double\",\"doc\":\"search score\",\"default\":0},{\"name\":\"result\",\"type\":[\"G_Entity\",\"G_Link\"],\"doc\":\"search result\"}]},{\"type\":\"enum\",\"name\":\"G_Constraint\",\"doc\":\"Property value matching constraints\\r\\n\\r\\n\\t ADDED IN 1.8\",\"symbols\":[\"REQUIRED_EQUALS\",\"FUZZY_PARTIAL_OPTIONAL\",\"NOT\",\"OPTIONAL_EQUALS\",\"FUZZY_REQUIRED\",\"COMPARE_CONTAINS\",\"COMPARE_ENDSWITH\",\"COMPARE_EQUALS\",\"COMPARE_GREATER\",\"COMPARE_INCLUDE\",\"COMPARE_LESS\",\"COMPARE_NOTINCLUDE\",\"COMPARE_REGEX\",\"COMPARE_SIMPLE\",\"COMPARE_SOUNDSLIKE\",\"COMPARE_STARTSWITH\"]},{\"type\":\"record\",\"name\":\"G_TypeDescriptor\",\"doc\":\"Used to describe applicable types for a searchable property. Types may be grouped with the 'group' parameter.\\r\\n\\r\\n\\t\\tADDED IN 1.8\\r\\n\\t *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"unique key of the type descriptor applicable to a property *\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"a human readable type name to display if the key isn't friendly (optional)\",\"default\":null},{\"name\":\"group\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Group name (optional) *\",\"default\":null},{\"name\":\"exclusive\",\"type\":\"boolean\",\"doc\":\"Indicates whether searching within the defined group is exclusive *\",\"default\":true}]},{\"type\":\"record\",\"name\":\"G_TypeMapping\",\"doc\":\"Used to describe how an G_PropertyDescriptor maps to given a type.\\r\\n\\r\\n\\t\\tADDED IN 1.8\\r\\n\\t *\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type that the mapping applies to *\"},{\"name\":\"memberKey\",\"type\":{\"typ","e\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field that the G_Property maps to in the type *\"}]},{\"type\":\"record\",\"name\":\"G_PropertyDescriptor\",\"doc\":\"Used to add constraints for entity searches.\\r\\n\\r\\n          The 'memberOf' parameter is a list of G_TypeMapping that describe the property in the given types.\\r\\n\\r\\n          ADDED IN 1.8\\r\\n     *\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"property descriptor unique key\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"a human readable property name to display if the key isn't friendly (optional)\",\"default\":null},{\"name\":\"propertyType\",\"type\":\"G_PropertyType\",\"doc\":\"data type of the property\"},{\"name\":\"range\",\"type\":[\"G_RangeType\",\"null\"],\"doc\":\"range of the Property to search on\"},{\"name\":\"constraint\",\"type\":[\"G_Constraint\",\"null\"],\"doc\":\"REQUIRED_EQUALS, FUZZY_PARTIAL_OPTIONAL, NOT, OPTIONAL_EQUALS, FUZZY_REQUIRED\"},{\"name\":\"freeTextIndexed\",\"type\":\"boolean\",\"doc\":\"indicates whether this property is indexed for free text queries *\",\"default\":false},{\"name\":\"defaultTerm\",\"type\":\"boolean\",\"doc\":\"indicates whether this property should be included in the set of default criteria to specify *\",\"default\":false},{\"name\":\"memberOf\",\"type\":{\"type\":\"array\",\"items\":\"G_TypeMapping\"},\"doc\":\"List of mappings against types to which this property belongs,  *\"}]},{\"type\":\"record\",\"name\":\"G_PropertyMatchDescriptor\",\"doc\":\"A PropertyDescriptor is used to describe a possible property that can be present in an entity or link. It describes \\r\\n\\t a single property that can be used in a property search. It can optionally include example or suggested values \\r\\n\\t for searching on.\\r\\n\\t \\r\\n\\t CHANGED IN 1.8\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field name or G_PropertyTag (or G_PathMatchTag) that could be searched on\"},{\"name\":\"range\",\"type\":[\"G_SingletonRange\",\"G_ListRange\",\"G_BoundedRange\"],\"doc\":\"value of the Property to search on\",\"default\":null},{\"name\":\"variable\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If not null/empty, the value is relative to a logical variable specified here (e.g. \\\"X\\\")\\r\\n\\t\\t *  Other parameters using the same logical variable name are relative to this value.\\r\\n\\t\\t *  For instance, for a {key=\\\"amount\\\", value=\\\"0.98\\\", variable=\\\"A\\\"} means that the value\\r\\n\\t\\t *  of amount is 0.98A.  Another amount might be 0.55A, and the property match engine\\r\\n\\t\\t *  (e.g. search engine, database query or pattern match algorithm) should understand\\r\\n\\t\\t *  the relative values.\\r\\n\\t\\t *  \\r\\n\\t\\t *  If no variable is specified, then the value is an absolute number. For example,\\r\\n\\t\\t *  {key=\\\"amount\\\", value=\\\"0.98\\\"} refers to an amount of exactly 0.98.\",\"default\":\"\"},{\"name\":\"weight\",\"type\":[\"float\",\"null\"],\"doc\":\"Relative importance of this match criteria, where the default is 1.0.\",\"default\":1.0},{\"name\":\"similarity\",\"type\":[\"float\",\"null\"],\"doc\":\"Require similarity for fuzzy searches, the default is null.\",\"default\":1.0},{\"name\":\"include\",\"type\":\"boolean\",\"doc\":\"If true, INCLUDE all values matching this descriptor. If false, EXCLUDE all values matching this descriptor.\",\"default\":true},{\"name\":\"constraint\",\"type\":[\"G_Constraint\",\"null\"],\"doc\":\"MUST_EQUALS, FUZZY_PARTIAL_OPTIONAL, MUST_NOT\"},{\"name\":\"typeMappings\",\"type\":{\"type\":\"array\",\"items\":\"G_TypeMapping\"},\"doc\":\"List of type mappings to match in *\",\"default\":null}]},{\"type\":\"record\",\"name\":\"G_EntityQuery\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"targetSchema\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"firstResult\",\"type\":\"long\",\"default\":0},{\"name\":\"maxResult\",\"type\":\"long\",\"default\":0},{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"None\"},{\"name\":\"username\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"None\"},{\"name\":\"timeInitiated\",\"type\":\"long\"},{\"name\":\"propertyMatchDescriptors\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"G_PropertyMatchDescriptor\"}],\"default\":null},{\"name\":\"caseSensitive\",\"type\":\"boolean\",\"default\":false},{\"name\":\"searchFreeText\",\"type\":\"boolean\",\"default\":false},{\"name\":\"minimumScore\",\"type\":\"double\",\"default\":0.25},{\"name\":\"initiatorId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"G_SearchResults\",\"doc\":\"The set of results from a single search call. Each item also has a score.\",\"fields\":[{\"name\":\"total\",\"type\":\"long\",\"doc\":\"total number of results FOUND, which may be more than the number returned.\",\"default\":0},{\"name\":\"results\",\"type\":{\"type\":\"array\",\"items\":\"G_SearchResult\"},\"doc\":\"array of Items (Entities or Links) with scores\"}]},{\"type\":\"record\",\"name\":\"G_PropertyDescriptors\",\"doc\":\"An instance of PropertyDescriptors is used to contain the dataset-specific type and property descriptions returned\\r\\n\\t by getDescriptors()\\r\\n\\r\\n\\t ADDED IN 1.8\",\"fields\":[{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"G_PropertyDescriptor\"},\"default\":null},{\"name\":\"types\",\"type\":{\"type\":\"array\",\"items\":\"G_TypeDescriptor\"},\"default\":null}]}],\"messages\":{\"search\":{\"doc\":\"Returns a set of Entity search results based on the query (if provides)\\r\\n\\t AND all matching terms (if any). Partial matches are allowed, but should\\r\\n\\t be ranked lower.\\r\\n\\t \\r\\n\\t Service URL: /entity/search\\r\\n\\t HTTP Method: POST and GET\\r\\n\\t \\r\\n\\t CHANGED IN 1.5\\r\\n\\t \\r\\n\\t @param terms\\t\\tProperty Search Terms\\r\\n\\t @param start\\t\\t0-based index of first result to return\\r\\n\\t @param max\\t\\t\\tmaximum number of results to return\\r\\n\\t @return\\t\\t\\tSearchResults\",\"request\":[{\"name\":\"terms\",\"type\":{\"type\":\"array\",\"items\":\"G_PropertyMatchDescriptor\"},\"default\":null},{\"name\":\"start\",\"type\":\"long\",\"default\":0},{\"name\":\"max\",\"type\":\"long\",\"default\":-1}],\"response\":\"G_SearchResults\"},\"getDescriptors\":{\"doc\":\"Returns the property descriptors that can be used for a Search. This is normally used to populate the Advanced \\r\\n\\t Search UI, providing a list of various sub-sets of the data (by type) and the valid search options for each.\\r\\n\\t  \\r\\n\\t Service URL: /entity/descriptors\\r\\n\\t HTTP Method: GET\\r\\n\\t \\r\\n\\t @return a PropertyDescriptors instance that contains an array of PropertyDescriptor and an array of TypeDescriptor,\\r\\n\\t where fields in these descriptors contain info about the dataset-specific types and properties\\r\\n\\t \\t \\r\\n\\t \\t CHANGED IN 1.8\",\"request\":[],\"response\":\"G_PropertyDescriptors\"}}}");
  /** Returns a set of Entity search results based on the query (if provides)
	 AND all matching terms (if any). Partial matches are allowed, but should
	 be ranked lower.
	 
	 Service URL: /entity/search
	 HTTP Method: POST and GET
	 
	 CHANGED IN 1.5
	 
	 @param terms		Property Search Terms
	 @param start		0-based index of first result to return
	 @param max			maximum number of results to return
	 @return			SearchResults */
  graphene.model.idl.G_SearchResults search(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> terms, long start, long max) throws org.apache.avro.AvroRemoteException;
  /** Returns the property descriptors that can be used for a Search. This is normally used to populate the Advanced 
	 Search UI, providing a list of various sub-sets of the data (by type) and the valid search options for each.
	  
	 Service URL: /entity/descriptors
	 HTTP Method: GET
	 
	 @return a PropertyDescriptors instance that contains an array of PropertyDescriptor and an array of TypeDescriptor,
	 where fields in these descriptors contain info about the dataset-specific types and properties
	 	 
	 	 CHANGED IN 1.8 */
  graphene.model.idl.G_PropertyDescriptors getDescriptors() throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  /**  */
  public interface Callback extends G_EntitySearch {
    public static final org.apache.avro.Protocol PROTOCOL = graphene.model.idl.G_EntitySearch.PROTOCOL;
    /** Returns a set of Entity search results based on the query (if provides)
	 AND all matching terms (if any). Partial matches are allowed, but should
	 be ranked lower.
	 
	 Service URL: /entity/search
	 HTTP Method: POST and GET
	 
	 CHANGED IN 1.5
	 
	 @param terms		Property Search Terms
	 @param start		0-based index of first result to return
	 @param max			maximum number of results to return
	 @return			SearchResults */
    void search(java.util.List<graphene.model.idl.G_PropertyMatchDescriptor> terms, long start, long max, org.apache.avro.ipc.Callback<graphene.model.idl.G_SearchResults> callback) throws java.io.IOException;
    /** Returns the property descriptors that can be used for a Search. This is normally used to populate the Advanced 
	 Search UI, providing a list of various sub-sets of the data (by type) and the valid search options for each.
	  
	 Service URL: /entity/descriptors
	 HTTP Method: GET
	 
	 @return a PropertyDescriptors instance that contains an array of PropertyDescriptor and an array of TypeDescriptor,
	 where fields in these descriptors contain info about the dataset-specific types and properties
	 	 
	 	 CHANGED IN 1.8 */
    void getDescriptors(org.apache.avro.ipc.Callback<graphene.model.idl.G_PropertyDescriptors> callback) throws java.io.IOException;
  }
}