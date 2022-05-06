package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

        public static double FlightPlusEvent(double first, double second) {
            return flight(first, second)
                    + event(first, second);

        }

    public static double allsumma(double first, double second) {
        double v = flight(first, second);
        double f = FlightPlusEvent(first, second);
        double s = multiply(first, second);
        double r = event(first, second);
        return v + f + s + r;

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат сложения деления и суммы равен: " + FlightPlusEvent(10, 20));
        System.out.println("Результат сложения всех методов в классе Маф Функтион равен: " + allsumma(10, 20));
    }
}