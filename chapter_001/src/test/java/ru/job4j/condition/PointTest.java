package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int inx1 = 3;
        int iny1 = 1;
        int inx2 = 4;
        int iny2 = 1;
        double expected = 1;
        double out = Point.distance(inx1,iny1,inx2,iny2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
