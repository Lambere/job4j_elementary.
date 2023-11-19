package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
         for (int cell = 0; cell < size; cell++) {
             for (int i = 0; i < size; i++) {
                 table[cell][i] = (i + 1) * (cell + 1);
             }
         }
        return table;
    }

}

