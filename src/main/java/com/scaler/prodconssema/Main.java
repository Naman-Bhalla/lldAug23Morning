package com.scaler.prodconssema;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        try {
            ExecutorService es = Executors.newCachedThreadPool();
            Store store = new Store(5);
            Semaphore prodSema = new Semaphore(5);
            Semaphore consSema = new Semaphore(0);

            for (int i = 1; i <= 8; ++i) {
                es.execute(new Producer(store, prodSema, consSema));
            }

            for (int i = 1; i <= 20; ++i) {
                es.execute(new Consumer(store, prodSema, consSema));
            }
        } catch (Exception e) {
            System.out.println("WAIT");
        }

    }
}
