package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }


        public static double summa(double first, double second) {
            return flight(first, second)
                    + event(first, second);

        }
    public static double fiksiky(double first, double second) {
        return flight(first, second)+ summa(first, second)
                + multiply(first, second) + event(first, second) + summa(first, second) + multiply(first, second);


    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат сложения деления и суммы равен: " + summa(10, 20));
        System.out.println("Результат сложения всех методов в классе Маф Функтион равен: " + fiksiky(10, 20));
    }
}