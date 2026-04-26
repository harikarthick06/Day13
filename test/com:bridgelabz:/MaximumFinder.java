package com.bridgelabz;

import java.util.Arrays;

public class MaximumFinder<T extends Comparable<T>> {

    private T[] values;

    @SafeVarargs
    public MaximumFinder(T... values) {
        this.values = values;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        T max = values[values.length - 1];
        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }

    public T testMaximum() {
        return MaximumFinder.testMaximum(values);
    }
}