package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Default Comment
 */
public class PositiveValueTestCase extends Assert {

    private static final double delta = AppCompute.DELTA;

    @Test
    public void testFromZeroToHalfPi() {
        double from = 0, to = Math.PI / 2;

        double value = AppCompute.getRandomBetween(from, to);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testFromHalfPiToPi() {
        double from = Math.PI / 2, to = Math.PI;

        double value = AppCompute.getRandomBetween(from, to);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }
}
