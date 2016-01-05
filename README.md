# hyperxml
Simple SAX-like XML builder.

## Usage
Create a subclass of `Xml.Default` and override the `create()` method:

```
Xml.Default xml = new Xml.Default() {
    protected void create() {
        
        $("html");
        {
            $("body", "onload", "doThings()");                // attribute name-value pairs
            {
                $("h1", "class", "title", "hello world", $);  // with text content, $ --> short close
            }
            $(); // body                                      // no parameters --> end element
        }
        $(); // html
        
    }
};

```

Build the XML by transforming it to a `Writer`:
```
StringWriter out = new StringWriter();
xml.build(out);
System.out.println(out);
```

will produce:
```
<html>
    <body onload="doThings()">
        <h1 class="title">hello world</h1>
    </body>
</html>
```

Other build destinations are `OutputStream` and the generic `ContentHandler`.

No DOM or whatsoever is created. `$` calls translate directly to SAX `ContentHandler` `startElement` / `endElement` calls.

Though nesting the `$` calls with empty braces seems like one forgot an `if` or so, it is recommended for better readability.

End-element calls (`$` with no parameters) do not need the element name, as this is handled by `Xml`. 
A runtime error will occur upon start/end call mismatch. For better maintenance, it is recommended to comment the end element call though.


## (X)HTML support
For easier building of (X)HTML output, subclass `org.hyperxml.support.XHtml` instead: 

```
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
```

will produce:
```
<html>
    <style>.title{color:red;}</style>
    <script>function doThings() { alert('done'); }</script>
    <body onload="doThings()">
        <h1 class="title">hello world</h1>
    </body>
</html>
```

`XHtml` provides a method for each known (X)HTML element and a constant for each known (X)HTML attribute. You can freely mix it with generic `$` calls.

