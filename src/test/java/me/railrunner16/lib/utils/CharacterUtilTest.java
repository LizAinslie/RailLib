package me.railrunner16.lib.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CharacterUtilTest {
    @Test
    public void test_isDigit_1() {
        assertTrue(CharacterUtil.isDigit('0'));
        assertTrue(CharacterUtil.isDigit('9'));
    }

    @Test
    public void test_isDigit_2() {
        assertFalse(CharacterUtil.isDigit('a'));
        assertFalse(CharacterUtil.isDigit('z'));
        assertFalse(CharacterUtil.isDigit('A'));
        assertFalse(CharacterUtil.isDigit('Z'));
        assertFalse(CharacterUtil.isDigit('_'));
    }

    @Test
    public void test_isAlpha_1() {
        assertTrue(CharacterUtil.isAlpha('a'));
        assertTrue(CharacterUtil.isAlpha('z'));
        assertTrue(CharacterUtil.isAlpha('A'));
        assertTrue(CharacterUtil.isAlpha('Z'));
    }

    @Test
    public void test_isAlpha_2() {
        assertFalse(CharacterUtil.isAlpha('0'));
        assertFalse(CharacterUtil.isAlpha('9'));
        assertFalse(CharacterUtil.isAlpha('_'));
    }

    @Test
    public void test_isAlphaNumeric_1() {
        assertTrue(CharacterUtil.isAlphaNumeric('a'));
        assertTrue(CharacterUtil.isAlphaNumeric('z'));
        assertTrue(CharacterUtil.isAlphaNumeric('A'));
        assertTrue(CharacterUtil.isAlphaNumeric('Z'));
        assertTrue(CharacterUtil.isAlphaNumeric('0'));
        assertTrue(CharacterUtil.isAlphaNumeric('9'));
    }

    @Test
    public void test_isAlphaNumeric_2() {
        assertFalse(CharacterUtil.isAlphaNumeric('_'));
    }
}
