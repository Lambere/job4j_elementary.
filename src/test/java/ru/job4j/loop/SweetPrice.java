package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        for (int index = price; price < 5 * index; price++) {
            System.out.println(price);
        }
    }
}
