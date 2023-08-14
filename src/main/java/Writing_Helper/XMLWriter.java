package Writing_Helper;

import Reading_Helper.PropReader;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XMLWriter {

    public static void updateXMLData(String node, String value) {

        Document document = getDocument();
        updateNodeValue(document, node, value);
        writeXMLFile(document);
    }

    @NotNull
    private static Document getDocument() {
        Document document;
        File file = new File(PropReader.readConfig("xml-data"));
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;

        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();

            document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            return document;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void updateNodeValue(Document doc, String node, String value) {

        doc.getElementsByTagName(node).item(0).getFirstChild().setTextContent(value);

    }

    private static void writeXMLFile(Document doc) {
        doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(PropReader.readConfig("xml-data")));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML file updated successfully");
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
