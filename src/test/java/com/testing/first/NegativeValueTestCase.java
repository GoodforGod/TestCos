package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Default Comment
 */
public class NegativeValueTestCase extends Assert {

    private static final double delta = AppCompute.DELTA_RESULT;

    @Test
    public void testFromPiToPiAndAHalf() {
        double from = Math.PI, to = Math.PI + Math.PI / 2;
        double value = AppCompute.getRandomBetween(from, to);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testFromPiAndAHalfToTwoPi() {
        double from = Math.PI + Math.PI / 2, to = 2 * Math.PI;

        double value = AppCompute.getRandomBetween(from, to);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }
}
