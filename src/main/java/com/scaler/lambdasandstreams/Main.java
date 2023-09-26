package com.scaler.lambdasandstreams;

import com.scaler.collections.Student;
import com.scaler.collections.StudentComparatorByPSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // ----V1
        SomethingDoer somethingDoer = new SomethingDoer();
        Thread t = new Thread(somethingDoer);
        t.start();

        // ---- V2
        Runnable r = () -> {
            System.out.println("Do something v2");
        };

        Thread t2 = new Thread(r);
        Thread t4 = new Thread(r);
        t2.start();
        t4.start();

        // --- v3

        Thread t3 = new Thread(
                () -> {
                    System.out.println("Do something v3");
                }
        );

        t3.start();


        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student(1, 20, "Naman", 30),
                new Student(2, 30, "Ankush", 90),
                new Student(3, 25, "Mahesh", 70)
        ));


        Collections.sort(
                students, (o1, o2) -> {
                    if (o1.getPsp() < o2.getPsp()) {
                        return -1;
                    }

                    if (o1.getPsp() > o2.getPsp()) {
                        return 1;
                    }

                    return 0;
                }
        );

        MathematicalOperation addition = (a, b) -> {
            return a + b;
        };

//        MathematicalOperation additionNonLambda =
//                new AdditionOperation();

        MathematicalOperation subtraction = (a, b) -> {
            return a - b;
        };

        MathematicalOperation multiple = (a, b) -> {
            return a * b;
        };

        multiple.operate(2, 3);


//        Runnable r = new Thread();

//        MathematicalOperation m1 = null;// somehthing
//
//        m1.operate()
    }
}
