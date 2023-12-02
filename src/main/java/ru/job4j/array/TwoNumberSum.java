package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for(int i = 0; array.length >= i;i++) {
            if(i == array.length) {
                break;
            }
            for(int j = i + 1; array.length >= j;j++) {
                if(j == array.length) {
                    break;
                }
                if(array[i] + array[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}