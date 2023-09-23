package com.scaler.collections;

import java.util.Comparator;

public class StudentComparatorByPSP implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.psp < o2.psp) {
            return -1;
        }

        if (o1. psp > o2. psp) {
            return 1;
        }

        return 0;
    }
}

// Comparable v/s Comparator
// compareTo c/s Compare