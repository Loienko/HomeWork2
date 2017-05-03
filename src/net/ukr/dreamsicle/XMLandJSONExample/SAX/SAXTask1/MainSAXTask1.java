package net.ukr.dreamsicle.XMLandJSONExample.SAX.SAXTask1;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Yura on 03.05.2017.
 */
public class MainSAXTask1 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, XMLStreamException {

        /*DefaultHandler defaultHandler = new DefaultHandler(){

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws jdk.internal.org.xml.sax.SAXException {
                String name = attributes.getValue("name");
                if (name != null & name.isEmpty());
                System.out.println(name);
            }

            @Override
            public void characters(char[] chars, int start, int length) throws jdk.internal.org.xml.sax.SAXException {
                String str = "";
                for (int i = 0; i < length; i++) {
                    start += chars[start + i];
                }
                System.out.println(str);
            }
        };

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        saxParser.parse(new File("prom.xml"), defaultHandler);
*/

        XMLInputFactory factory2 = XMLInputFactory.newFactory();
        XMLStreamReader parser2 = factory2.createXMLStreamReader(new FileInputStream("prom.xml"));

        while (parser2.hasNext()){
            int event = parser2.next();
            if (event == XMLStreamConstants.START_ELEMENT){
                System.out.println(parser2.getLocalName());
            }

            if (event == XMLStreamConstants.CHARACTERS){
                System.out.println(parser2.getLocalName());
            }


        }



    }
}
