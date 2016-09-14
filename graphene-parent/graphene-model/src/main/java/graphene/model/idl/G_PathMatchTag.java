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
/** * In addition to PropertyTags, a PropertyMatchDescriptor might also be one of these.

	 	ADDED IN 1.5 */
@org.apache.avro.specific.AvroGenerated
public enum G_PathMatchTag { 
  PATH_LENGTH, PATH_TIME, PATH_SOURCES, PATH_DESTS  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"G_PathMatchTag\",\"namespace\":\"graphene.model.idl\",\"doc\":\"* In addition to PropertyTags, a PropertyMatchDescriptor might also be one of these.\\n\\n\\t \\tADDED IN 1.5\",\"symbols\":[\"PATH_LENGTH\",\"PATH_TIME\",\"PATH_SOURCES\",\"PATH_DESTS\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
