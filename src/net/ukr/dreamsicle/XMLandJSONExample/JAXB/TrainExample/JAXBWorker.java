package net.ukr.dreamsicle.XMLandJSONExample.JAXB.TrainExample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Yura on 02.05.2017.
 */
public class JAXBWorker {
    public static void saveToXMLFile(Trains trains, File file) {
        try {
            JAXBContext jaxbC = JAXBContext.newInstance(Trains.class);
            Marshaller marSh = jaxbC.createMarshaller();
            marSh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marSh.marshal(trains, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Trains loadFromXMLFile(File file) {
        JAXBContext jaxbC = null;
        try {
            jaxbC = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbC.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            return trains;
        } catch (JAXBException e) {
            e.printStackTrace();
        }return null;
    }


}
