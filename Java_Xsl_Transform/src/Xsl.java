
public class Xsl {

	public static void main(String[] args) {
		System.setProperty("line.separator", "\n");
		XmlTransform.Transform("xsl/test.xml", "xsl/test.xsl", "xsl/testFinal.xml");

	}

}
