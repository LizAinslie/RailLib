package me.railrunner16.lib.utils;

import java.awt.Toolkit;
import java.awt.Dimension;

/**
 * Graphics Utilities
 * @author RailRunner16
 */
public class GraphicsUtil {
    /**
     * Get the system's screen size
     * @return The screen size
     */
    public static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
