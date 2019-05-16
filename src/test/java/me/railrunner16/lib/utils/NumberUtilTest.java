package me.railrunner16.lib.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilTest {
    @Test
    public void test_isPrime_1() {
        assertTrue(NumberUtil.isPrime(11));
        assertTrue(NumberUtil.isPrime(5));
    }

    @Test
    public void test_isPrime_2() {
        assertFalse(NumberUtil.isPrime(6));
        assertFalse(NumberUtil.isPrime(100));
    }
}