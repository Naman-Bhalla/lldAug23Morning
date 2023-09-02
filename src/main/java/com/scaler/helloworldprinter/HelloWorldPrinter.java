package com.scaler.helloworldprinter;

public class HelloWorldPrinter implements Runnable {
    private void doSomething() {

        System.out.println("Hello World from doSomething() " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello World from run()" + Thread.currentThread().getName());
        doSomething();
    }
}
