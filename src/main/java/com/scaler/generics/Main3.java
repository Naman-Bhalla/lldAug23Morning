package com.scaler.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        List<Objects> lo = new ArrayList<>();

        System.out.println(l.getClass().getName());

        System.out.println(l.getClass() == lo.getClass());
    }
}
