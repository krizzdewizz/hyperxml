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
package org.hyperxml;

import java.io.StringWriter;

import org.hyperxml.support.XHtml;

/**
 * @author krizzdewizz
 */
public class XmlTest extends AbstractXmlTest {

	public void testSingleDocElemNs() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$$("x", "xml", xmlns("x"), "http://com.acme", $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<x:xml xmlns:x='http://com.acme'></x:xml>", result);
	}

	public void testSingleDocElemNsWithAttrs() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$$("x", "xml", xmlns("x"), "http://com.acme", xmlns("a"), "http://com.acme.attribute", nsattr("a", "color"), "red");
				{
					$$("x", "nested", "a:color", "green", $);
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<x:xml xmlns:x='http://com.acme' xmlns:aaa='http://com.acme.attribute' aaa:color='red'><x:nested aaa:color='green'/></x:xml>", result);
	}

	public void testSingleDocElemNsMultiples() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$$("x", "xml", xmlns("x"), "http://com.acme", xmlns("a"), "http://com.acme.attribute");
				{
					$$("a", "BODY", $);
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<x:xml xmlns:x='http://com.acme' xmlns:aaa='http://com.acme.attribute'><aaa:BODY/></x:xml>", result);
	}

	public void testSingleDocElemNsEmptyPrefix() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", xmlns, "http://com.acme", $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<x:xml xmlns:x='http://com.acme'></x:xml>", result);
		myAssertXMLEqual("<xml xmlns='http://com.acme'></xml>", result);
	}

	public void testSingleDocElem() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", $);
			}
		};

		myAssertXMLEqual("<xml></xml>", createXmlContent(xml));
	}

	public void testSingleDocElemWithValue() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", "hello world!", $);
			}
		};

		myAssertXMLEqual("<xml>hello world!</xml>", createXmlContent(xml));
	}

	public void testSmallestPossibleXml() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("a", $);
			}
		};

		myAssertXMLEqual("<a/>", createXmlContent(xml));
	}

	public void testSingleDocElemWithSingleAttribute() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", "content-type", "text/css", $);
			}
		};

		myAssertXMLEqual("<xml content-type='text/css'></xml>", createXmlContent(xml));
	}

	public void testSingleDocElemWithSingleAttributeAndValue() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", "content-type", "text/css", "the value", $);
			}
		};

		myAssertXMLEqual("<xml content-type='text/css'>the value</xml>", createXmlContent(xml));
	}

	public void testSingleDocElemWithManyAttributes() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", "border", 1, "width", "100%", "enabled", true, $);
			}
		};

		myAssertXMLEqual("<xml border='1' width='100%' enabled='true'></xml>", createXmlContent(xml));
	}

	public void testSingleDocElemWithManyAttributesAndValue() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml", "border", 1, "width", "100%", "enabled", true, "value is here", $);
			}
		};

		myAssertXMLEqual("<xml border='1' width='100%' enabled='true'>value is here</xml>", createXmlContent(xml));
	}

	public void testNested() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("xml");
				{
					$("body");
					{
						$("p1", $);
						$("p2", $);
						$("h1", "border", true, $);
						$("b", "hello", $);
						$("code", "java.lang.String#valueOf(char)", $);
					}
					$();
				}
				$();
			}
		};

		myAssertXMLEqual("<xml><body><p1></p1><h1 border='true'></h1><b>hello</b><code>java.lang.String#valueOf(char)</code><p2></p2></body></xml>", createXmlContent(xml));
	}

	public void testXsSchema() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$$("xs", "schema", xmlns("xs"), "http://www.w3.org/2001/XMLSchema", $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'></xs:schema>", result);
	}

	public void testXsSchema2() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("schema", xmlns, "http://www.w3.org/2001/XMLSchema", $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'></xs:schema>", result);
		myAssertXMLEqual("<schema xmlns='http://www.w3.org/2001/XMLSchema'/>", result);
	}

	public void testNsAttr() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("content", xmlns("a"), "com.acme", nsattr("a", "id"), "zx500", $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<content xmlns:a='com.acme' a:id='zx500'/>", result);
	}

	public void testNsNested() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$$("o", "outer", xmlns("o"), "com.acme.outer", xmlns("i"), "com.acme.inner");
				{
					$$("i", "inner", $);
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<o:outer xmlns:o='com.acme.outer' xmlns:i='com.acme.inner'><i:inner/></o:outer>", result);
	}

	public void testMore453() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("page");
				{
					$("body");
					{
						$("h1", "hello world", $);
					}
					$();
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<page><body><h1>hello world</h1></body></page>", result);
	}

	public void testMore453abcx() throws Exception {
		StringWriter out = new StringWriter();
		Xml x = new Xml();
		x.setContentHandler(createContentHandler(out));
		x.$("page");
		{
			x.$("body");
			{
				x.text("abc");
			}
			x.$();
		}
		x.$();

		String result = out.toString();
		myAssertXMLEqual("<page><body>abc</body></page>", result);
	}

	public void testMore453abc() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("page");
				{
					$("body", "x", 1);
					{
						$("h1", "hello world with $", $);
						$("h2", "~h2", $);
					}
					$();
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<page><body x='1'><h1>hello world with $</h1><h2>~h2</h2></body></page>", result);
	}

	public void testAttrWithNullValue() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("content", "attr", null, $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<content/>", result);
	}

	public void testAttrWithNullText() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("content", null, $);
			}
		};

		String result = createXmlContent(xml);
		myAssertXMLEqual("<content/>", result);
	}

	public void testFailTooManyEnds() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("content", null, $);
				$();
			}
		};

		try {
			createXmlContent(xml);
			fail();
		} catch (Exception e) {
			// ok
			assertTrue(e.getMessage().contains("Too many calls"));
		}
	}

	public void testFailTooFewEnds() throws Exception {
		Xml xml = new Xml() {
			protected void create() {
				$("content");
			}
		};

		try {
			createXmlContent(xml);
			fail();
		} catch (Exception e) {
			// ok
			assertTrue(e.getMessage().contains("Missing call"));
		}
	}

	public void test4Doc() throws Exception {

		Xml xml = new Xml() {
			protected void create() {
				$("html");
				{
					$("body", "onload", "doThings()"); // attribute name-value
														// pairs
					{
						$("h1", "class", "title", "hello world", $); // with
																		// text
																		// content,
																		// $ -->
																		// 'short
																		// close'
					}
					$(); // body // no parameters --> end element
				}
				$(); // html
			}
		};
		StringWriter out = new StringWriter();
		xml.build(out);
		System.out.println(out);
	}

	public void test4DocHtml() throws Exception {

		XHtml xml = new XHtml() {
			protected void create() {
				html();
				{
					style();
					{
						css(".title", "color", "red");
					}
					$(); // style

					script();
					{
						text("function doThings() { alert('done'); }");
					}
					$(); // script

					body(onload, "doThings()");
					{
						h1(classs, "title", "hello world", $);
					}
					$(); // body
				}
				$(); // html
			}
		};
		StringWriter out = new StringWriter();
		xml.build(out);
		System.out.println(out);
	}
}
