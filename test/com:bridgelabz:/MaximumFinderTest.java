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

    @Test
    public void givenMaxFloatAtFirstPosition_ShouldReturnSameNumber() {
        Float max = MaximumFinder.testMaximum(30.5f, 20.5f, 10.5f);
        Assert.assertEquals(Float.valueOf(30.5f), max);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_ShouldReturnSameNumber() {
        Float max = MaximumFinder.testMaximum(20.5f, 30.5f, 10.5f);
        Assert.assertEquals(Float.valueOf(30.5f), max);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_ShouldReturnSameNumber() {
        Float max = MaximumFinder.testMaximum(10.5f, 20.5f, 30.5f);
        Assert.assertEquals(Float.valueOf(30.5f), max);
    }
    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameString() 
    {
        String max = MaximumFinder.testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameString() 
    {
        String max = MaximumFinder.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", max);
    }
    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameString() 
    {
        String max = MaximumFinder.testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max);
    }
}