package hyperxml;

/**
 * @author krizz
 */
public class HtmlTest extends AbstractXmlTest {

	public void testDoc() throws Exception {
		Html xml = new Html() {
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
