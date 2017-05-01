package net.ukr.dreamsicle.Home2Task1.TrainList;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yura on 18.04.2017.
 */
@XmlRootElement(name = "trains")
/*@XmlAccessorType(XmlAccessType.FIELD)*/
public class Trains {

    @XmlElement(name="train")
    private List<Train> trains = new ArrayList<>();

    public void addTrains(Train train){
        trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(trains.toArray());
    }
}
