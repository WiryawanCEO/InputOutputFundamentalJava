package com.dicoding.javafundamental.inputoutput;

public class UserOutput {
    public static void main(String[] args) {
        System.out.println("Created by println");
        System.out.println("Also Created by println");
        System.out.print("Created by print");
        System.out.print("Also Created by print");

        //String normal
        String greeting = "Hello World!";

        //String using char constructor
        char[] dicodingChars = {'d','i','c','o','d','i','n','g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        //String length & CharAt
        String dicoding = "dicoding";
        int lengthString = dicoding.length();
        System.out.println(lengthString);
        char result = dicoding.charAt(1);
        System.out.println(result);
    }
}
