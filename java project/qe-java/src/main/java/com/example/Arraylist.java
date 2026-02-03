package com.example;
 

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("rohan");
        myList.add("rahul");
        myList.add("shervanni");
        myList.add("abi");
        myList.add("ramu");

        System.out.println("All names are in list:");

        for (String name : myList) {
            System.out.println(name);
        }
    }
}





