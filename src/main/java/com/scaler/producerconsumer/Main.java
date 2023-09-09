package com.scaler.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);

        for (int i = 1; i <= 8; ++i) {
            es.execute(new Producer(store));
        }

        for (int i = 1; i <= 20; ++i) {
            es.execute(new Consumer(store));
        }
    }
}
