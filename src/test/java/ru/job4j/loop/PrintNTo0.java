package ru.job4j.loop;

public class PrintNTo0 {
    public static void out(int n) {

        for (int index = 0; n > index; n--) {
            System.out.println(n - 1);
        }
    }
}