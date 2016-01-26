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
/** Tags are defined by the application layer as a taxonomy of user and application concepts,
	 independent of the data sources. This allows application semantics to be re-used with new
	 data, with a minimum of new software design and development. Data layer entity types, link
	 types and properties should be mapped into the list of tags. The application layer must be
	 able to search by native field name or by tag interchangeably, and properties returned must
	 contain both native field names as well as tags.
	 
	 The list of tags may change as application features evolve, though that will require
	 collaboration with the data layer providers. Evolving the tag list should not change the
	 Data Access or Search APIs.

	 This is the current list of tags for Properties:
	 
	 CHANGED in 1.5:
	   - CREDIT/DEBIT changed to INFLOWING/OUTFLOWING
	   - added USD
	   - added DURATION
	   
	 CHANGED in 1.6:
	   - added ENTITY_TYPE
	   - added ACCOUNT_OWNER, CLUSTER_SUMMARY, COUNTRY_CODE
	   
	 CHANGED in 1.7:
	   - added CLUSTER */
@org.apache.avro.specific.AvroGenerated
public enum G_PropertyTag { 
  ID, TYPE, ENTITY_TYPE, ACCOUNT_OWNER, CLUSTER_SUMMARY, CLUSTER, NAME, LABEL, STAT, TEXT, STATUS, ANNOTATION, WARNING, LINKED_DATA, IMAGE, GEO, COUNTRY_CODE, DATE, AMOUNT, INFLOWING, OUTFLOWING, COUNT, SERIES, CONSTRUCTED, RAW, USD, DURATION  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"G_PropertyTag\",\"namespace\":\"graphene.model.idl\",\"doc\":\"Tags are defined by the application layer as a taxonomy of user and application concepts,\\n\\t independent of the data sources. This allows application semantics to be re-used with new\\n\\t data, with a minimum of new software design and development. Data layer entity types, link\\n\\t types and properties should be mapped into the list of tags. The application layer must be\\n\\t able to search by native field name or by tag interchangeably, and properties returned must\\n\\t contain both native field names as well as tags.\\n\\t \\n\\t The list of tags may change as application features evolve, though that will require\\n\\t collaboration with the data layer providers. Evolving the tag list should not change the\\n\\t Data Access or Search APIs.\\n\\n\\t This is the current list of tags for Properties:\\n\\t \\n\\t CHANGED in 1.5:\\n\\t   - CREDIT/DEBIT changed to INFLOWING/OUTFLOWING\\n\\t   - added USD\\n\\t   - added DURATION\\n\\t   \\n\\t CHANGED in 1.6:\\n\\t   - added ENTITY_TYPE\\n\\t   - added ACCOUNT_OWNER, CLUSTER_SUMMARY, COUNTRY_CODE\\n\\t   \\n\\t CHANGED in 1.7:\\n\\t   - added CLUSTER\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"CLUSTER\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"IMAGE\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"USD\",\"DURATION\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
