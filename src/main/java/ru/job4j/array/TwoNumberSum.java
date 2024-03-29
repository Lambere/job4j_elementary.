package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = 1;
        int i = 0;

        while (j < array.length || i == array.length) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else {
                if (j == array.length - 2) {
                    i++;
                    j = 0;
                }
                j++;
            }
        }
        return new int[0];
    }
}





