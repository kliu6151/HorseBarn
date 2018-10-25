package com.company;

public class Horsey implements Horse {
    private String name;
    private int weight;

    public Horsey (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName () {
        return this.name;
    }

    @Override
    public int getWeight () {
        return this.weight;
    }
    public String getHorse () {return "Horsey";}
}
