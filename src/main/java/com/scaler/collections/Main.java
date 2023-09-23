package com.scaler.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(31);
        stack.add(15);

        stack.add(1, 12);

        stack.get(3);
        stack.remove(1);

        stack.set(1, 31);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1); // 1
        set1.add(21); // 1 <-> 21
        set1.add(10); // 1 <-> 21 <-> 10
        set1.remove(1); // 21 <-> 10
        set1.add(50); // 21 <-> 10 <-> 50
        set1.add(1); // 21 <-> 10 <-> 50 <-> 1

        for (Integer i: set1) {
            System.out.println(i);
        }

        Payment payment = new Payment();
        payment.status = PaymentStatus.SUCCESS;

//        HashSet<PaymentStatus>
//        TreeSet<PaymentStatus>
//        LinkedHashSet<PaymentStatus> -> it may not be most optiized for storing enums
        Set<PaymentStatus> paymentStatuses = EnumSet.allOf(PaymentStatus.class);
//
//        for (PaymentStatus paymentStatus: PaymentStatus.values()) {
//
//        }
//        paymentStatuses.add(PaymentStatus.FAILURE);
//        paymentStatuses.add(PaymentStatus.SUCCESS);
//        paymentStatuses.add(PaymentStatus.PENDING);
//        paymentStatuses.add(PaymentStatus.FAILURE);

        List<Payment> payments = new ArrayList<>();

//        PaymentStatus paymentStatus = new PaymentSta

//        TreeSet
        for (PaymentStatus paymentStatus: paymentStatuses) {
            for (Payment payment1: payments) {
                if (payment1.status == paymentStatus) {
                   // System.out.println(payment1.title);;
                }
            }
        }



        Queue<Integer> q = new ArrayDeque<>();
//        q.add(null);


        // Question: for every possible status of the payments, tell me
        // what all payments have that status.
        // FAILED:
        //     - pay1
        //     - pay2
        //     - pay3
        // SUCCESS
        //     - pay4
        //     - pay5
        // for each paymentStatus:
        //     for each payment:
        //        if payment.status == paymentStatus:
        //            print("status": "payment")

//        LinkedHashMap

        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student(1, 20, "Naman", 30),
                new Student(2, 30, "Ankush", 90),
                new Student(3, 25, "Mahesh", 70)
        ));

        // to fix this:
        //   custom comparison function
        //   natural ordering for students
        Collections.sort(
                students, new StudentComparatorByPSP()
        );
    }
}
