package com.brent;

public class Animal {
    private String name;
    private int numberOfLegs;
    private String bestFood;


    public Animal(String name, int numberOfLegs, String bestFood){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.bestFood = bestFood;
    }

    public void eat(){
        System.out.println(name+" is eating "+bestFood);
    }
}