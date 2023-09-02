package com.scaler.numberprinterthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService e = Executors.newCachedThreadPool();
//        ExecutorService e2 = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 1000; ++i) {
            if (i == 200) {
                System.out.println("STOP");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            e.execute(numberPrinter);
//            Thread t = new Thread(numberPrinter);
//            t.start();
        }
    }
}
