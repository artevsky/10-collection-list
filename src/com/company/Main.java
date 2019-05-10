package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1: ");
        Task1 task1 = new Task1();
        task1.createMarks();

        System.out.println("Задание 2: ");
        Task2 task2 = new Task2();
        task2.createMarks2();

        System.out.println("Задание 3: ");
        Task3 task3 = new Task3();
        task3.pupils();

        System.out.print("\nЗадание 4: ");
        /*Stack stack = new Stack(3);
        stack.createStack();
        stack.printStack();
        stack.push(9);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        System.out.print("\nЗадание 5:\n");
        Task5 task5 = new Task5();
        task5.union();
        task5.intersection();

        System.out.print("\nЗадание 6:\n");
    }
}
