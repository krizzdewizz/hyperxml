package org.hyperxml;

import java.io.OutputStream;
import java.io.Writer;
import java.util.LinkedList;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/**
 * Writes arbitrary xml with only the method {@link #$(String, Object...)}.
 * <p>
 * <code>$()</code> expects its parameters as follows:
 * <p>
 * Example:
 * 
 * <pre>
 * $("html");
 * {
 *   $("body", "onload", "doThings()");               // attribute name-value pairs
 *   {
 *      $("h1", "class", "title", "hello world", $);  // with text content, $ --&gt; 'short close' 
 *   }
 *   $(); // body                                     // no parameters --&gt; end element
 * }
 * $(); // html
 * 
 * --&gt;
 * 
 * &lt;html&gt;
 *   &lt;body onload=&quot;doThings()&quot;&gt;
 *     &lt;h1 class=&quot;title&quot;&gt;hello world&lt;/h1&gt;
 *   &lt;/body&gt;
 * &lt;/html&gt;
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
	 * short closing of tags like <code>&lt;x/&gt;</code> --&gt;
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
	 *            The prefix for the namespace declaration
	 * @return <code>xmlns:&lt;prefix&gt;</code>
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
	 *            The namespace prefix
	 * @param name
	 *            The attribute name
	 * @return <code>&lt;prefix&gt;:&lt;name&gt;</code>
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

	public Xml() {
		_defaultElementNsPrefix = "";
		_stack = new LinkedList<String>();
		_attrs = new AttributesImpl();
	}

	/**
	 * Builds this xml by calling {@link #create()} using the given content
	 * handler.
	 * <p>
	 * May be called several times.
	 * 
	 * @param contentHandler
	 *            To where to write this xml to
	 * @return this
	 */
	public T build(ContentHandler contentHandler) {
		try {
			_contentHandler = contentHandler;
			create();
			checkStack();
			return _this();
		} finally {
			_contentHandler = null;
		}
	}

	/**
	 * Builds the xml by transforming it to the given output stream.
	 * <p>
	 * May be called several times.
	 * 
	 * @param out
	 *            destination
	 * @return this
	 */
	public T build(OutputStream out) {
		return build(new StreamResult(out));
	}

	/**
	 * Builds the xml by transforming it to the given writer.
	 * <p>
	 * May be called several times.
	 * 
	 * @param out
	 *            destination
	 * @return this
	 */
	public T build(Writer out) {
		return build(new StreamResult(out));
	}

	private T build(StreamResult result) {
		try {
			SAXTransformerFactory f = (SAXTransformerFactory) TransformerFactory.newInstance();
			TransformerHandler handler = f.newTransformerHandler();
			handler.setResult(result);
			return build(handler);
		} catch (Exception e) {
			throw HyperXmlException.wrap(e);
		}
	}

	/**
	 * Maybe overridden by subclasses.
	 */
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
	 *            The text to output
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
	 *            char array
	 * @param start
	 *            Start
	 * @param length
	 *            Length
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
	 * attributes and an optional value. If the last argument is <code>$</code>,
	 * will call {@link #$(String, Object...)} w/o parameters, just after
	 * starting the element (auto-end).
	 * 
	 * @param name
	 *            The name of the element
	 * @param params
	 *            attribute [name, value] pairs, optionally followed by a single
	 *            value.If the last argument is <code>$</code>, will call
	 *            {@link #$(String, Object...)} w/o parameters, just after
	 *            starting the element (auto-end). If the length of the array is
	 *            odd, the last element designates the value for the element.
	 *            May be empty. An attribute name may be namespace-prefixed.
	 * @return <code>this</code>
	 * @see #$$(String, String, Object...)
	 */
	public T $(String name, Object... params) {
		return $$("", name, params);
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
	 * @param params
	 *            attribute [name, value] pairs, optionally followed by a single
	 *            value. If the length of the array is odd, the last element
	 *            designates the value for the element. May be empty. An
	 *            attribute name may be namespace-prefixed.
	 * @return <code>this</code>
	 */
	public T $$(String nsPrefix, String name, Object... params) {
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
			int nParams = params.length;
			boolean endElement = false;

			if (nParams > 0) {

				if (params[nParams - 1] == $) {
					endElement = true;
					nParams--;
				}

				boolean paramsOdd = (nParams % 2) > 0;

				if (paramsOdd) {
					// last
					elementValue = toString(params[nParams - 1]);
				}

				if (nParams > 1) {
					if (paramsOdd) {
						nParams--;
					}
					for (int i = 0; i < nParams; i += 2) {
						String attrQName = toString(params[i]);
						String attrValue = toString(params[i + 1]);

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
	 *            The default prefix
	 */
	public void setDefaultElementNsPrefix(String defaultElementNsPrefix) {
		_defaultElementNsPrefix = defaultElementNsPrefix == null ? "" : defaultElementNsPrefix;
	}

	/**
	 * The current content handler.
	 * 
	 * @return contentHandler, non-null only during <code>build()</code> calls.
	 */
	public ContentHandler getContentHandler() {
		return _contentHandler;
	}

	/**
	 * @param contentHandler
	 *            nullable
	 */
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