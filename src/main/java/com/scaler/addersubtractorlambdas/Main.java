package com.scaler.addersubtractorlambdas;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        String myName = "Naman";
//        AtomicReference<Integer> a = new AtomicReference<>(21);
//        Adder a = new Adder(v);
//        List<Integer> l = new ArrayList<>();

        ExecutorService es = Executors.newCachedThreadPool();

        Callable<Void> adderLambda = () -> {
            for (int i = 1; i <= 5000; ++i) {
//                System.out.println(i);
//                a.set(22);
                l.lock();
                v.value += i; // all of the variables of the same scope are already present in the lambda
//                l.add(232);
                l.unlock();
            }
            return null;
        };


        // 1. Create a class AnonymizedSubtractorLambda
        // 2. It will implement the interface Callable<Void>
        // 3. It will pass all variables being shared with the current scope to the class
        // 4. It will copy the code inside lambda body into the interface method of that class
        Callable<Void> subtractorLambda = () -> {
            for (int i = 1; i <= 5000; ++i) {
                l.lock();
                v.value -= i; // all of the variables of the same scope are already present in the lambda
//                l.add(232);
                l.unlock();
            }
            return null;
        };

        Future<Void> adderFuture = es.submit(adderLambda);
        Future<Void> subtractorFuture = es.submit(subtractorLambda);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}

// Lambdas: Making ti very easy to create an object
// of a class that implements a functional interface