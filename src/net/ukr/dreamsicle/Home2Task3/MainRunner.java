package net.ukr.dreamsicle.Home2Task3;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class MainRunner {

    private static void marshalingExample(Object ob, File file) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(ob.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal the employees list in console
        jaxbMarshaller.marshal(ob, System.out);

        // Marshal the employees list in file
        jaxbMarshaller.marshal(ob, file);
        System.out.println("Marshaller is copleted...");
    }

    private static Object unMarshalingExample(Object ob, URL url) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(ob.getClass());
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        System.out.println("Unmarshaller is copleted...");
        // We had written this file in marshalling example
        return jaxbUnmarshaller.unmarshal(url);

    }

    public static void main(String[] args) throws MalformedURLException, JAXBException {

        Query query = new Query();

        String httpPath = "http://query.yahooapis.com/v1/public/yql?format=json&q=select*from%20yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        URL url = new URL(httpPath);

        query = (Query) unMarshalingExample(query, url);
        System.out.println(query);
    }
}
