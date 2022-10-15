package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void numberOfDay() {
        int expected = -1;
        int result = SwitchWeek.numberOfDay("Low");
        Assert.assertEquals(result, expected);
    }
    @Test
    public void numberOfDay1() {
        int expected = 1;
        int result = SwitchWeek.numberOfDay("Monday");
        Assert.assertEquals(result, expected);
    }
    @Test
    public void numberOfDay2() {
        int expected = 3;
        int result = SwitchWeek.numberOfDay("Среда");
        Assert.assertEquals(result, expected);
    }
}