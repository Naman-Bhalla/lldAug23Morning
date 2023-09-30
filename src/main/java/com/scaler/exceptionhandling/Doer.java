package com.scaler.exceptionhandling;

import java.io.NotActiveException;
import java.util.Random;

public class Doer {

    public Object findStudentByRollNumber(int roll) throws ClassNotFoundException, NotActiveException, EvenNumberException {
//        int c = roll/0;
//
//        if (roll < 30) {
//            return new Object();
//        }
//
        Random r = new Random();

        int random = r.nextInt();
        return null;
//        if (random % 2 == 0) {
//            throw new EvenNumberException();
//        }
//
//
//        throw new ClassNotFoundException();
    }

    public void doSomething() {
        int a = 1/0;
    }
}
