package net.ukr.dreamsicle.XMLandJSONExample.JAXB.TrainExample;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "train")
public class Train {

    private String from;
    private String to;
    private Date departureTime;

    public Train(String from, String to, Date departureTime) {
        super();
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
    }

    public Train() {
        super();
    }

    @XmlElement
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @XmlElement
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @XmlElement
    @XmlJavaTypeAdapter(TrainsDateFormatter.class)
    public Date getDepartureTime() {
        return departureTime;
    } public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - hh:mm");
        return from + " - " + to + " - " + sdf.format(departureTime);
    }
}
