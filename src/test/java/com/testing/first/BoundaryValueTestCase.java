package com.testing.first;

/*
 * Created by GoodforGod on 23.03.2017.
 */

/**
 * Default Comment
 */
public class BoundaryValueTestCase {

    public void TestZeroPoint() {
        double point = 0;

    }

    public void TestHalfPiPoint() {
        double point = Math.PI / 2;

    }

    public void TestPiPoint() {
        double point = Math.PI;

    }

    public void TestPiAndAHalftPoint() {
        double point = Math.PI + Math.PI / 2;

    }

    public void TestTwoPiPoint() {
        double point = 2 * Math.PI;

    }

}
