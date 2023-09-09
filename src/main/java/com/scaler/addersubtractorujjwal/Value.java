package com.scaler.addersubtractorujjwal;

public class Value {
    private int value = 0;

//    public synchronized void incrementBy(int num) {
//        // value.lock()
//        this.value += num;
//        // value.unlock()
//    }
//
//    public synchronized void decrementBy(int num) {
//        // value.lock()
//        this.value -= num;
//        // value.unlock()
//    }

    public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
