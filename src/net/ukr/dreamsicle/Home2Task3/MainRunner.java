package net.ukr.dreamsicle.Home2Task3;

import java.io.IOException;

/**
 * Написать код, который сериализирует и десериализирует в/из файла все значения полей класса, которые
 отмечены аннотацией @Save.
 */
public class MainRunner {
    public static void main(String[] args) {

        Test test = new Test();
        test.setName("Hitesh");
        test.setUsername("Codingeek");
        test.setPassword("Garg");

        try {

            SerializationUtil.serialize(test, "serialization.txt");

            Test newTest = (Test) SerializationUtil.deserialize("serialization.txt");

            System.out.println(newTest.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
