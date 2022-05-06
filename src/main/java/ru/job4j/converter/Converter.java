package ru.job4j.converter;
public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rsl = Converter.rubleToDollar(120);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rubles are " + rsl + " dollar");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float inOne = 180;
        float expectedOne = 3;
        float outOne = Converter.rubleToDollar(inOne);
        boolean passedOne = expectedOne == outOne;
        System.out.println("180 rubles are 3 dollars. Test result : " + passedOne);
        System.out.println("140 rubles are 2 dollars. Test result : " + passedOne);
    }
}