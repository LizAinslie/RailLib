package me.railrunner16.lib.color.ansi;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ANSIEscapeTest {
    ANSIEscape esc1 = new ANSIEscape("red", "\u001b[31m");
    ANSIEscape esc2 = new ANSIEscape("red", "\u001b[31m");
    ANSIEscape esc3 = new ANSIEscape("blue", "\u001b[34m");

    @Test
    public void test_equalsEscape_1() {
        assertTrue(esc1.equalsEscape(esc2));
    }

    @Test
    public void test_equalsEscape_2() {
        assertFalse(esc1.equalsEscape(esc3));
    }
}
