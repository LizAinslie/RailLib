package me.railrunner16.lib.utils;

import me.railrunner16.lib.annotations.NotNull;

/**
 * Character Utilities
 * @author RailRunner16
 */
public class CharacterUtil {
    /**
     * Determine whether or not the given char is a digit
     * @param c The character to check
     * @return Whether or not the character is a digit
     */
    public static boolean isDigit(@NotNull char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * Determine whether or not the character is an alphabetic character or '_'
     * @param c The character to check
     * @return Whether or not the character is an alphabetic character or '_'
     */
    public static boolean isAlpha(@NotNull char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /**
     * Determine whether or not the character is a digit, an alphabetic character, or a '_'
     * @param c The character to check
     * @return Whether or not the character is a digit, an alphabetic character, or a '_'
     */
    public static boolean isAlphaNumeric(@NotNull char c) {
        return isAlpha(c) || isDigit(c);
    }
}
