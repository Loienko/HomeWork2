package net.ukr.dreamsicle.Task3;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Yura on 28.04.2017.
 */
@XmlRootElement(name="results")
public class Results {

    public List<Rate> rates;

    public Results(){}

    public Results(List<Rate> rates) {
        this.rates = rates;
    }

    public List<Rate> getRates() {
        return rates;
    }
    @XmlElement(name="rate")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Results{" +
                "rates=" + rates +
                '}';
    }
}
