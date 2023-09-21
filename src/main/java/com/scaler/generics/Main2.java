package com.scaler.generics;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    // List<? extends Animal>
    // List<Animal> a1 = {d1, d2, d3}
    // List<Dog>
    // List<Cat>
    public static void doSomething(List<? extends Animal> animals) {
//        List<Animal> animals1 = List.copyOf(animals);
        // List.copyOf(animals)
        // animals -> List<Animal>
        // animals -> List<Cat>
        // animals -> List<Dog>

        // List.copyOf()
         List<Animal> copy = new ArrayList<Animal>();
         for (Animal a: animals ) {
            copy.add(a);
         }


//        animals.add(new Dog());
        // List<Cat>
//        List<Animal> l1 = new ArrayList<Dog>();
//        l1.add(new Dog());

        //

    }

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Animal(),
                new Dog(),
                new Cat(),
                new Animal()
        );

        for (Animal a: animals) {
            a.hey();
        }
        //

    }
}
