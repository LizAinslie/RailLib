package me.railrunner16.lib.color.ansi;

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
        this.name = name;
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

    public boolean equalsEscape(ANSIEscape clr) {
        return this.name == clr.getName() && this.escapeSequence == clr.getEscapeSequence();
    }

    public static ANSIEscape foregroundFromRGB(int r, int g, int b) {
        String escape = ESCAPE_START + "38;2;" + r + ";" + g + ";" + b + "m";
        return new ANSIEscape("rgb(" + r + "," + g + "," + b + ")", escape);
    }
}
