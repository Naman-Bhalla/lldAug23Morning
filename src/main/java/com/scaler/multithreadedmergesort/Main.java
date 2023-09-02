package com.scaler.multithreadedmergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort = List.of(
                8, 1, 2, 9, 6, 3, 7, 5
        );

        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arrayToSort, es);

        Future<List<Integer>> sortedArrayFuture = es.submit(sorter);

        List<Integer> sortedArray = sortedArrayFuture.get();

        for (Integer in: sortedArray) {
            System.out.println(in);
        }
    }
}
