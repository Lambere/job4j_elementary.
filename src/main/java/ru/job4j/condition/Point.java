package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }

    public static double distance1(int x1, int y1, int x2, int y2) {
        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }

    public static double distance2(int x1, int y1, int x2, int y2) {

        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }

     public  static void main(String[] args) {
        double result = Point.distance(1, 0, 2, 0);
        System.out.println("result (1;0) to (2;0) " + result);
         double res = Point.distance1(2, 0, 4, 0);
         double resl = Point.distance2(3, 0, 6, 0);
         System.out.println("result (2;0) to (4;0) " + res);
         System.out.println("result (3;0) to (6;0) " + resl);

     }
}
