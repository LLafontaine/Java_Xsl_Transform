import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlTransform {

	public static void Transform(String xmlOrigine, String xslFileTransform, String resultatXml){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	      try {
	         //lecture de notre document XML ("test.xml")
	         DocumentBuilder builder = factory.newDocumentBuilder();
	         File fileXML = new File(xmlOrigine);
	         Document xml = builder.parse(fileXML);
	         
	         //définition du fichier de transformation XSL ("test.xsl")
	         File xslFile = new File(xslFileTransform);
	         
	         //Création de nos objets pour la transformation
	         StreamSource styleSource = new StreamSource(xslFile);
	         Transformer t = TransformerFactory.newInstance().newTransformer(styleSource);
	         
	         //Le fichier où nous allons enregistrer le résultat ("resultat.xml")
	         String resultFile = resultatXml; 
	         StreamResult XML = new StreamResult(resultFile);
	         //transformation et enregistrement dans le fichier
	         t.transform(new DOMSource(xml), XML);
	         
	      } catch (DOMException e) {
	         e.printStackTrace();
	      } catch (ParserConfigurationException e) {
	         e.printStackTrace();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (TransformerConfigurationException e) {
	         e.printStackTrace();
	      } catch (TransformerFactoryConfigurationError e) {
	         e.printStackTrace();
	      } catch (TransformerException e) {
	         e.printStackTrace();
	      } catch (SAXException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }   
	}
}