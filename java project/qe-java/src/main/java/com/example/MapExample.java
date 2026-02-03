package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> colors = new HashMap<>();

        colors.put(1, "blue");
        colors.put(2, "red");
        colors.put(3, "blue");
        colors.put(4, "pink");
        colors.put(5, "white");

        System.out.println("Map: " + colors);

        colors.remove(4);

        System.out.println("After removal: " + colors);

        boolean hasGreen = colors.containsValue



    )

}
