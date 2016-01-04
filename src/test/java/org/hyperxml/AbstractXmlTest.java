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
import java.io.Writer;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLTestCase;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.ContentHandler;

/**
 * @author krizzdewizz
 */
abstract public class AbstractXmlTest extends XMLTestCase {
	public static ContentHandler createContentHandler(Writer out) {
		try {
			SAXTransformerFactory f = (SAXTransformerFactory) TransformerFactory.newInstance();
			TransformerHandler h = f.newTransformerHandler();

			h.setResult(new StreamResult(out));

			return h;
		} catch (Exception e) {
			throw Xml.HyperXmlException.wrap(e);
		}
	}

	protected static String createXmlContent(Xml<?> xml) {
		StringWriter out = new StringWriter();
		ContentHandler handler = createContentHandler(out);
		xml.setContentHandler(handler);
		xml.build();
		return out.toString();
	}

	public static void myAssertXMLEqual(String expected, String actual) throws Exception {
		boolean oldIgnoreWhitespace = XMLUnit.getIgnoreWhitespace();
		try {
			XMLUnit.setIgnoreWhitespace(true);

			Diff myDiff = new Diff(expected, actual);
			if (!myDiff.similar()) {
				assertEquals(myDiff.toString(), "expected=" + expected, "actual=" + actual);
			}
		} finally {
			XMLUnit.setIgnoreAttributeOrder(oldIgnoreWhitespace);
		}
	}

}
