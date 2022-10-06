package ru.job4j.calculator;

class Fit{
    public static double manWeight(short weight){
        double rsl = (weight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short weight){
        double rsl  = (weight - 110) * 1.15;
        return rsl;
    }

}