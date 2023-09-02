package com.scaler.helloworldprinter;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.run();

        Thread t1 = new Thread(helloWorldPrinter);
        t1.start(); // even before this method completes, main moves on to the next line

        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}
