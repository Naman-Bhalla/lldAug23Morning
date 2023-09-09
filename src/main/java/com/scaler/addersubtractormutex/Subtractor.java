package com.scaler.addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Subtractor(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for (int i = 1; i <= 50; ++i) {
            //
            //
            ///

            ///
            ///

            ///
            lock.lock();
            this.v.value -= i;
            System.out.println("Subtracting " + i);
//            lock.unlock();
        }

        return null;
    }
}
