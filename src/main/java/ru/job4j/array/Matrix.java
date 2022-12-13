package ru.job4j.array;
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] siz = new int[size][size];
         for (int cell = 0; cell < size; cell++) {
             for (int index = 0; index < size; index++) {
                int indexZero =  cell + 1;
                siz[cell][index] = (index + 1) * indexZero;
             }
         }
        return siz;
    }

}

