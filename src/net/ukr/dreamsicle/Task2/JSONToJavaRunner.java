package net.ukr.dreamsicle.Task2;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Yura on 22.04.2017.
 */
public class JSONToJavaRunner {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "D:\\Java\\Java PRO\\Java PRO TASK\\HomeWork2\\web\\WEB-INF\\human.json";

        Gson gson = new Gson();
        FileReader reader = new FileReader(filePath);

        Human human = gson.fromJson(reader, Human.class);
        System.out.print(human);
    }
}
