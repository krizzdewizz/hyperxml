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

import java.util.LinkedList;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/**
 * Writes arbitrary xml to a {@link ContentHandler} destination using only one
 * method {@link #$(String, Object...)}.
 * <p>
 * <code>$()</code> expects its parameters as follows:
 * <p>
 * <img border="1" src="doc-files/sugar4xml_element_method.png">
 * <p>
 * Example:
 * 
 * <pre>
 * $("html");
 * {
 *   $("body");
 *   {
 *      $("h1", "hello world", $);
 *   }
 *   $();
 * }
 * $();
 * 
 * --&gt;
 * 
 * &lt;page&gt;&lt;body&gt;&lt;h1&gt;hello world&lt;/h1&gt;&lt;/body&gt;&lt;/page&gt;
 * 
 * </pre>
 * 
 * @author krizzdewizz
 */
public class Xml<T extends Xml<?>> {

	/**
	 * Default, type-argument less implementation.
	 */
	public static class Default extends Xml<Default> {
		public Default() {
		}

		public Default(ContentHandler contentHandler) {
			super(contentHandler);
		}
	}

	/**
	 * The <code>xmlns</code> attribute used for namespace declaration with an
	 * empty prefix.
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * $("schema", xmlns, "http://www.w3.org/2001/XMLSchema", $);
	 * 
	 * --&gt;
	 * 
	 * &lt;schema xmlns='http://www.w3.org/2001/XMLSchema'/&gt;
	 * </pre>
	 * 
	 * @see #xmlns(Object)
	 */
	public static final String xmlns = "xmlns";

	/**
	 * If given as last argument to {@link #$(String, Object...)}, will call
	 * {@link #$()} just after starting the element (auto-end). Resembles XML
	 * short closing of tags like <code>&lt;x/&gt;</code> ->
	 * <code>$("x", $)</code>.
	 */
	public static final Object $ = new Object();

	/**
	 * Returns an <code>xmlns</code> attribute for the given prefix used for a
	 * namespace declaration.
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * $$("xs", "schema", xmlns("xs"), "http://www.w3.org/2001/XMLSchema", $);
	 * 
	 * --&gt;
	 * 
	 * &lt;xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'/&gt;
	 * </pre>
	 * 
	 * @param prefix
	 * @return String
	 */
	public static String xmlns(Object prefix) {
		return new StringBuilder(xmlns).append(':').append(prefix).toString();
	}

	/**
	 * Returns the attribute name for the given namespace prefix.
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * $("content", xmlns("a"), "com.acme", nsattr("a", "id"), "zx500", $);
	 * 
	 * --&gt;
	 * 
	 * &lt;content xmlns:a='com.acme' a:id='zx500'/&gt;
	 * </pre>
	 * 
	 * @param prefix
	 * @param name
	 * @return String
	 */
	public static String nsattr(String prefix, String name) {
		return new StringBuilder(prefix).append(':').append(name).toString();
	}

	/**
	 * The underlying handler.
	 */
	private ContentHandler _contentHandler;

	/**
	 * Stack of element names started so far. Using <code>LinkedList</code>
	 * instead of <code>Stack</code> because synch is not needed.
	 */
	private final LinkedList<String> _stack;

	/**
	 * A default prefix for all elements written if no prefix is given in
	 * <code>$$()</code>.
	 */
	private String _defaultElementNsPrefix;

	/**
	 * Reused for startElement calls.
	 */
	private final AttributesImpl _attrs;

	private static String toString(Object obj) {
		return obj == null ? null : String.valueOf(obj);
	}

	/**
	 * Constructs with a <code>null</code> writer.
	 * <p>
	 * Note that {@link #setContentHandler(ContentHandler)} must be called
	 * before the xml is created or else a {@link HyperXmlException} will occur.
	 */
	public Xml() {
		this(null);
	}

	/**
	 * Constructs with the given contentHandler.
	 * 
	 * @param writer
	 *            Where to write this xml to
	 */
	public Xml(ContentHandler contentHandler) {
		_contentHandler = contentHandler;
		_defaultElementNsPrefix = "";
		_stack = new LinkedList<String>();
		_attrs = new AttributesImpl();
	}

	/**
	 * Builds this xml by calling {@link #create()}.
	 * 
	 * @return <code>this</code>
	 * @throws HyperXmlException
	 *             if <code>$()</code> and <code>$()</code> calls do not match
	 *             (mal-formed xml output).
	 */
	public T build() {
		create();
		checkStack();
		return _this();
	}

	protected void create() {
	}

	/**
	 * Checks that the name stack is empty upon endDocument().
	 * 
	 * @throws HyperXmlException
	 *             if the name stack is not empty
	 */
	private void checkStack() {
		if (_stack.isEmpty()) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (String name : _stack) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(name);
		}

		throw new HyperXmlException("Missing call to $(). Names left on stack: '" + sb + "'.");
	}

	/**
	 * Outputs the given text using a <code>character()</code> call.
	 * 
	 * @param text
	 * @return <code>this</code>
	 */
	public T text(String text) {
		char[] ch = text.toCharArray();
		return characters(ch, 0, ch.length);
	}

	/**
	 * Outputs the given characters.
	 * 
	 * @param ch
	 * @param start
	 * @param length
	 * @return <code>this</code>
	 * @see ContentHandler#characters(char[], int, int)
	 */
	public T characters(char[] ch, int start, int length) {
		try {
			_contentHandler.characters(ch, start, length);
			return _this();
		} catch (Exception e) {
			throw HyperXmlException.wrap(e);
		}
	}

	/**
	 * Starts an element (namespace element with an empty prefix), its
	 * attributes and an optional value. If the last argument is {@link @#$},
	 * will call {@link #$()} just after starting the element (auto-end).
	 * <p>
	 * <img border="1" src="doc-files/sugar4xml_element_method.png">
	 * 
	 * @param name
	 *            The name of the element
	 * @param attributesAndOptionalValue
	 *            attribute [name, value] pairs, optionally followed by a single
	 *            value.If the last argument is {@link @#$}, will call
	 *            {@link #$()} just after starting the element (auto-end). If
	 *            the length of the array is odd, the last element designates
	 *            the value for the element. May be empty. An attribute name may
	 *            be namespace-prefixed.
	 * @return <code>this</code>
	 * @see #$$(String, String, Object...)
	 */
	public T $(String name, Object... attributesAndOptionalValue) {
		return $$("", name, attributesAndOptionalValue);
	}

	/**
	 * Starts a namespace prefixed element, its attributes and an optional
	 * value.
	 * 
	 * @param nsPrefix
	 *            Namespace prefix. If null or empty,
	 *            {@link #getDefaultElementNsPrefix()} is used instead
	 * @param name
	 *            The name of the element
	 * @param attributesAndOptionalValue
	 *            attribute [name, value] pairs, optionally followed by a single
	 *            value. If the length of the array is odd, the last element
	 *            designates the value for the element. May be empty. An
	 *            attribute name may be namespace-prefixed.
	 * @return <code>this</code>
	 */
	public T $$(String nsPrefix, String name, Object... attributesAndOptionalValue) {
		try {

			if (nsPrefix == null || nsPrefix.isEmpty()) {
				nsPrefix = getDefaultElementNsPrefix();
			}

			if (_stack.isEmpty()) {
				// first call to element. start document
				_contentHandler.startDocument();
			}

			_attrs.clear();
			String elementValue = null;
			int nParams = attributesAndOptionalValue.length;
			boolean endElement = false;

			if (nParams > 0) {

				if (attributesAndOptionalValue[nParams - 1] == $) {
					endElement = true;
					nParams--;
				}

				boolean paramsOdd = (nParams % 2) > 0;

				if (paramsOdd) {
					// last
					elementValue = toString(attributesAndOptionalValue[nParams - 1]);
				}

				if (nParams > 1) {
					if (paramsOdd) {
						nParams--;
					}
					for (int i = 0; i < nParams; i += 2) {
						String attrQName = toString(attributesAndOptionalValue[i]);
						String attrValue = toString(attributesAndOptionalValue[i + 1]);

						if (attrValue != null) {
							_attrs.addAttribute("", "", attrQName, "", attrValue);
							startPrefixMapping("", attrQName, attrValue);
						}
					}
				}
			}

			String elementQName = nsPrefix.isEmpty() ? name : new StringBuilder(nsPrefix).append(':').append(name).toString();

			_contentHandler.startElement("", "", elementQName, _attrs);
			_attrs.clear();

			if (elementValue != null) {
				text(elementValue);
			}

			_stack.add(elementQName);

			if (endElement) {
				$();
			}

			return _this();
		} catch (Exception e) {
			throw HyperXmlException.wrap(e);
		}
	}

	private void startPrefixMapping(String localName, String qName, String value) {
		try {
			if (qName.startsWith(xmlns)) {
				int pos = qName.indexOf(':', xmlns.length());
				String prefix = (pos == -1) ? "" : qName.substring(pos + 1);
				_contentHandler.startPrefixMapping(prefix, value);
			}
		} catch (Exception e) {
			HyperXmlException.wrap(e);
		}
	}

	/**
	 * Ends the last written element.
	 * 
	 * @return <code>this</code>
	 */
	public T $() {
		try {
			if (_stack.isEmpty()) {
				throw new HyperXmlException("Too many calls to $().");
			}
			String qName = _stack.removeLast();

			_contentHandler.endElement("", "", qName);

			if (_stack.isEmpty()) {
				_contentHandler.endDocument();
			}

			return _this();
		} catch (Exception e) {
			throw HyperXmlException.wrap(e);
		}
	}

	@SuppressWarnings("unchecked")
	protected T _this() {
		return (T) this;
	}

	/**
	 * Returns the default prefix for all elements written if no prefix is
	 * given.
	 * 
	 * @return Prefix
	 */
	public String getDefaultElementNsPrefix() {
		return _defaultElementNsPrefix;
	}

	/**
	 * Sets the default prefix for all elements written if no prefix is given.
	 * 
	 * @param defaultElementNsPrefix
	 */
	public void setDefaultElementNsPrefix(String defaultElementNsPrefix) {
		_defaultElementNsPrefix = defaultElementNsPrefix == null ? "" : defaultElementNsPrefix;
	}

	public ContentHandler getContentHandler() {
		return _contentHandler;
	}

	public void setContentHandler(ContentHandler contentHandler) {
		_contentHandler = contentHandler;
	}

	public static class HyperXmlException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		static HyperXmlException wrap(Throwable t) {
			if (t instanceof HyperXmlException) {
				return HyperXmlException.class.cast(t);
			} else {
				return new HyperXmlException(t);
			}
		}

		private HyperXmlException(String message) {
			super(message);
		}

		private HyperXmlException(Throwable cause) {
			super(cause);
		}
	}
}