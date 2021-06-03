package com.geektech;

public class Granddaughter extends Daughter implements Printable{
    private String husbandsName;

    public Granddaughter(String name, int age, int height, String hairColor, String husbandsName) {
        super(name, age, height, hairColor);
        this.husbandsName = husbandsName;
    }

    public String getHusbandsName() {
        return husbandsName;
    }

    public void setHusbandsName(String husbandsName) {
        this.husbandsName = husbandsName;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() +
                "\nHeight: " + getHeight() + "\nHair Color: " + getHairColor() + "\nHusbands Name: " + getHusbandsName());
    }
}
