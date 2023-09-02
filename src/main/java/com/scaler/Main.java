package com.scaler;

public class Main {

    public static void doSomething() {
        int c = 10;
        int d = 40;
        System.out.println("Hey There " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Hello world! " + Thread.currentThread().getName());
        doSomething();
    }
}