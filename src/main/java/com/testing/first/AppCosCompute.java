package com.testing.first;

/**
 * Hello world!
 *
 */
public class AppCosCompute
{
    public static void main( String[] args )
    {
        double x = 1;

        double res = computeCos(x);
        double realRes = Math.cos(x);

        System.out.println( "Computed! Value is " + res);
        System.out.println( "Real value is " + realRes);
    }

    public static final int STEP = 20;

    public static double computeCos(double x) {
        double result = 0;
        int mark = -1;

        for(int i = 0; i <= STEP; i += 2)
            result += (Math.pow(x, i) / computeFactorial(i)) * (mark = (mark == 1 ? -1 : 1));

        return result;
    }

    public static long computeFactorial(long value) {
        long result = 1;

        for(long i = 1; i <= value; i++)
            result *= i;

        return result;
    }
}