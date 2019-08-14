package me.railrunner16.lib.utils;

import java.util.Random;

/**
 * Randomness utilities
 * @author RailRunner16
 */
public class RandomUtil {
    private static final String HEXADECIMAL_CHARS = "ABCDEF0123456789";
    
    /**
     * Generate a random hexadecimal string.
     * @param length The length of the string to generate.
     * @return The new hexadecimal string.
     */
	public static String randomHexadecimalString(int length) {
        Random r = new Random();

		StringBuilder builder = new StringBuilder();
        
        while (length-- != 0) {
			int character = r.nextInt(HEXADECIMAL_CHARS.length());
			builder.append(HEXADECIMAL_CHARS.charAt(character));
        }
        
		return builder.toString();
	}
}