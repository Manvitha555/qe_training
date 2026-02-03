package com.example;


   public class LambdaExample {

    
    interface Addable {
        int add(int num1, int num2);
    }

    public static void main(String[] args) {

        Addable ad1 = (num1, num2) -> num1 + num2;

        Addable ad2 = (num1, num2) -> {
            return num1 + num2;
        };

        System.out.println("Result ad1: " + ad1.add(10, 20));
        System.out.println("Result ad2: " + ad2.add(30, 40));
    }
}
