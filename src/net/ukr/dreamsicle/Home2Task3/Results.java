package net.ukr.dreamsicle.Home2Task3;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import java.util.List;

/**
 * Created by Yura on 28.04.2017.
 */
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
