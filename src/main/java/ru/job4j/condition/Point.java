package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }
    public static double disco(int x1, int y1, int x2, int y2) {
        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }
    public static double trel(int x1, int y1, int x2, int y2) {

        double rsl = (x2 - x1) + (y2 - y1);
        double a  = Math.pow(rsl, 2);
        double b = Math.sqrt(a);
        return rsl;
    }

     public  static void main(String[] args) {
        double result = Point.distance(1,0,2,0);
        System.out.println("result (1;0) to (2;0) " + result);
         double res = Point.disco(2,0,4,0);
         double resl = Point.trel(3,0,6,0);
         System.out.println("result (2;0) to (4;0) " + res);
         System.out.println("result (3;0) to (6;0) " + resl);


     }
}
