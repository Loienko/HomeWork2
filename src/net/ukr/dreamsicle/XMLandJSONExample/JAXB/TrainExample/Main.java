package net.ukr.dreamsicle.XMLandJSONExample.JAXB.TrainExample;

import java.io.File;
import java.util.Date;

/**
 * Created by Yura on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Trains trains = new Trains();
        trains.addTrain(new Train("London", "Paris", new Date(1234555556789L)));
        trains.addTrain(new Train("London", "Monako", new Date(1235555556789L)));
        trains.addTrain(new Train("London", "Lviv", new Date(1234655556789L)));
        trains.addTrain(new Train("London", "Kiev", new Date(1234755556789L)));
        JAXBWorker.saveToXMLFile(trains, new File("prom.xml"));
        Trains trainsTwo = JAXBWorker.loadFromXMLFile(new File("prom.xml"));
        System.out.println(trainsTwo);
    }
}
