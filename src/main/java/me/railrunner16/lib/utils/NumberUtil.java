package me.railrunner16.lib.utils;

/**
 * Number Utilities
 * @author RailRunner16
 */
public class NumberUtil {
    /**
     * Determine whether or not a number is prime
     * @param num The number to check
     * @return Whether or not the number is prime
     */
    public static boolean isPrime(int num) {
        boolean flag = false;

        for (int i = 2; i < num / 2; i ++) if (num % i == 0) {
            flag = true;
            break;
        }

        return !flag;
    }
}
