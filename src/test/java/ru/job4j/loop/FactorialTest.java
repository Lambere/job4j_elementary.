package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int result = Factorial.calc(in);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int result = Factorial.calc(0);
        Assert.assertEquals(expected, result);
    }
}