package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String score;
        switch (day) {
            case 7:
                score = "Воскресенье";
                break;
            case 6:
                score = "Суббота";
                break;
            case 5:
                score = "Пятницв";
                break;
            case 4:
                score = "Четверг";
                break;
            case 3:
                score = "Среда";
                break;
            case 2:
                score = "Вторник";
            case 1:
                score = "Пятница";
                break;

            default:
                score = "Ошибка";
                break;
        }
        return score;
    }
}

