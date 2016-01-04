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

import org.hyperxml.support.XHtmlTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author krizzdewizz
 */
public class HyperXmlTests {

	public static Test suite() throws Exception {
		TestSuite suite = new TestSuite("Test for HyperXml");
		// $JUnit-BEGIN$
		// suite.addTestSuite(SchemaBuilderTest.class);
		suite.addTestSuite(XmlTest.class);
		suite.addTestSuite(XHtmlTest.class);
		// $JUnit-END$
		return suite;
	}

}
