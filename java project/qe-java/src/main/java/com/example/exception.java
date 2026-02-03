package com.example;
public class exception {

    public static void main(String[] args) {
        try {
            exceptionTest("will print to console");
            exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionTest(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("The string is null");
        } else {
            System.out.println(str);
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}



