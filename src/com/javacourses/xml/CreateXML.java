package com.javacourses.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Oleg on 02.02.14.
 */
public class CreateXML {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, FileNotFoundException {
        //Get a document builder
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();

        //Get an empty document
        Document doc=builder.newDocument();

        // Construct the elements of the document
        Element rootElement=doc.createElement("rootName");
        Element childElement=doc.createElement("childName");

        // Construct text nodes
        Text textNode=doc.createTextNode("textContents");

        // Add the root element to the document
        doc.appendChild(rootElement);

        //Add the child nodes to their parents
        rootElement.appendChild(childElement);
        childElement.appendChild(textNode);

        //Set element attributes
        rootElement.setAttribute("ccy", "KDH");
        rootElement.setAttribute("tfd", "POS");

        childElement.setAttribute("ghf", "456");

        // Save to file
        Transformer t= TransformerFactory.newInstance().newTransformer();
        File file=new File("D:\\myxml.xml");
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(file)));
    }
}
