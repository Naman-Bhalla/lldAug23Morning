package com.scaler.generics;

public class Dog extends Animal{
    int height = 6;

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
