package com.scaler.lambdasandstreams;

public class SubtractionOperation implements MathematicalOperation {

    @Override
    public Integer operate(Integer a, Integer b) {
        return  a - b;
    }
}
