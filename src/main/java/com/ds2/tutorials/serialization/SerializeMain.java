package com.ds2.tutorials.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

    //TODO - Serialization
    public static void main(String[] args) {

        Country india = new Country();
        india.setName("India");
        india.setPopulation(100000);
        try {
            FileOutputStream fileOut = new FileOutputStream("country.ser");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(india);
            outStream.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("serialized");
    }
}