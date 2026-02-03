package com.example;


public class Array {
    public static void main(String[] args) {

        int[] arr = {10, 77, 10, 54, -11, 10};
        int sumOfTens = 0;

        for (int num : arr) {
            if (num == 10) {
                sumOfTens += num;
            }
        }

        boolean result = (sumOfTens == 30);
        System.out.println(result);
      }
    }