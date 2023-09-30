package com.scaler.exceptionhandling;

public class BadThing {

    public static void call(int a) {
        call(a * a);
    }

    public static void main(String[] args) {
        try {
            BadThing.call(1);
        } catch (Error e) {
            System.out.println("Some error happened");
        }

    }
}
