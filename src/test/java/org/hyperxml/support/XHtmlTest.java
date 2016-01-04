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

import org.hyperxml.AbstractXmlTest;
import org.hyperxml.support.XHtml;

/**
 * @author krizzdewizz
 */
public class XHtmlTest extends AbstractXmlTest {

	private abstract static class MyXml extends XHtml<MyXml> {
	}

	public void testDoc() throws Exception {
		MyXml xml = new MyXml() {
			protected void create() {
				html();
				{
					body(onload, "alert('kuckuck')");
					{
						h3("hello", $);
					}
					$();
				}
				$();
			}
		};

		String result = createXmlContent(xml);
		System.out.println(getClass().getName() + ": " + result);
	}
}
