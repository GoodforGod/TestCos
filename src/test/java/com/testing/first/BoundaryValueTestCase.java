package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * Default Comment
 */
public class BoundaryValueTestCase extends Assert {

    private static final double delta = AppCompute.DELTA;

    @Test
    public void testZeroPoint() {
        double value = 0;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testHalfPiPoint() {
        double value = Math.PI / 2;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testPiPoint() {
        double value = Math.PI;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testPiAndAHalfPoint() {
        double value = Math.PI + Math.PI / 2;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

    @Test
    public void testTwoPiPoint() {
        double value = 2 * Math.PI;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, delta);
    }

}
