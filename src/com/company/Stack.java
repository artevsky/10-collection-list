package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    int sizeStack;

    public Stack() {
    }

    public Stack(int sizeStack) {
        this.sizeStack = sizeStack;
    }

    public void push(int num){
        sizeStack++;
        numbers.add(sizeStack - 1, num);
    }

    public int pop(){
        int num = numbers.get(sizeStack - 1);
        numbers.remove(sizeStack - 1);
        sizeStack--;
        return num;
    }

    public void createStack(){
        System.out.print("\nВведите число: ");
        String num = sc.next();
        for (int i = 0; i < sizeStack; i++) {
            numbers.add(Character.getNumericValue(num.charAt(i)));
        }
    }

    public void printStack(){
        for(int i = sizeStack - 1; i > -1; i--){
            System.out.print(numbers.get(i));
        }
        System.out.print("\n");
    }

}
