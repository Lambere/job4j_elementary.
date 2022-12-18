package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 2;
            case "Вторник", "Tuesday" -> 3;
            case "Среда", "Wednesday" -> 4;
            case "Четверг", "Thursday" -> 5;
            case "Пятница", "Friday" -> 6;
            case "Суббота", "Saturday" -> 7;
            case "Воскресенье", "Sunday" -> 8;
            default -> -1;
        };
        return value;
    }
}