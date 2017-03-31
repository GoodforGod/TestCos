package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Default Comment
 */
public class BoundaryValueTestCase extends Assert {

    private static final double DELTA_RESULT    = AppCompute.DELTA_RESULT;
    private static final double DELTA_BOUNDARY  = AppCompute.DELTA_BOUNDRY;

    // 0

    @Test
    public void testZeroPoint() {
        double value = 0;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testZeroPointAndDeltaPos() {
        double value = 0 + ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testZeroPointAndDeltaNeg() {
        double value = 0 - ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    // PI/2

    @Test
    public void testHalfPiPoint() {
        double value = Math.PI / 2;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testHalfPiPointAndDeltaPos() {
        double value = Math.PI / 2 + ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testHalfPiPointAndDeltaNeg() {
        double value = Math.PI / 2 - ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    // PI

    @Test
    public void testPiPoint() {
        double value = Math.PI;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testPiPointAndDeltaPos() {
        double value = Math.PI + ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testPiPointAndDeltaNeg() {
        double value = Math.PI - ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    // 3PI/2

    @Test
    public void testPiAndAHalfPoint() {
        double value = Math.PI + Math.PI / 2;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testPiAndAHalfPointAndDeltaPos() {
        double value = Math.PI + Math.PI / 2 + ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testPiAndAHalfPointAndDeltaNeg() {
        double value = Math.PI + Math.PI / 2 - ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    // 2PI

    @Test
    public void testTwoPiPoint() {
        double value = 2 * Math.PI;

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testTwoPiPointAndDeltaPos() {
        double value = 2 * Math.PI + ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

    @Test
    public void testTwoPiPointAndDeltaNeg() {
        double value = 2 * Math.PI - ThreadLocalRandom.current().nextDouble(DELTA_BOUNDARY);

        double result = AppCompute.computeCos(value);
        double real = Math.cos(value);

        assertEquals(result, real, DELTA_RESULT);
    }

}
