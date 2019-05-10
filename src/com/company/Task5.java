package com.company;

import java.util.ArrayList;

public class Task5 {
    ArrayList<Integer> set1 = new ArrayList<>();
    ArrayList<Integer> set2 = new ArrayList<>();

    public Task5(){
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
    }

    public void union(){
        ArrayList<Integer> set3 = new ArrayList<>();
        for(Integer s1 : set1){
            set3.add(s1);
        }
        for(Integer s2 : set2){
            boolean check = true;
            for(Integer s3 : set3){
                if(s2 == s3) check = false;
            }
            if(check) set3.add(s2);
        }
        printList(set3);
    }

    public void intersection(){
        ArrayList<Integer> set3 = new ArrayList<>();
        for(Integer s2 : set2){
            boolean check = false;
            for(Integer s1 : set1){
                if(s2 == s1) check = true;
            }
            if(check) set3.add(s2);
        }
        printList(set3);
    }

    private void printList(ArrayList<Integer> list){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}