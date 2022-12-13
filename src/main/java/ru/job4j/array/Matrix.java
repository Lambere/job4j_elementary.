package ru.job4j.array;
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] siz = new int[size][size];
         for (int cell = 0; cell < size; cell++) {
             for (int index = 0; index < size; index++) {
                 siz[cell][index] = (index + 1) * (cell + 1);
             }
         }
        return siz;
    }

}

