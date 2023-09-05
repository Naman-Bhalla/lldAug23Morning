package com.scaler.addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Adder(Value v, Lock lock) {
        this.lock = lock;
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for (int i = 1; i <= 50; ++i) {
            lock.lock();
//            lock.lock();
            this.v.value += i;
            System.out.println("Adding " + i);
//            lock.unlock();
        }

        return null;
    }
}
