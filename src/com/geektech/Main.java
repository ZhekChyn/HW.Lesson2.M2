package com.geektech;

public class Main {

    public static void main(String[] args) {
        createObject("Diana");
        System.out.println("===================");
        createObject("Scarlett");
        System.out.println("===================");
        createObject("Mila");

    }
    public static String createObject(String className){
        Mother mother = new Mother("Diana", 50, 70);
        Daughter daughter = new Daughter("Scarlett", 34, 75, "Black");
        Granddaughter granddaughter = new Granddaughter("Mila", 18, 80, "Brown", "Victor");

        switch (className){
            case "Diana":
                mother.print();
                break;
            case "Scarlett":
                daughter.print();
                break;
            case "Mila":
                granddaughter.print();
                break;
        }
        return className;
    }
}
