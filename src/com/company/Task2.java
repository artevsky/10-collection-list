package com.company;

// Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class Task2 {

    public void createMarks2() {
        int maxMark = 0;
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mark.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(mark);
//        System.out.println("Наибольшая оценка: " + Collections.max(mark));
        for (ListIterator<Integer> it = mark.listIterator(); it.hasNext(); )
            if (it.next() > maxMark) {
                it.previous();
                maxMark = it.next();
            }
        System.out.println("Самая высокая оценка: " + maxMark);
    }
}
