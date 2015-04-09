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
 * Elements and attributes contained in <code>xhtml1-strict.xsd.dat</code>. <br>
 */
abstract public class XHtml<T extends XHtml<?>> extends Xml<T> {
  /**
   * The target namespace <code>http://www.w3.org/1999/xhtml</code>.
   */
  public static final String XHtml = "http://www.w3.org/1999/xhtml";

  public static final String fill = "100%";

  /**
   * The <code>headers</code> attribute.
   */
  public static final String headers = "headers";
  /**
   * The <code>summary</code> attribute.
   */
  public static final String summary = "summary";
  /**
   * The <code>cols</code> attribute.
   */
  public static final String cols = "cols";
  /**
   * The <code>char</code> attribute.
   */
  public static final String charr = "char";
  /**
   * The <code>for</code> attribute.
   */
  public static final String forr = "for";
  /**
   * The <code>accept</code> attribute.
   */
  public static final String accept = "accept";
  /**
   * The <code>cellpadding</code> attribute.
   */
  public static final String cellpadding = "cellpadding";
  /**
   * The <code>type</code> attribute.
   */
  public static final String type = "type";
  /**
   * The <code>cellspacing</code> attribute.
   */
  public static final String cellspacing = "cellspacing";
  /**
   * The <code>accept-charset</code> attribute.
   */
  public static final String acceptCharset = "accept-charset";
  /**
   * The <code>hreflang</code> attribute.
   */
  public static final String hreflang = "hreflang";
  /**
   * The <code>maxlength</code> attribute.
   */
  public static final String maxlength = "maxlength";
  /**
   * The <code>height</code> attribute.
   */
  public static final String height = "height";
  /**
   * The <code>scheme</code> attribute.
   */
  public static final String scheme = "scheme";
  /**
   * The <code>onblur</code> attribute.
   */
  public static final String onblur = "onblur";
  /**
   * The <code>action</code> attribute.
   */
  public static final String action = "action";
  /**
   * The <code>value</code> attribute.
   */
  public static final String value = "value";
  /**
   * The <code>border</code> attribute.
   */
  public static final String border = "border";
  /**
   * The <code>href</code> attribute.
   */
  public static final String href = "href";
  /**
   * The <code>colspan</code> attribute.
   */
  public static final String colspan = "colspan";
  /**
   * The <code>ondblclick</code> attribute.
   */
  public static final String ondblclick = "ondblclick";
  /**
   * The <code>onmouseout</code> attribute.
   */
  public static final String onmouseout = "onmouseout";
  /**
   * The <code>align</code> attribute.
   */
  public static final String align = "align";
  /**
   * The <code>width</code> attribute.
   */
  public static final String width = "width";
  /**
   * The <code>abbr</code> attribute.
   */
  public static final String abbr = "abbr";
  /**
   * The <code>onkeyup</code> attribute.
   */
  public static final String onkeyup = "onkeyup";
  /**
   * The <code>class</code> attribute.
   */
  public static final String classs = "class";
  /**
   * The <code>charset</code> attribute.
   */
  public static final String charset = "charset";
  /**
   * The <code>label</code> attribute.
   */
  public static final String label = "label";
  /**
   * The <code>onfocus</code> attribute.
   */
  public static final String onfocus = "onfocus";
  /**
   * The <code>rowspan</code> attribute.
   */
  public static final String rowspan = "rowspan";
  /**
   * The <code>shape</code> attribute.
   */
  public static final String shape = "shape";
  /**
   * The <code>longdesc</code> attribute.
   */
  public static final String longdesc = "longdesc";
  /**
   * The <code>rows</code> attribute.
   */
  public static final String rows = "rows";
  /**
   * The <code>size</code> attribute.
   */
  public static final String size = "size";
  /**
   * The <code>onreset</code> attribute.
   */
  public static final String onreset = "onreset";
  /**
   * The <code>declare</code> attribute.
   */
  public static final String declare = "declare";
  /**
   * The <code>content</code> attribute.
   */
  public static final String content = "content";
  /**
   * The <code>cite</code> attribute.
   */
  public static final String cite = "cite";
  /**
   * The <code>frame</code> attribute.
   */
  public static final String frame = "frame";
  /**
   * The <code>onselect</code> attribute.
   */
  public static final String onselect = "onselect";
  /**
   * The <code>standby</code> attribute.
   */
  public static final String standby = "standby";
  /**
   * The <code>onmousedown</code> attribute.
   */
  public static final String onmousedown = "onmousedown";
  /**
   * The <code>media</code> attribute.
   */
  public static final String media = "media";
  /**
   * The <code>nohref</code> attribute.
   */
  public static final String nohref = "nohref";
  /**
   * The <code>span</code> attribute.
   */
  public static final String span = "span";
  /**
   * The <code>rev</code> attribute.
   */
  public static final String rev = "rev";
  /**
   * The <code>scope</code> attribute.
   */
  public static final String scope = "scope";
  /**
   * The <code>usemap</code> attribute.
   */
  public static final String usemap = "usemap";
  /**
   * The <code>onunload</code> attribute.
   */
  public static final String onunload = "onunload";
  /**
   * The <code>data</code> attribute.
   */
  public static final String data = "data";
  /**
   * The <code>space</code> attribute.
   */
  public static final String space = "space";
  /**
   * The <code>lang</code> attribute.
   */
  public static final String lang = "lang";
  /**
   * The <code>accesskey</code> attribute.
   */
  public static final String accesskey = "accesskey";
  /**
   * The <code>http-equiv</code> attribute.
   */
  public static final String httpEquiv = "http-equiv";
  /**
   * The <code>id</code> attribute.
   */
  public static final String id = "id";
  /**
   * The <code>valuetype</code> attribute.
   */
  public static final String valuetype = "valuetype";
  /**
   * The <code>defer</code> attribute.
   */
  public static final String defer = "defer";
  /**
   * The <code>selected</code> attribute.
   */
  public static final String selected = "selected";
  /**
   * The <code>ismap</code> attribute.
   */
  public static final String ismap = "ismap";
  /**
   * The <code>title</code> attribute.
   */
  public static final String title = "title";
  /**
   * The <code>style</code> attribute.
   */
  public static final String style = "style";
  /**
   * The <code>dir</code> attribute.
   */
  public static final String dir = "dir";
  /**
   * The <code>alt</code> attribute.
   */
  public static final String alt = "alt";
  /**
   * The <code>enctype</code> attribute.
   */
  public static final String enctype = "enctype";
  /**
   * The <code>name</code> attribute.
   */
  public static final String name = "name";
  /**
   * The <code>onmouseup</code> attribute.
   */
  public static final String onmouseup = "onmouseup";
  /**
   * The <code>src</code> attribute.
   */
  public static final String src = "src";
  /**
   * The <code>datetime</code> attribute.
   */
  public static final String datetime = "datetime";
  /**
   * The <code>multiple</code> attribute.
   */
  public static final String multiple = "multiple";
  /**
   * The <code>profile</code> attribute.
   */
  public static final String profile = "profile";
  /**
   * The <code>classid</code> attribute.
   */
  public static final String classid = "classid";
  /**
   * The <code>codetype</code> attribute.
   */
  public static final String codetype = "codetype";
  /**
   * The <code>axis</code> attribute.
   */
  public static final String axis = "axis";
  /**
   * The <code>onmousemove</code> attribute.
   */
  public static final String onmousemove = "onmousemove";
  /**
   * The <code>charoff</code> attribute.
   */
  public static final String charoff = "charoff";
  /**
   * The <code>tabindex</code> attribute.
   */
  public static final String tabindex = "tabindex";
  /**
   * The <code>onkeydown</code> attribute.
   */
  public static final String onkeydown = "onkeydown";
  /**
   * The <code>onkeypress</code> attribute.
   */
  public static final String onkeypress = "onkeypress";
  /**
   * The <code>rules</code> attribute.
   */
  public static final String rules = "rules";
  /**
   * The <code>onchange</code> attribute.
   */
  public static final String onchange = "onchange";
  /**
   * The <code>onsubmit</code> attribute.
   */
  public static final String onsubmit = "onsubmit";
  /**
   * The <code>onmouseover</code> attribute.
   */
  public static final String onmouseover = "onmouseover";
  /**
   * The <code>coords</code> attribute.
   */
  public static final String coords = "coords";
  /**
   * The <code>onload</code> attribute.
   */
  public static final String onload = "onload";
  /**
   * The <code>onclick</code> attribute.
   */
  public static final String onclick = "onclick";
  /**
   * The <code>method</code> attribute.
   */
  public static final String method = "method";
  /**
   * The <code>rel</code> attribute.
   */
  public static final String rel = "rel";
  /**
   * The <code>archive</code> attribute.
   */
  public static final String archive = "archive";
  /**
   * The <code>valign</code> attribute.
   */
  public static final String valign = "valign";
  /**
   * The <code>readonly</code> attribute.
   */
  public static final String readonly = "readonly";
  /**
   * The <code>checked</code> attribute.
   */
  public static final String checked = "checked";
  /**
   * The <code>disabled</code> attribute.
   */
  public static final String disabled = "disabled";
  /**
   * The <code>codebase</code> attribute.
   */
  public static final String codebase = "codebase";

  public XHtml() {
  }

  public XHtml(ContentHandler contentHandler) {
    super(contentHandler);
  }

  /**
   * The <code>html</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T html(Object... attributesAndOptionalValue) {
    $("html", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>head</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T head(Object... attributesAndOptionalValue) {
    $("head", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>title</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T title(Object... attributesAndOptionalValue) {
    $("title", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>base</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T base(Object... attributesAndOptionalValue) {
    $("base", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>meta</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T meta(Object... attributesAndOptionalValue) {
    $("meta", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>link</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T link(Object... attributesAndOptionalValue) {
    $("link", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>style</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T style(Object... attributesAndOptionalValue) {
    $("style", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>script</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T script(Object... attributesAndOptionalValue) {
    $("script", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>noscript</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T noscript(Object... attributesAndOptionalValue) {
    $("noscript", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>body</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T body(Object... attributesAndOptionalValue) {
    $("body", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>div</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T div(Object... attributesAndOptionalValue) {
    $("div", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>p</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T p(Object... attributesAndOptionalValue) {
    $("p", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h1</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h1(Object... attributesAndOptionalValue) {
    $("h1", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h2</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h2(Object... attributesAndOptionalValue) {
    $("h2", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h3</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h3(Object... attributesAndOptionalValue) {
    $("h3", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h4</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h4(Object... attributesAndOptionalValue) {
    $("h4", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h5</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h5(Object... attributesAndOptionalValue) {
    $("h5", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>h6</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T h6(Object... attributesAndOptionalValue) {
    $("h6", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>ul</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T ul(Object... attributesAndOptionalValue) {
    $("ul", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>ol</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T ol(Object... attributesAndOptionalValue) {
    $("ol", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>li</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T li(Object... attributesAndOptionalValue) {
    $("li", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>dl</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T dl(Object... attributesAndOptionalValue) {
    $("dl", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>dt</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T dt(Object... attributesAndOptionalValue) {
    $("dt", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>dd</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T dd(Object... attributesAndOptionalValue) {
    $("dd", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>address</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T address(Object... attributesAndOptionalValue) {
    $("address", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>hr</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T hr(Object... attributesAndOptionalValue) {
    $("hr", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>pre</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T pre(Object... attributesAndOptionalValue) {
    $("pre", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>blockquote</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T blockquote(Object... attributesAndOptionalValue) {
    $("blockquote", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>ins</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T ins(Object... attributesAndOptionalValue) {
    $("ins", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>del</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T del(Object... attributesAndOptionalValue) {
    $("del", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>a</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T a(Object... attributesAndOptionalValue) {
    $("a", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>span</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T span(Object... attributesAndOptionalValue) {
    $("span", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>bdo</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T bdo(Object... attributesAndOptionalValue) {
    $("bdo", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>br</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T br(Object... attributesAndOptionalValue) {
    $("br", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>em</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T em(Object... attributesAndOptionalValue) {
    $("em", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>strong</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T strong(Object... attributesAndOptionalValue) {
    $("strong", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>dfn</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T dfn(Object... attributesAndOptionalValue) {
    $("dfn", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>code</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T code(Object... attributesAndOptionalValue) {
    $("code", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>samp</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T samp(Object... attributesAndOptionalValue) {
    $("samp", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>kbd</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T kbd(Object... attributesAndOptionalValue) {
    $("kbd", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>var</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T var(Object... attributesAndOptionalValue) {
    $("var", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>cite</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T cite(Object... attributesAndOptionalValue) {
    $("cite", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>abbr</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T abbr(Object... attributesAndOptionalValue) {
    $("abbr", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>acronym</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T acronym(Object... attributesAndOptionalValue) {
    $("acronym", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>q</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T q(Object... attributesAndOptionalValue) {
    $("q", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>sub</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T sub(Object... attributesAndOptionalValue) {
    $("sub", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>sup</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T sup(Object... attributesAndOptionalValue) {
    $("sup", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>tt</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T tt(Object... attributesAndOptionalValue) {
    $("tt", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>i</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T i(Object... attributesAndOptionalValue) {
    $("i", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>b</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T b(Object... attributesAndOptionalValue) {
    $("b", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>big</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T big(Object... attributesAndOptionalValue) {
    $("big", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>small</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T small(Object... attributesAndOptionalValue) {
    $("small", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>object</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T object(Object... attributesAndOptionalValue) {
    $("object", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>param</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T param(Object... attributesAndOptionalValue) {
    $("param", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>img</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T img(Object... attributesAndOptionalValue) {
    $("img", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>map</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T map(Object... attributesAndOptionalValue) {
    $("map", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>area</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T area(Object... attributesAndOptionalValue) {
    $("area", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>form</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T form(Object... attributesAndOptionalValue) {
    $("form", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>label</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T label(Object... attributesAndOptionalValue) {
    $("label", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>input</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T input(Object... attributesAndOptionalValue) {
    $("input", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>select</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T select(Object... attributesAndOptionalValue) {
    $("select", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>optgroup</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T optgroup(Object... attributesAndOptionalValue) {
    $("optgroup", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>option</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T option(Object... attributesAndOptionalValue) {
    $("option", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>textarea</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T textarea(Object... attributesAndOptionalValue) {
    $("textarea", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>fieldset</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T fieldset(Object... attributesAndOptionalValue) {
    $("fieldset", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>legend</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T legend(Object... attributesAndOptionalValue) {
    $("legend", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>button</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T button(Object... attributesAndOptionalValue) {
    $("button", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>table</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T table(Object... attributesAndOptionalValue) {
    $("table", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>caption</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T caption(Object... attributesAndOptionalValue) {
    $("caption", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>thead</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T thead(Object... attributesAndOptionalValue) {
    $("thead", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>tfoot</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T tfoot(Object... attributesAndOptionalValue) {
    $("tfoot", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>tbody</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T tbody(Object... attributesAndOptionalValue) {
    $("tbody", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>colgroup</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T colgroup(Object... attributesAndOptionalValue) {
    $("colgroup", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>col</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T col(Object... attributesAndOptionalValue) {
    $("col", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>tr</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T tr(Object... attributesAndOptionalValue) {
    $("tr", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>th</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T th(Object... attributesAndOptionalValue) {
    $("th", attributesAndOptionalValue);
    return _this();
  }

  /**
   * The <code>td</code> element.
   * 
   * @see Xml#$(String, Object...)
   */
  public T td(Object... attributesAndOptionalValue) {
    $("td", attributesAndOptionalValue);
    return _this();
  }
}