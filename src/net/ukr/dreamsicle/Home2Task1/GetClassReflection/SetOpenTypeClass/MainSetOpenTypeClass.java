package net.ukr.dreamsicle.Home2Task1.GetClassReflection.SetOpenTypeClass;

import net.ukr.dreamsicle.Home2Task1.GetClassReflection.Worker.FileWorker;

import java.lang.reflect.Field;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainSetOpenTypeClass {
    public static void main(String[] args) {
        FileWorker fw = new FileWorker("a.txt");
        Class<?> fileClass = fw.getClass();
        Field fieldOne;
        try {
            fieldOne = fileClass.getDeclaredField("size");
            fieldOne.setLong(fw, 912345L); // для какого обьекта устанавливаем свойство, Новое значение устанавливаемого свойства
        } catch (NoSuchFieldException | SecurityException |
                IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(fw.toString());
    }
}
