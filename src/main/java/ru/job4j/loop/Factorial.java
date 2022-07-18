package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        for(int variable = 1;variable <= n;variable++) {
            result = result * variable;
            }
            if(n == 0){
                result = 1;
        }

        return result;
    }
}
