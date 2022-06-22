package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

        public static double substractionPlusDivision(double first, double second) {
            return subtraction(first, second)
                    + division(first, second);
        }

            public static double allsumma(double first, double second) {
                return sumAndMultiply(first, second)
                        + substractionPlusDivision(first, second);
            }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат сложения деления и суммы равен: " + substractionPlusDivision(10, 20));
        System.out.println("Результат сложения всех методов в классе Маф Функтион равен: " + allsumma(10, 20));
    }
}