package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] siz = new int[size][size];
         for (int cell = 0; cell < size; cell++) {
             for (int i = 0; i < size; i++) {
                siz[cell][i] = (i + 1) * (cell + 1);
             }
         }
        return siz;
    }

}

