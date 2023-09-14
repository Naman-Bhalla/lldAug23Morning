package com.scaler.generics;

import java.util.List;

public class Pair<FIRST, SECOND> {
    private FIRST first;
    private SECOND second;

    public Pair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }

    public void doSomethingOnFirst(FIRST greeting) {
        System.out.println(greeting);
        System.out.println(first);
        System.out.println(second);
    }

    public void printMoreFirsts(List<FIRST> firsts) {
        for (FIRST f: firsts) {
            System.out.println(f);
        }
    }

    // ? extends FIRST -> anything that is FIRST or a child class of first
    public void printMoreFirstsAgain(List<? extends FIRST> firsts) {
        for (FIRST f: firsts) {
            System.out.println(f);
        }
    }
}
