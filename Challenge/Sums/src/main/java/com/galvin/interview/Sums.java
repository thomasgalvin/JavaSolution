package com.galvin.interview;

import java.util.Arrays;

/**
 * This program calculates the sum of the numbers in an array, but provides
 * four different methods of doing so; the first uses a for-loop, the second
 * a while-loop, the third uses recursion, and the fourth uses Java's new
 * Stream API.
 *
 * Implement all four methods.
 *
 * Documentation for the Stream API can be found here:
 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#stream-double:A-
 *
 * Hint: It may be easier to add a helper method for your recursion solution.
 */
public class Sums
{
    public double forLoopSum( double[] numbers ) {
        double result = 0;

        for( double number : numbers ){
            result += number;
        }

        return result;
    }

    public double whileLoopSum( double[] numbers ) {
        double result = 0;

        int index = 0;
        while( index < numbers.length ){
            result += numbers[index];
            index++;
        }

        return result;
    }

    public double recursiveSum( double[] numbers ) {
        return recursiveSum( numbers, 0 );
    }

    private double recursiveSum( double[] numbers, int index ) {
        double result = 0;
        result += numbers[index];

        index++;
        if( index < numbers.length ){
            result += recursiveSum( numbers, index );
        }

        return result;
    }

    public double streamSum( double[] numbers ) {
        return Arrays.stream(numbers).sum();
    }
}
