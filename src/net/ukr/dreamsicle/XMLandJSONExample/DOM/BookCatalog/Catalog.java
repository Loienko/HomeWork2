package net.ukr.dreamsicle.XMLandJSONExample.DOM.BookCatalog;

import java.util.ArrayList;

/**
 * Created by Yura on 02.05.2017.
 */
public class Catalog {

    private ArrayList<Book> listBook = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Null");
        }
        listBook.add(book);
    }

    public ArrayList<Book> getListBook() {
        return new ArrayList<Book>(listBook);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : listBook) {
            sb.append(book).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
