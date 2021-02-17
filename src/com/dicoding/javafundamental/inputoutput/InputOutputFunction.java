package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program perhitungan sangat sederhana");
        System.out.println("Masukan angka pertama:");
        int value = scanner.nextInt();
        System.out.println("Masukan angka kedua:");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasil perhitungan adalah: "+result);
    }
}
