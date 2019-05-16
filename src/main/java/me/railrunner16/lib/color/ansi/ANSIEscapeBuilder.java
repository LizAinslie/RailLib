package me.railrunner16.lib.color.ansi;

import java.util.ArrayList;
import java.util.List;

/**
 * A builder for ANSI escape codes.
 * @author RailRunner16
 */
public class ANSIEscapeBuilder {
    private List<Integer> sections = new ArrayList<>();
    private boolean brighten = false;
    private String name;

    /**
     * Create a new ANSI escape code builder.
     * @param name
     * @param sections
     */
    public ANSIEscapeBuilder(String name, int... sections) {
        for (int section : sections) this.sections.add(section);
        this.name = name;
    }

    /**
     * Set the color name.
     * @param name The new name.
     * @return The current builder.
     */
    public ANSIEscapeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Add a section.
     * @param section The section to add.
     * @return The current builder.
     */
    public ANSIEscapeBuilder addSection(int section) {
        this.sections.add(section);
        return this;
    }

    /**
     * Set whether the color is bright or not.
     * @param b Whether or not the color should be bright.
     * @return The current builder.
     */
    public ANSIEscapeBuilder setBrighten(boolean b) {
        this.brighten = b;
        return this;
    }

    /**
     * Build it!
     * @return The built {@link ANSIEscape}.
     */
    public ANSIEscape build() {
        String escapeSequence = ANSIEscape.ESCAPE_START;

        Integer[] sects = this.sections.toArray(new Integer[] {});

        for (int i = 0; i < sects.length; i++) {
            int section = sects[i];
            escapeSequence += Integer.toString(section);

            if (i == (sects.length - 1)) break;

            escapeSequence += ";";
        }

        if (this.brighten) escapeSequence += ";1";

        escapeSequence += "m";

        return new ANSIEscape(this.name, escapeSequence);
    }
}
