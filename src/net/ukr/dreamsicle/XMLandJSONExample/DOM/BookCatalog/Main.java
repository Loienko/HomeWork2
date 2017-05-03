package net.ukr.dreamsicle.XMLandJSONExample.DOM.BookCatalog;

import java.io.File;

/**
 * Created by Yura on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Catalog catalog = CatalogXMLWorker.loadCatalogFromXMLFile(new File("catalog.xml"));
        System.out.println(catalog);
    }

}
