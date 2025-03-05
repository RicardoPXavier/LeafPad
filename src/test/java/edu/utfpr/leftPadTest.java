package edu.utfpr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class leftPadTest {

    @Test
    public void testPadStringEspecifica() {
        assertEquals("esqdrt", LeftPad.leftPad("drt", 6, "esq"));
    }

    @Test
    public void testPadComPonto() {
        assertEquals("...drt", LeftPad.leftPad("drt", 6, "."));
    }

    @Test
    public void testPadStringMaior() {
        assertEquals("abdef", LeftPad.leftPad("def", 5, "abc"));
    }

    @Test
    public void testStrNull() {
        assertNull(LeftPad.leftPad(null, 5, "-"));
    }

    @Test
    public void testStrEmpty() {
        assertEquals("-----", LeftPad.leftPad("", 5, "-"));
    }

    @Test
    public void testPadStrNull() {
        assertEquals("  abc", LeftPad.leftPad("abc", 5, null));
    }

    @Test
    public void testPadStrEmpty() {
        assertEquals("  abc", LeftPad.leftPad("abc", 5, ""));
    }

    @Test
    public void testPadNumeros() {
        assertEquals("12abc", LeftPad.leftPad("abc", 5, "12"));
    }

    @Test
    public void testSizeNegative() {
        assertNull(LeftPad.leftPad("abc", -1, "-"));
    }

    @Test
    public void testSizeMenorQueString() {
        assertEquals("abc", LeftPad.leftPad("abc", 2, "-"));
    }

    @Test
    public void testSizeMaiorComHifen() {
        assertEquals("---abc", LeftPad.leftPad("abc", 6, "-"));
    }

    @Test
    public void testSizeZero() {
        assertEquals("abc", LeftPad.leftPad("abc", 0, "-"));
    }

    @Test
    public void testSizeIgualString() {
        assertEquals("wxyz", LeftPad.leftPad("wxyz", 4, "a"));
    }

    @Test
    public void testSizeIgualPadStr() {
        assertEquals("wxya", LeftPad.leftPad("a", 4, "wxyz"));
    }

    @Test
    public void testSizeIgualStrMaisPadStr() {
        assertEquals("abcdef", LeftPad.leftPad("def", 6, "abc"));
    }

    @Test
    public void testSizeGrande() {
        assertEquals("------------------------------------------------------------------------------------------------test", LeftPad.leftPad("test", 100, "-"));
    }

    @Test
    public void testPadStrEspecial() {
        assertEquals("#*!#*!abc", LeftPad.leftPad("abc", 9, "#*!"));
    }

    @Test
    public void testPadStrComNovaLinha() {
        assertEquals("abc", LeftPad.leftPad("abc", 3, "\n"));
    }
}