package com.example;

import java.util.Scanner;

public class Index {

    public static class RandomScannerActivity {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String text = sc.nextLine();

            System.out.println("You entered: " + text);
            sc.close();
        }
    }
}
