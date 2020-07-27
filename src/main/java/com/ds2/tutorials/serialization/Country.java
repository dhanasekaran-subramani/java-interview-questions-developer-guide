package com.ds2.tutorials.serialization;

import java.io.Serializable;

public class Country implements Serializable {

    String name;
    transient long population; //TODO -How can you avoid certain member variable of class to be serialized? - transient


    public Country() {
        super();
    }

    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

}