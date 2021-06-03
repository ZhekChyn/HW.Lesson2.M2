package com.geektech;

public class Mother extends Grandmother implements Printable{
    private int height;

    public Mother(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nHeight: " + getHeight());
    }
}
