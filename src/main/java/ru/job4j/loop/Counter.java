package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int variable = start; variable <= finish; variable++) {
            sum = variable + sum;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( int variable = start; variable <= finish; variable++){
            if (variable % 2 == 0){
                sum = sum += variable;
            }
        }
        return sum;
    }

}