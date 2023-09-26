package com.scaler.lambdasandstreams;

public class SomethingDoer implements Runnable {

    @Override
    public void run() {
        System.out.println("Do something v1");
    }
}
