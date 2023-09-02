package com.scaler.numberprinterthreadpool;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(10L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(numberToPrint + " Printed by: " + Thread.currentThread().getName());
    }
}
