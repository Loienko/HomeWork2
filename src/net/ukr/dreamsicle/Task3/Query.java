package net.ukr.dreamsicle.Task3;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Yura on 28.04.2017.
 */
@XmlRootElement(name="query")
public class Query {

    private String yahoo;
    private String count;
    private String created;
    private String lang;
    private Results results;

    public String getYahoo() {
        return yahoo;
    }
    @XmlElement
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    public String getCount() {
        return count;
    }
    @XmlElement
    public void setCount(String count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }
    @XmlElement
    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }
    @XmlElement
    public void setLang(String lang) {
        this.lang = lang;
    }

    public Results getResults() {
        return results;
    }
    @XmlElement
    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" +
                "yahoo='" + yahoo + '\'' +
                ", count='" + count + '\'' +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Query query = (Query) o;

        if (yahoo != null ? !yahoo.equals(query.yahoo) : query.yahoo != null) return false;
        if (count != null ? !count.equals(query.count) : query.count != null) return false;
        if (created != null ? !created.equals(query.created) : query.created != null) return false;
        if (lang != null ? !lang.equals(query.lang) : query.lang != null) return false;
        return results != null ? results.equals(query.results) : query.results == null;
    }

    @Override
    public int hashCode() {
        int result = yahoo != null ? yahoo.hashCode() : 0;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (results != null ? results.hashCode() : 0);
        return result;
    }
}
