package com.scaler.collections;

public class Student {//implements Comparable<Student> {

    int id;
    int age;
    String name;
    double psp;

    public double getPsp() {
        return psp;
    }

    public Student(int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }

//    @Override
//    public int compareTo(Student other) {
//        if (this.psp == other.psp) {
//            return 0;
//        }
//
//        if (this.psp < other.psp) {
//            return 1;
//        }
//
//        return -1;
//    }



    // this    <--->   other
    // < 0 -> current object is smaller than the other object  | this ... other |
    // = 0 -> both students are equal. Put them in any order. | this .. student | | student .. this |
    // > 0 -> current student is greater than the other. Put this after the other student |other... this|

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                '}';
    }
}
