package net.ukr.dreamsicle.XMLandJSONExample.DOM.BookCatalog;

import java.util.Date;

/**
 * Created by Yura on 02.05.2017.
 */
public class Book {
    public enum Currency {
        UAH, USD, EUR
    };

    private String author;
    private String title;
    private String genre;
    private double price;
    private Date publishDate;
    private Currency cur = Currency.UAH;

    public Book(String author, String title, String genre, double price, Date publishDate) {
        super();
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publishDate = publishDate;
    }

    public Book() {
        super();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Currency getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = Currency.valueOf(cur);
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", genre=" + genre + ", price=" +
                price + " " + cur.toString() + ", publishDate=" + publishDate + "]";
    }
}
