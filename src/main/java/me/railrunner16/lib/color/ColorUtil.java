package me.railrunner16.lib.color;

import java.awt.Color;

import me.railrunner16.lib.annotations.Nullable;

/**
 * Color utilities
 * @author RailRunner16
 */
public class ColorUtil {
    /**
     * Convert a hexadecimal color to a java AWT color.
     * @param hex The hex value to convert.
     * @return The color that the hex value represents.
     */
    @Nullable
    public Color fromHex(String hex) {
        hex = hex.replace("#", "");
        switch (hex.length()) {
            case 3:
                return new Color(
                Integer.valueOf(hex.substring(0, 1) + hex.substring(0, 1), 16),
                Integer.valueOf(hex.substring(1, 2) + hex.substring(0, 2), 16),
                Integer.valueOf(hex.substring(2, 3) + hex.substring(2, 3), 16));
            case 4:
                return new Color(
                Integer.valueOf(hex.substring(0, 1) + hex.substring(0, 1), 16),
                Integer.valueOf(hex.substring(1, 2) + hex.substring(0, 2), 16),
                Integer.valueOf(hex.substring(2, 3) + hex.substring(2, 3), 16),
                Integer.valueOf(hex.substring(3, 4) + hex.substring(3, 4), 16));
            case 6:
                return new Color(
                Integer.valueOf(hex.substring(0, 2), 16),
                Integer.valueOf(hex.substring(2, 4), 16),
                Integer.valueOf(hex.substring(4, 6), 16));
            case 8:
                return new Color(
                Integer.valueOf(hex.substring(0, 2), 16),
                Integer.valueOf(hex.substring(2, 4), 16),
                Integer.valueOf(hex.substring(4, 6), 16),
                Integer.valueOf(hex.substring(6, 8), 16));
            default:
                return null;
        }
    }
}
