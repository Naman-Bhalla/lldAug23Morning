package com.scaler.addersubtractorujjwal;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 5000; ++i) {
                int curVlaue = this.v.getValue();
                this.v.setValue(curVlaue - i);
        }

        return null;
    }
}
