package net.ukr.dreamsicle.XMLandJSONExample.JAXB.TrainExample;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Yura on 02.05.2017.
 */
public class TrainsDateFormatter extends XmlAdapter <String, Date>{

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - hh:mm");

    @Override
    public Date unmarshal(String v) throws Exception {
        Date date = new Date();
        try {
            date = sdf.parse(v);
        } catch (ParseException e) {
            System.out.println(e);
        } return date;
    }

    @Override
    public String marshal(Date v) throws Exception {
        return sdf.format(v);
    }
}
