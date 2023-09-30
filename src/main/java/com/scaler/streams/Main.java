package com.scaler.streams;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> l1 = List.of(
                1, 2, 3, 4
        );

//
//        for (Integer i: l1) {
//            System.out.println(i);
//        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Stream<Integer> s1 = l1.stream();

        Stream<Integer> s2 = set1.stream();


        s2.forEach(
                (elem) -> {
                    System.out.println(elem * 2);
                }
        );

        // class MyConsumer implements Consumer<Integer> {
        //    void accept(Integer elem) {
        //       print(elem * 2);
        //    }
        // }
        //
        //  MyConsumer c1 = new MyConsumer();
        //
        // for(Integer i: l) {
        //     c1.accept(i);
        // }

        // Given a list with some elements and an empty set
        // add all elements of the list to a set

        List<Integer> l10 = List.of(1, 2, 3, 4, 5, 6);
        Set<Integer> s10 = new HashSet<>();

        l10.stream()
            .forEach((elem) -> {s10.add(elem);}
        );

        // filter method -> allows you to select only a subset of elements from the stream

        for (Integer i: l10) {
            if (i % 2 == 0) {
                System.out.println(i * 2);
            }
        }

        l10.stream()
            .filter((elem) -> elem % 2 == 0 && 1 == 1)
            .forEach((sanjeev) -> System.out.println(sanjeev * 2)
        );

        l10.stream() // {1, 2, 3, 4, 5, 6}
            .map((elem) -> elem * 3) // {3, 6, 9, 12, 15, 18}
            .filter((elem) -> elem < 10) // {3, 6, 9}
            .forEach((elem) -> System.out.println(elem));

        List<Integer> numMultiplyBy3 = new ArrayList<>();
        for (Integer i: l10) {
            numMultiplyBy3.add(i * 3);
        }

        List<Integer> numbersLessThan10 = new ArrayList<>();
        for (Integer i: numMultiplyBy3) {
            if (i < 10) {
                numbersLessThan10.add(i);
            }
        }

        System.out.println(numbersLessThan10.get(0));

        Optional<Integer> i = l10.stream() // {1, 2, 3, 4, 5, 6}
                .map((elem) -> elem * 3) // {3, 6, 9, 12, 15, 18}
                .filter((elem) -> elem < 10) // {3, 6, 9}
                .findFirst();

        if (i.isEmpty()) {
            System.out.println("No number");
        }

        System.out.println(i.get());
    }
}
