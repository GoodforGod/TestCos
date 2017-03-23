package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

/**
 * Default Comment
 */
public class NegativeValueTestCase {

    public void TestFromPiToPiAndAHalf() {
        double from = Math.PI, to = Math.PI + Math.PI / 2;

        double value = AppCompute.getRandomBetween(from, to);


    }

    public void TestFromPiAndAHalfToTwoPi() {
        double from = Math.PI + Math.PI / 2, to = 2 * Math.PI;

        double value = AppCompute.getRandomBetween(from, to);

    }
}
