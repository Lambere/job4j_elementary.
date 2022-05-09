package ru.job4j.condition;

public class Tour {

    public static void offer(boolean pasport) {
        System.out.println("A client has foreign pasport : " + pasport);
        if (pasport) {
            System.out.println("Tours abroad");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[]args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
