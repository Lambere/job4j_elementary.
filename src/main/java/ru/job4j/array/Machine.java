package ru.job4j.array;

import java.util.Arrays;
    public class Machine {
        public static int[] change(int money, int price) {
            int[] coins = {10, 5, 2, 1};
            int[] rsl = new int[100];
            int size = 0;
            int i = 0;
            int j = 0;
            int totalMoney = money - price;
            while (totalMoney != 0 && i <= coins.length - 1) {
                if (totalMoney >= coins[i]) {
                    totalMoney -= coins[i];
                    rsl[j] = coins[i];
                    j++;
                    size++;
                } else {
                    i++;
                }
            }
            return Arrays.copyOf(rsl, size);
        }
    }