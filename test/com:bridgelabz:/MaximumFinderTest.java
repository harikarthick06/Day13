package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumFinderTest {

    @Test
    public void givenMaxIntegerAtFirstPosition_ShouldReturnSameNumber() {
        Integer max = MaximumFinder.testMaximum(30, 20, 10);
        Assert.assertEquals(Integer.valueOf(30), max);
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_ShouldReturnSameNumber() {
        Integer max = MaximumFinder.testMaximum(20, 30, 10);
        Assert.assertEquals(Integer.valueOf(30), max);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_ShouldReturnSameNumber() {
        Integer max = MaximumFinder.testMaximum(10, 20, 30);
        Assert.assertEquals(Integer.valueOf(30), max);
    }
}