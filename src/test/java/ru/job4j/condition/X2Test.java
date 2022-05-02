package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void calc() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a,b,c,x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
  public void  Pom()  {
    int a = 1;
    int b = 1;
    int c = 1;
    int x = 1;
    int expected1 = 3;
    int rsl1 = X2.calc(a,b,c,x);
     Assert.assertEquals(expected1, rsl1);
}
    @Test
    public void  NePom()  {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a,b,c,x);
        Assert.assertEquals(expected1, rsl1);
    }
    @Test
    public void  Pom1()  {
        int a1 = 1;
        int b1 = 1;
        int c1 = 0;
        int x1 = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a1,b1,c1,x1);
        Assert.assertEquals(expected1, rsl1);
    }
    @Test
    public void  Pom2()  {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 0;
        int expected1 = 1;
        int rsl1 = X2.calc(a1,b1,c1,x1);
        Assert.assertEquals(expected1, rsl1);
    }
}