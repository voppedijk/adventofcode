package com.advent2015.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    Solution5 actual = new Solution5();

    @Test
    public void canDetectLetterThatRepeatsWithOneLetterInBetween() {
        String input1 = "qjhvhtzxzqqjkmpb";
        String input2 = "xxyxx";
        String input3 = "ieodomkazucvgmuy";
        assertTrue(actual.inputHasLetterThatRepeatsWithOneLetterInBetween(input1));
        assertTrue(actual.inputHasLetterThatRepeatsWithOneLetterInBetween(input2));
        assertTrue(actual.inputHasLetterThatRepeatsWithOneLetterInBetween(input3));

        String input4 = "uurcxstgmygtbstg";
        assertFalse(actual.inputHasLetterThatRepeatsWithOneLetterInBetween(input4));
    }

    @Test
    public void canDetectHasPairTwice() {
        String input1 = "qjhvhtzxzqqjkmpb";
        String input2 = "xxyxx";
        String input3 = "uurcxstgmygtbstg";
        assertTrue(actual.inputHasPairTwice(input1));
        assertTrue(actual.inputHasPairTwice(input2));
        assertTrue(actual.inputHasPairTwice(input3));

        String input4 = "ieodomkazucvgmuy";
        assertFalse(actual.inputHasPairTwice(input4));
    }

    @Test
    public void canDetectNaughtyString() {
        String input1 = "haegwjzuvuyypxyu";
        String input2 = "pq";
        String input3 = "abcde";
        assertTrue(actual.inputHasNaughtyString(input1));
        assertTrue(actual.inputHasNaughtyString(input2));
        assertTrue(actual.inputHasNaughtyString(input3));

        String input4 = "acbdefg";
        assertFalse(actual.inputHasNaughtyString(input4));
    }

    @Test
    public void canDetectDoubleLetters() {
        String input1 = "ugknbfddgicrmopn";
        String input2 = "aaa";
        String input3 = "abcdde";
        assertTrue(actual.inputHasDoubleLetters(input1));
        assertTrue(actual.inputHasDoubleLetters(input2));
        assertTrue(actual.inputHasDoubleLetters(input3));

        String input4 = "acbdefg";
        assertFalse(actual.inputHasDoubleLetters(input4));
    }

    @Test
    public void canDetectThreeVowels() {
        String input1 = "aei";
        String input2 = "xazegov";
        String input3 = "aeiouaeiouaeiou";
        assertTrue(actual.inputHasThreeVowels(input1));
        assertTrue(actual.inputHasThreeVowels(input2));
        assertTrue(actual.inputHasThreeVowels(input3));

        String input4 = "acbdefg";
        assertFalse(actual.inputHasThreeVowels(input4));
    }

}