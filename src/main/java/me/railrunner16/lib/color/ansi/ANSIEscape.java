package me.railrunner16.lib.color.ansi;

/**
 * ANSI escape codes.
 * @author RailRunner16
 */
public class ANSIEscape {
    public static final String ESCAPE_START = "\u001b[";

    private String escapeSequence;
    private String name;

    /**
     * Create a new ANSI color.
     * @param name The name of the color.
     * @param escapeSequence The escape sequence for use in a terminal.
     */
    public ANSIEscape(String name, String escapeSequence) {
        this.name = name.toLowerCase();
        this.escapeSequence = escapeSequence;
    }

    /**
     * Get the color name.
     * @return The color name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the raw escape sequence.
     * @return The raw escape sequence.
     */
    public String getEscapeSequence() {
        return this.escapeSequence;
    }

    @Override
    public String toString() {
        return this.escapeSequence;
    }

    /**
     * Check if this escape is equal to another.
     * @param clr The other escape.
     * @return Whether or not this escape is equal to the other.
     */
    public boolean equalsEscape(ANSIEscape clr) {
        return this.name == clr.getName() && this.escapeSequence == clr.getEscapeSequence();
    }

    /**
     * Get an ANSI escape code from a red, green and a blue value.
     * @param r The red value.
     * @param g The green value.
     * @param b The blue value.
     * @return The RGB ANSI escape code.
     */
    public static ANSIEscape foregroundFromRGB(int r, int g, int b) {
        String escape = ESCAPE_START + "38;2;" + r + ";" + g + ";" + b + "m";
        return new ANSIEscape("rgb(" + r + "," + g + "," + b + ")", escape);
    }

    /**
     * Wrap text in a color, using a reset to normalize everything after it.
     * @param text The text to wrap.
     * @return The wrapped text.
     */
    public String wrapText(String text) {
        return this.escapeSequence + text + ANSIEscape.ESCAPE_START + "0m";
    }

    /**
     * Formatting codes.
     */
    public static class Formats {
        public static final ANSIEscape RESET = new ANSIEscape("reset", "\u001b[0m");
        public static final ANSIEscape BOLD = new ANSIEscape("bold", "\u001b[1m");
        public static final ANSIEscape ITALIC = new ANSIEscape("slow_blink", "\u001b[3m");
        public static final ANSIEscape UNDERLINE = new ANSIEscape("underline", "\u001b[4m");
        public static final ANSIEscape SLOW_BLINK = new ANSIEscape("slow_blink", "\u001b[5m");
        public static final ANSIEscape FAST_BLINK = new ANSIEscape("fast_blink", "\u001b[6m");
        public static final ANSIEscape STRIKETHROUGH = new ANSIEscape("fast_blink", "\u001b[9m");
    }

    /**
     * Foreground color codes.
     */
    public static class ForegroundColors {
        // Normal Colors
        public static final ANSIEscape BLACK = new ANSIEscape("black", "\u001b[30m");
        public static final ANSIEscape RED = new ANSIEscape("red", "\u001b[31m");
        public static final ANSIEscape BLUE = new ANSIEscape("blue", "\u001b[32m");
        public static final ANSIEscape YELLOW = new ANSIEscape("yellow", "\u001b[33m");
        public static final ANSIEscape GREEN = new ANSIEscape("green", "\u001b[34m");
        public static final ANSIEscape MAGENTA = new ANSIEscape("magenta", "\u001b[35m");
        public static final ANSIEscape CYAN = new ANSIEscape("cyan", "\u001b[36m");
        public static final ANSIEscape WHITE = new ANSIEscape("white", "\u001b[37m");
        
        // Bright Colors
        public static final ANSIEscape BRIGHT_BLACK = new ANSIEscape("bright_black", "\u001b[30;1m");
        public static final ANSIEscape BRIGHT_RED = new ANSIEscape("bright_black", "\u001b[31;1m");
        public static final ANSIEscape BRIGHT_GREEN = new ANSIEscape("bright_green", "\u001b[32;1m");
        public static final ANSIEscape BRIGHT_YELLOW = new ANSIEscape("bright_yellow", "\u001b[33;1m");
        public static final ANSIEscape BRIGHT_BLUE = new ANSIEscape("bright_blue", "\u001b[34;1m");
        public static final ANSIEscape BRIGHT_MAGENTA = new ANSIEscape("bright_magenta", "\u001b[35;1m");
        public static final ANSIEscape BRIGHT_CYAN = new ANSIEscape("bright_cyan", "\u001b[36;1m");
        public static final ANSIEscape BRIGHT_WHITE = new ANSIEscape("bright_white", "\u001b[37;1m");
    }
}
