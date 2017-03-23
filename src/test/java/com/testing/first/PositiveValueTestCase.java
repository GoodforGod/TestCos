package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

/**
 * Default Comment
 */
public class PositiveValueTestCase {

    public void TestFromZeroToHalfPi() {
        double from = 0, to = Math.PI / 2;

        double value = AppCompute.getRandomBetween(from, to);

    }

    public void TestFromHalfPiToPi() {
        double from = Math.PI / 2, to = Math.PI;

        double value = AppCompute.getRandomBetween(from, to);

    }

}
