package net.ukr.dreamsicle.XMLandJSONExample.JAXB.TrainExample;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Yura on 02.05.2017.
 */
@XmlRootElement
public class Trains {
    @XmlElement(name="train")
    private ArrayList<Train> listTrain = new ArrayList<>();

    public Trains() {
        super();
    }
    public void addTrain(Train train) {
        listTrain.add(train);
    }
    public ArrayList<Train> getListTrains() {
        return new ArrayList<>(listTrain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        listTrain.stream().forEachOrdered(n -> sb.append(n).append(System.lineSeparator()));
        return sb.toString();
    }
}
