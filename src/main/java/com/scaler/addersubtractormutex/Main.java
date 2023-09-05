package com.scaler.addersubtractormutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock(); // mutex

        Adder adder = new Adder(v, lock);
        Subtractor subtractor = new Subtractor(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractorFuture = es.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
