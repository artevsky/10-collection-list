package com.company;

// Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.*;

public class Task1 {

    public void createMarks() {

        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mark.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(mark);

        for (ListIterator<Integer> it = mark.listIterator(); it.hasNext(); )
            if (it.next() < 4)
                it.remove();
        System.out.println(mark);
    }
}