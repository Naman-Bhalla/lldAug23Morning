package com.scaler.addersubtractorsynchronizedmethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 5000; ++i) {
                this.v.decrementBy(i);
        }

        return null;
    }
}
