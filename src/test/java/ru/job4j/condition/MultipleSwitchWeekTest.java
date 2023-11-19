package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay() {
        String a = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(a);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void anumberOfDay() {
        String a = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(a);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void fnumberOfDay() {
        String a = "Tuesday";
        int expected = 2;
        int result = MultipleSwitchWeek.numberOfDay(a);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void asnumberOfDay() {
        String a = "Tuesdsy";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(a);
        assertThat(result).isEqualTo(expected);
    }
}