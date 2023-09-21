package com.scaler.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Hello");
        Pair<Double, Double> coo1 = new Pair<>(30.1, 27.1);

//        String a = p1.getFirst();

//        Pair p3 = new Pair("Hello", "Hi");


//        Integer s = (Integer) p3.getFirst();
//        Objects
//      List<Integer> l
//      List l

        // Pair<String, INteger>
        // Pair

//        p1.doSomethingOnFirst("Hey");
        p1.printMoreFirsts(
                List.of(3, 1, 8, 9)
        );

        Pair<Animal, Integer> animalCounts = new Pair<>(new Animal(), 45);
        Animal a1 = new Animal();
        a1.name = "Naman";
        Animal a2 = new Animal();
        a2.name = "Amit";
        Animal a3 = new Dog();
        a3.name = "XYZ";
        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(a3);

        for (Animal a: animalsList) {
            System.out.println(a.name);
        }

        animalCounts.printMoreFirsts(
                List.of(a1, a2, a3)
        );

        Dog a4 = new Dog();
        a3.name = "ABC";

        Dog a5 = new Dog();
        a3.name = "DEF";


        List<Dog> dogs = new ArrayList<>();
//        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

        // dogs -> List<Dog>
        // animalCounts.FIRST -> ANIMAL
        // animalCounts.printMoreFirsts -> List<Animal>
        // Can I pass dogs to printMoreFirsts(dogs)
        // Can I pass List<Dog> to something that needs List<Animal>

        // Intuitively:
        // If I can pass a Dog to a variable of data type Animal
        // I should be able to pass a List<Dog> to a variable of type List<Animal>

//        animalCounts.printMoreFirsts(dogs);

        animalCounts.printMoreFirstsAgain(dogs);
        animalCounts.printMoreFirstsAgain(List.of(a1, a2, a3));

        List<Dog> l1 = dogs;
//        List<Animal> l2 = l1;
        List<? extends Animal> l2 = l1;

//        l2.forEach(
//                l1 -> l1.
//        );
        List<Animal> originalAnimals = new ArrayList<>();
        originalAnimals.add(a1);
        originalAnimals.add(a2);
        originalAnimals.add(a3);

        List<Animal> copyAnimals = List.copyOf(originalAnimals);
        List<Animal> copyAnimals2 = List.copyOf(dogs);


    }


}
