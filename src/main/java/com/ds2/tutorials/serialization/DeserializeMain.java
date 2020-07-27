package com.ds2.tutorials.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {
    //TODO  -Deserialization
    public static void main(String[] args) {

        Country india = null;
        try {
            FileInputStream fileIn = new FileInputStream("country.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            india = (Country) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Country class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Country...");
        System.out.println("Country Name : " + india.getName());
        System.out.println("Population : " + india.getPopulation());

    }
}
