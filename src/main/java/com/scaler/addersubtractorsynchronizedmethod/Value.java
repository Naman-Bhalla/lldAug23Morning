package com.scaler.addersubtractorsynchronizedmethod;

public class Value {
    private int value = 0;

    public synchronized void incrementBy(int num) {
        // value.lock()
        this.value += num;
        // value.unlock()
    }

    public synchronized void decrementBy(int num) {
        // value.lock()
//        this.value -= num;
        int curValue = this.value;
        this.value = curValue - num;
        // value.unlock()
    }

    public int getValue() {
        return value;
    }
}
