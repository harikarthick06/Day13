package com.bridgelabz;

public class MaximumFinder<T extends Comparable<T>> {

    private T x;
    private T y;
    private T z;

    public MaximumFinder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public T testMaximum() {
        return MaximumFinder.testMaximum(x, y, z);
    }
}