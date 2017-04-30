package net.ukr.dreamsicle.Home2Task3;

/**
 * Created by Yura on 29.04.2017.
 */
public class Rate {
    private String id;
    private String name;
    private double rate;
    private String date;
    private String time;
    private double ask;
    private double bid;

    public Rate(String id, String name, double rate, String date, String time, double ask, double bid) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.date = date;
        this.time = time;
        this.ask = ask;
        this.bid = bid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rate rate1 = (Rate) o;

        if (Double.compare(rate1.rate, rate) != 0) return false;
        if (Double.compare(rate1.ask, ask) != 0) return false;
        if (Double.compare(rate1.bid, bid) != 0) return false;
        if (id != null ? !id.equals(rate1.id) : rate1.id != null) return false;
        if (name != null ? !name.equals(rate1.name) : rate1.name != null) return false;
        if (date != null ? !date.equals(rate1.date) : rate1.date != null) return false;
        return time != null ? time.equals(rate1.time) : rate1.time == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        temp = Double.doubleToLongBits(ask);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
