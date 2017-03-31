package com.testing.first;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class AppCompute
{
    public static void main( String[] args )
    {
        double x = 1;

        double res = computeCos(x);
        double realRes = Math.cos(x);

        System.out.println( "Computed! Value is " + res);
        System.out.println( "Real value is " + realRes);
    }

    public static final int STEP = 5;
    public static final double DELTA_RESULT = 0.005;
    public static final double DELTA_BOUNDRY = 0.0005;

    public static double computeCos(double x) {
        double result = 0;
        int mark = -1;

        for(int i = 0; i <= STEP * 4; i += 2)
            result += Math.pow(x, i) / computeFactorial(i) * (mark = mark == 1 ? -1 : 1);

        return result;
    }

    public static double getRandomBetween(double from, double to) {
        return from + (to - from) * new Random().nextDouble();
    }

    public static long computeFactorial(long value) {
        long result = 1;

        for(long i = 1; i <= value; i++)
            result *= i;

        return result;
    }
}
