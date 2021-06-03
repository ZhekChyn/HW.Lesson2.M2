package com.geektech;

public class Daughter extends Mother implements Printable{
    private String hairColor;

    public Daughter(String name, int age, int height, String hairColor) {
        super(name, age, height);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() +
                "\nHeight: " + getHeight() + "\nHair Color: " + getHairColor());
    }
}
