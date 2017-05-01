package net.ukr.dreamsicle.Home2Task1.TrainList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Yura on 19.04.2017.
 */
public class TrainRunner {
    public static void main(String[] args) {

        try {
            String filePath = "D:\\Java\\Java PRO\\Java PRO TASK\\HomeWork2\\web\\WEB-INF\\trains.xml";

            File file = new File(filePath);

            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trains newTrains = (Trains) unmarshaller.unmarshal(file);

            newTrains.addTrains(new Train(3,"Kiev","Druzhkivka","17.04.2017","18:28"));
            newTrains.addTrains(new Train(3,"Kharkov","Odessa","19.04.2017","12:08"));
            newTrains.addTrains(new Train(3,"Lviv","Poltava","20.04.2017","15:46"));

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(newTrains, file);

            Unmarshaller unmarshaller1 = jaxbContext.createUnmarshaller();
            Trains newTrains2 = (Trains) unmarshaller.unmarshal(file);

            for (Train train : newTrains2.getTrains()) {
                String departure = train.getDeparture();
                String [] dep = departure.split(":");
                int hour = Integer.parseInt(dep[0]);
                int minute = Integer.parseInt(dep[1]);
                if ((hour >= 01 && hour <= 23) && (minute >= 0 && minute <= 59)){
                    System.out.println(train);
                }
                
            }
            
            //System.out.println(trains);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

/*
<!--<?xml version="1.0" encoding="UTF-8"?>
<trains>
<train id="1">
<from>Kyiv</from>
<to>Donetsk</to>
<date>19.12.2013</date>
<departure>15:05</departure>
</train>
<train id="2">
<from>Lviv</from>
<to>Donetsk</to>
<date>19.12.2013</date>
<departure>19:05</departure>
</train>
</trains>-->*/
