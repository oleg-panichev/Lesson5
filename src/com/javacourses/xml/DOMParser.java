package com.javacourses.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Oleg on 02.02.14.
 */
public class DOMParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //Get a document builder
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();

        // Read a document from a file
        //File f=new File("D:\pubinfo.xml");
        URL url=new URL("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5");
        Document doc=builder.parse(url.openStream());

        // Start analyzing the contents of a document, get the root element
        Element root=doc.getDocumentElement();

        // Get the element's children collection
        NodeList children=root.getChildNodes();
        for (int i=0; i<children.getLength(); i++) {
            Node child=children.item(i);
            NodeList newChild=child.getChildNodes();
            child = newChild.item(0);
            NamedNodeMap attributes = child.getAttributes();
            for (int k=0; k<attributes.getLength(); k++) {
                Node attribute=attributes.item(k);
                String name=attribute.getNodeName();
                String value=attribute.getNodeValue();
                System.out.print(name + " " + value + " ");
            }
            System.out.println();
        }
    }
}
