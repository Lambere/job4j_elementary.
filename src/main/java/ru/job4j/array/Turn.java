package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int hukke = (array.length - 1) - index;
            int temp = array[index];
            array[index] = array[hukke];
            array[hukke] = temp;
        }
        return array;
    }
}

