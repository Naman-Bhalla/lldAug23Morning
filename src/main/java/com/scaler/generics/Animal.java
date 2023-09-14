package com.scaler.generics;

public class Animal {
    int age = 21;
    String name = "Hello";
    int weight = 80;

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
