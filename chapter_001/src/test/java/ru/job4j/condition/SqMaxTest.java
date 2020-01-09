package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenForthMax() {
        //MultiMax check = new MultiMax();
        int result = SqMax2.max(1, 4, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        //MultiMax check = new MultiMax();
        int result = SqMax2.max(1, 7, 2, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        //MultiMax check = new MultiMax();
        int result = SqMax2.max(1, 7, 9, 5);
        assertThat(result, is(9));
    }

    @Test
    public void whenFirstMax() {
        //MultiMax check = new MultiMax();
        int result = SqMax2.max(10, 7, 2, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax2() {
        //MultiMax check = new MultiMax();
        //int result = SqMax.max(10, 7, 2, 5);
        int result = SqMax2.max(10, 7, 12, 5);
        assertThat(result, is(12));
    }

    @Test
    public void whenThirdMax3() {
        //MultiMax check = new MultiMax();
        //int result = SqMax.max(10, 7, 2, 5);
        int result = SqMax2.max(10, 10, 10, 8);
        assertThat(result, is(10));
    }

}