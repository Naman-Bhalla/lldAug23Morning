package com.scaler.addersubtractorujjwal;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 5000; ++i) {
                int curValue = this.v.getValue();
                v.setValue(curValue + i);
        }
        return null;
    }
}
