package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        double out = new Point(0, 0).distance(new Point(2, 0));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to40then2() {
        double expected = 0;
        double out = new Point(4, 0).distance(new Point(4, 0));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to22then2() {
        double expected = 2;
        double out = new Point(2, 0).distance(new Point(2, 2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to80then2() {
        double expected = 5;
        double out = new Point(3, 0).distance(new Point(8, 0));
        Assert.assertEquals(expected, out, 0.01);
    }
}
