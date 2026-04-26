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
        return values[values.length - 1];
    }

    public T testMaximum() {
        return MaximumFinder.testMaximum(values);
    }
}