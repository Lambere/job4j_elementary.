package ru.job4j.condition;
public class Max {
    public static int max(int left, int right, int a) {
        int res = 0;
        if (left > right && left > a) {
            res =  left;
        }
        if (right > left && right > a) {
            res =  right;
        }
        if (a > right && a > left) {
            res =  a;
        }
        return res;
    }

    public static int max(int left, int right, int a, int b) {
        int res = 0;
        if (left > right && left > a && left > b) {
            res = left;
        }
        if (right > left && right > a && right > b) {
            res = right;
        }
        if (b > right && b > a && b > left) {
            res = b;
        }
        if (a > right && a > b && a > left) {
            res = a;
        }
        return res;
    }


    public static int max(int left, int right) {
        return Math.max(left, right);
    }
}