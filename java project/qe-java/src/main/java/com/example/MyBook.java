package com.example;

public class MyBook {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {

        MyBook newNovel = new MyBook();
        String title = "Sample novel";

        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}
