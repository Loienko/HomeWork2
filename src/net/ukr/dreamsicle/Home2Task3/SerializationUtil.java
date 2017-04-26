package net.ukr.dreamsicle.Home2Task3;

import java.io.*;

/**
 * Created by Yura on 24.04.2017.
 */
public class SerializationUtil {

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        ois.close();
        return obj;

    }

    public static void serialize(Object obj, String fileName) throws IOException {

        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();

    }
}
