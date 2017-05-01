package net.ukr.dreamsicle.Home2Task1.GetClassReflection.SetCloseTypeClass;

import net.ukr.dreamsicle.Home2Task1.GetClassReflection.Worker.FileWorker;

import java.lang.reflect.Field;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainSetCloseTypeClass {
    public static void main(String[] args) {
        FileWorker fw = new FileWorker("a.txt");
        Class<?> fileClass = fw.getClass();
        Field fieldOne;
        try {
            fieldOne = fileClass.getDeclaredField("isByteFile");
            fieldOne.setAccessible(true);
            fieldOne.setBoolean(fw, false);
        } catch (NoSuchFieldException | SecurityException |
                IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //byte[] mass = fw.getByteFromFile();
    }
}
