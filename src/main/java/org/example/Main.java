package org.example;

public class Main {
    public static void main(String[] args) {
        GenericsClass<String, Integer, Float> genericsClass = new GenericsClass<>("Hello", 123, 3.14f);
        genericsClass.printClassNames();
    }
}