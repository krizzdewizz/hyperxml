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

/**
 * Elements and attributes contained in <code>XMLSchema.xsd.dat</code>. <br>
 */
abstract public class Xsd extends Xml<Xsd> {
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

	/**
	 * The <code>schema</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd schema(Object... params) {
		$("schema", params);
		return _this();
	}

	/**
	 * The <code>group</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd group(Object... params) {
		$("group", params);
		return _this();
	}

	/**
	 * The <code>element</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd elementt(Object... params) {
		$("element", params);
		return _this();
	}

	/**
	 * The <code>simpleType</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd simpleType(Object... params) {
		$("simpleType", params);
		return _this();
	}

	/**
	 * The <code>attribute</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd attribute(Object... params) {
		$("attribute", params);
		return _this();
	}

	/**
	 * The <code>attributeGroup</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd attributeGroup(Object... params) {
		$("attributeGroup", params);
		return _this();
	}

	/**
	 * The <code>anyAttribute</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd anyAttribute(Object... params) {
		$("anyAttribute", params);
		return _this();
	}

	/**
	 * The <code>complexContent</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd complexContent(Object... params) {
		$("complexContent", params);
		return _this();
	}

	/**
	 * The <code>restriction</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd restriction(Object... params) {
		$("restriction", params);
		return _this();
	}

	/**
	 * The <code>extension</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd extension(Object... params) {
		$("extension", params);
		return _this();
	}

	/**
	 * The <code>simpleContent</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd simpleContent(Object... params) {
		$("simpleContent", params);
		return _this();
	}

	/**
	 * The <code>complexType</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd complexType(Object... params) {
		$("complexType", params);
		return _this();
	}

	/**
	 * The <code>all</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd all(Object... params) {
		$("all", params);
		return _this();
	}

	/**
	 * The <code>choice</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd choice(Object... params) {
		$("choice", params);
		return _this();
	}

	/**
	 * The <code>sequence</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd sequence(Object... params) {
		$("sequence", params);
		return _this();
	}

	/**
	 * The <code>any</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd any(Object... params) {
		$("any", params);
		return _this();
	}

	/**
	 * The <code>include</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd include(Object... params) {
		$("include", params);
		return _this();
	}

	/**
	 * The <code>redefine</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd redefine(Object... params) {
		$("redefine", params);
		return _this();
	}

	/**
	 * The <code>import</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd importt(Object... params) {
		$("import", params);
		return _this();
	}

	/**
	 * The <code>selector</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd selector(Object... params) {
		$("selector", params);
		return _this();
	}

	/**
	 * The <code>field</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd field(Object... params) {
		$("field", params);
		return _this();
	}

	/**
	 * The <code>unique</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd unique(Object... params) {
		$("unique", params);
		return _this();
	}

	/**
	 * The <code>key</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd key(Object... params) {
		$("key", params);
		return _this();
	}

	/**
	 * The <code>keyref</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd keyref(Object... params) {
		$("keyref", params);
		return _this();
	}

	/**
	 * The <code>notation</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd notation(Object... params) {
		$("notation", params);
		return _this();
	}

	/**
	 * The <code>appinfo</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd appinfo(Object... params) {
		$("appinfo", params);
		return _this();
	}

	/**
	 * The <code>documentation</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd documentation(Object... params) {
		$("documentation", params);
		return _this();
	}

	/**
	 * The <code>annotation</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd annotation(Object... params) {
		$("annotation", params);
		return _this();
	}

	/**
	 * The <code>list</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd list(Object... params) {
		$("list", params);
		return _this();
	}

	/**
	 * The <code>union</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd union(Object... params) {
		$("union", params);
		return _this();
	}

	/**
	 * The <code>minExclusive</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd minExclusive(Object... params) {
		$("minExclusive", params);
		return _this();
	}

	/**
	 * The <code>minInclusive</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd minInclusive(Object... params) {
		$("minInclusive", params);
		return _this();
	}

	/**
	 * The <code>maxExclusive</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd maxExclusive(Object... params) {
		$("maxExclusive", params);
		return _this();
	}

	/**
	 * The <code>maxInclusive</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd maxInclusive(Object... params) {
		$("maxInclusive", params);
		return _this();
	}

	/**
	 * The <code>totalDigits</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd totalDigits(Object... params) {
		$("totalDigits", params);
		return _this();
	}

	/**
	 * The <code>fractionDigits</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd fractionDigits(Object... params) {
		$("fractionDigits", params);
		return _this();
	}

	/**
	 * The <code>length</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd length(Object... params) {
		$("length", params);
		return _this();
	}

	/**
	 * The <code>minLength</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd minLength(Object... params) {
		$("minLength", params);
		return _this();
	}

	/**
	 * The <code>maxLength</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd maxLength(Object... params) {
		$("maxLength", params);
		return _this();
	}

	/**
	 * The <code>enumeration</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd enumeration(Object... params) {
		$("enumeration", params);
		return _this();
	}

	/**
	 * The <code>whiteSpace</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd whiteSpace(Object... params) {
		$("whiteSpace", params);
		return _this();
	}

	/**
	 * The <code>pattern</code> element.
	 * 
	 * @param params
	 *            Parameters
	 * @return this
	 * @see Xml#$(String, Object...)
	 */
	public Xsd pattern(Object... params) {
		$("pattern", params);
		return _this();
	}
}