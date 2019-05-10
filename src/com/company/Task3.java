package com.company;

// Вывести учеников из списка в обратном порядке. (2 варианта решения).

import java.util.*;

public class Task3 {
    public void pupils() {

        ArrayList<String> pupils = new ArrayList<String>();

        pupils.add("Вовочка");
        pupils.add("Машенька");
        pupils.add("Петечка");

        System.out.println("А-Я: " + pupils);
        Collections.reverse(pupils);
        System.out.println("Я-А :" + pupils);

        ListIterator<String> listIter = pupils.listIterator();

        while (listIter.hasNext()) {
            System.out.print(listIter.next() + " ");
        }

        System.out.println("\t");

        while (listIter.hasPrevious()) {
            System.out.print(listIter.previous() + " ");
        }
    }
}
