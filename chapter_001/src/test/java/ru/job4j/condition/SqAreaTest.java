package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int inp  = 6;
        int ink  = 2;
        double expected = 2;
        double out      = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }

}
