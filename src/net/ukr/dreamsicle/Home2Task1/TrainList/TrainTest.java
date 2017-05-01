package net.ukr.dreamsicle.Home2Task1.TrainList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * Created by Yura on 19.04.2017.
 */
public class TrainTest {
    public static void main(String[] args) {

        Trains trains = new Trains();
        trains.addTrains(new Train(3,"Kiev","Druzhkivka","17.04.2017","18:28"));
        trains.addTrains(new Train(3,"Kharkov","Odessa","19.04.2017","12:08"));
        trains.addTrains(new Train(3,"Lviv","Poltava","20.04.2017","15:46"));

        try {
            //create JAXBElement of type Student
            //Pass it the student object
            JAXBElement<Trains> jaxbElement =  new JAXBElement(
                    new QName(Trains.class.getSimpleName()), Trains.class, trains);

            //Create a String writer object which will be
            //used to write jaxbElment XML to string
            StringWriter writer = new StringWriter();

            // create JAXBContext which will be used to update writer
            JAXBContext context = JAXBContext.newInstance(Trains.class);

            // marshall or convert jaxbElement containing student to xml format
            context.createMarshaller().marshal(jaxbElement, writer);

            //print XML string representation of Student object
            System.out.println( writer.toString() );

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
