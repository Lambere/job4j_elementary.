package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.print("You have 18 years old? ");
        if (age >= 18) {
            System.out.println("You are welcome!");
        } else {
            System.out.println("You can't watch this movie");
        }
    }
    public static void main(String[]args) {
        Cinema.access(10);
        Cinema.access(99);
    }
}