package net.ukr.dreamsicle.XMLandJSONExample.CreateNewXMLFile;


import org.w3c.dom.*;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Yura on 03.05.2017.
 */
public class DOMCreate {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
         Document document = builder.newDocument();

        Element root = (Element) document.createElement("root");
        Element font = (Element) document.createElement("font");
        Text text = document.createTextNode("TimesNewRoman");
        document.appendChild((Node) root);
        ((Node) root).appendChild((Node) font);
        ((Node) font).appendChild(text);
        font.setAttribute("size", "20");

        /*Transformer t = TransformerFactory.newInstance().newTransformer();   // записываем в файл
        t.setOutputProperty(OutputKeys.INDENT, "yes"); //при сохранении будут не в одну строчку в FS
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("temp.xml")));*/

        DOMImplementation impl = (DOMImplementation) document.getImplementation();
        DOMImplementationLS implLS = (DOMImplementationLS) impl.getFeature("LS", "3.0");
        LSSerializer ser = implLS.createLSSerializer();
        ser.getDomConfig().setParameter("format-pretty-print", true);
        //String str = ser.writeToString(document); // создаем текствоую строку
        //System.out.println(str);

        LSOutput out = implLS.createLSOutput();
        out.setEncoding("UTF-8");
        out.setByteStream(Files.newOutputStream(Paths.get("temp.xml")));
        ser.write(document, out);
    }
}
