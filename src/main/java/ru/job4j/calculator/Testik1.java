package ru.job4j.calculator;

import java.util.Scanner;

public class Testik1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
       double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%.1f", celsius);
    }
}