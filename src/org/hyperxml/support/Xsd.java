/**
 *   Copyright 2015 Christian Oetterli
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.hyperxml.support;

import org.hyperxml.Xml;
import org.xml.sax.ContentHandler;

/**
 * Elements and attributes contained in <code>XMLSchema.xsd.dat</code>. <br>
 */
abstract public class Xsd<T extends Xsd<?>> extends Xml<T> {
  /**
   * The target namespace <code>http://www.w3.org/2001/XMLSchema</code>.
   */
  public static final String Xsd = "http://www.w3.org/2001/XMLSchema";
  /**
   * The <code>memberTypes</code> attribute.
   */
  public static final String memberTypes = "memberTypes";
  /**
   * The <code>finalDefault</code> attribute.
   */
  public static final String finalDefault = "finalDefault";
  /**
   * The <code>substitution</code> attribute.
   */
  public static final String substitution = "substitution";
  /**
   * The <code>attributeFormDefault</code> attribute.
   */
  public static final String attributeFormDefault = "attributeFormDefault";
  /**
   * The <code>type</code> attribute.
   */
  public static final String type = "type";
  /**
   * The <code>unbounded</code> attribute.
   */
  public static final String unbounded = "unbounded";
  /**
   * The <code>skip</code> attribute.
   */
  public static final String skip = "skip";
  /**
   * The <code>fixed</code> attribute.
   */
  public static final String fixed = "fixed";
  /**
   * The <code>preserve</code> attribute.
   */
  public static final String preserve = "preserve";
  /**
   * The <code>namespace</code> attribute.
   */
  public static final String namespace = "namespace";
  /**
   * The <code>refer</code> attribute.
   */
  public static final String refer = "refer";
  /**
   * The <code>optional</code> attribute.
   */
  public static final String optional = "optional";
  /**
   * The <code>value</code> attribute.
   */
  public static final String value = "value";
  /**
   * The <code>required</code> attribute.
   */
  public static final String required = "required";
  /**
   * The <code>collapse</code> attribute.
   */
  public static final String collapse = "collapse";
  /**
   * The <code>final</code> attribute.
   */
  public static final String finall = "final";
  /**
   * The <code>form</code> attribute.
   */
  public static final String form = "form";
  /**
   * The <code>restriction</code> attribute.
   */
  public static final String restriction = "restriction";
  /**
   * The <code>unqualified</code> attribute.
   */
  public static final String unqualified = "unqualified";
  /**
   * The <code>system</code> attribute.
   */
  public static final String system = "system";
  /**
   * The <code>default</code> attribute.
   */
  public static final String defaultt = "default";
  /**
   * The <code>strict</code> attribute.
   */
  public static final String strict = "strict";
  /**
   * The <code>processContents</code> attribute.
   */
  public static final String processContents = "processContents";
  /**
   * The <code>substitutionGroup</code> attribute.
   */
  public static final String substitutionGroup = "substitutionGroup";
  /**
   * The <code>nillable</code> attribute.
   */
  public static final String nillable = "nillable";
  /**
   * The <code>use</code> attribute.
   */
  public static final String use = "use";
  /**
   * The <code>block</code> attribute.
   */
  public static final String block = "block";
  /**
   * The <code>schemaLocation</code> attribute.
   */
  public static final String schemaLocation = "schemaLocation";
  /**
   * The <code>version</code> attribute.
   */
  public static final String version = "version";
  /**
   * The <code>xpath</code> attribute.
   */
  public static final String xpath = "xpath";
  /**
   * The <code>id</code> attribute.
   */
  public static final String id = "id";
  /**
   * The <code>name</code> attribute.
   */
  public static final String name = "name";
  /**
   * The <code>union</code> attribute.
   */
  public static final String union = "union";
  /**
   * The <code>mixed</code> attribute.
   */
  public static final String mixed = "mixed";
  /**
   * The <code>abstract</code> attribute.
   */
  public static final String abstractt = "abstract";
  /**
   * The <code>lax</code> attribute.
   */
  public static final String lax = "lax";
  /**
   * The <code>targetNamespace</code> attribute.
   */
  public static final String targetNamespace = "targetNamespace";
  /**
   * The <code>maxOccurs</code> attribute.
   */
  public static final String maxOccurs = "maxOccurs";
  /**
   * The <code>itemType</code> attribute.
   */
  public static final String itemType = "itemType";
  /**
   * The <code>list</code> attribute.
   */
  public static final String list = "list";
  /**
   * The <code>blockDefault</code> attribute.
   */
  public static final String blockDefault = "blockDefault";
  /**
   * The <code>minOccurs</code> attribute.
   */
  public static final String minOccurs = "minOccurs";
  /**
   * The <code>replace</code> attribute.
   */
  public static final String replace = "replace";
  /**
   * The <code>extension</code> attribute.
   */
  public static final String extension = "extension";
  /**
   * The <code>ref</code> attribute.
   */
  public static final String ref = "ref";
  /**
   * The <code>source</code> attribute.
   */
  public static final String source = "source";
  /**
   * The <code>prohibited</code> attribute.
   */
  public static final String prohibited = "prohibited";
  /**
   * The <code>base</code> attribute.
   */
  public static final String base = "base";
  /**
   * The <code>elementFormDefault</code> attribute.
   */
  public static final String elementFormDefault = "elementFormDefault";
  /**
   * The <code>public</code> attribute.
   */
  public static final String publicc = "public";
  /**
   * The <code>qualified</code> attribute.
   */
  public static final String qualified = "qualified";

  public Xsd() {
  }

  public Xsd(ContentHandler writer) {
    super(writer);
  }

  /**
   * The <code>schema</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T schema(Object... attributesAndOptionalValue) {
    $("schema", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>group</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T group(Object... attributesAndOptionalValue) {
    $("group", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>element</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T elementt(Object... attributesAndOptionalValue) {
    $("element", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>simpleType</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T simpleType(Object... attributesAndOptionalValue) {
    $("simpleType", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>attribute</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T attribute(Object... attributesAndOptionalValue) {
    $("attribute", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>attributeGroup</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T attributeGroup(Object... attributesAndOptionalValue) {
    $("attributeGroup", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>anyAttribute</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T anyAttribute(Object... attributesAndOptionalValue) {
    $("anyAttribute", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>complexContent</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T complexContent(Object... attributesAndOptionalValue) {
    $("complexContent", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>restriction</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T restriction(Object... attributesAndOptionalValue) {
    $("restriction", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>extension</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T extension(Object... attributesAndOptionalValue) {
    $("extension", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>simpleContent</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T simpleContent(Object... attributesAndOptionalValue) {
    $("simpleContent", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>complexType</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T complexType(Object... attributesAndOptionalValue) {
    $("complexType", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>all</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T all(Object... attributesAndOptionalValue) {
    $("all", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>choice</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T choice(Object... attributesAndOptionalValue) {
    $("choice", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>sequence</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T sequence(Object... attributesAndOptionalValue) {
    $("sequence", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>any</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T any(Object... attributesAndOptionalValue) {
    $("any", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>include</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T include(Object... attributesAndOptionalValue) {
    $("include", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>redefine</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T redefine(Object... attributesAndOptionalValue) {
    $("redefine", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>import</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T importt(Object... attributesAndOptionalValue) {
    $("import", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>selector</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T selector(Object... attributesAndOptionalValue) {
    $("selector", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>field</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T field(Object... attributesAndOptionalValue) {
    $("field", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>unique</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T unique(Object... attributesAndOptionalValue) {
    $("unique", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>key</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T key(Object... attributesAndOptionalValue) {
    $("key", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>keyref</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T keyref(Object... attributesAndOptionalValue) {
    $("keyref", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>notation</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T notation(Object... attributesAndOptionalValue) {
    $("notation", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>appinfo</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T appinfo(Object... attributesAndOptionalValue) {
    $("appinfo", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>documentation</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T documentation(Object... attributesAndOptionalValue) {
    $("documentation", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>annotation</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T annotation(Object... attributesAndOptionalValue) {
    $("annotation", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>list</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T list(Object... attributesAndOptionalValue) {
    $("list", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>union</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T union(Object... attributesAndOptionalValue) {
    $("union", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>minExclusive</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T minExclusive(Object... attributesAndOptionalValue) {
    $("minExclusive", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>minInclusive</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T minInclusive(Object... attributesAndOptionalValue) {
    $("minInclusive", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>maxExclusive</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T maxExclusive(Object... attributesAndOptionalValue) {
    $("maxExclusive", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>maxInclusive</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T maxInclusive(Object... attributesAndOptionalValue) {
    $("maxInclusive", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>totalDigits</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T totalDigits(Object... attributesAndOptionalValue) {
    $("totalDigits", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>fractionDigits</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T fractionDigits(Object... attributesAndOptionalValue) {
    $("fractionDigits", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>length</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T length(Object... attributesAndOptionalValue) {
    $("length", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>minLength</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T minLength(Object... attributesAndOptionalValue) {
    $("minLength", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>maxLength</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T maxLength(Object... attributesAndOptionalValue) {
    $("maxLength", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>enumeration</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T enumeration(Object... attributesAndOptionalValue) {
    $("enumeration", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>whiteSpace</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T whiteSpace(Object... attributesAndOptionalValue) {
    $("whiteSpace", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>pattern</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T pattern(Object... attributesAndOptionalValue) {
    $("pattern", attributesAndOptionalValue);
    return _this();
  }
}