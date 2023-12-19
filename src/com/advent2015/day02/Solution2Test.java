package com.advent2015.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution2Test {

	Solution2 actual = new Solution2();

	@Test
	public void canCalculateRibbon() {
		String[] lwh = {"2", "3", "4"};

		assertEquals(34, actual.calculateRibbon(lwh));
	}

	@Test
	public void canCalulateWrappingPaper() {
		String[] lwh = {"2", "3", "4"};

		assertEquals(58, actual.calculateWrappingPaper(lwh));
	}

	@Test
	public void canMutateInputToArray() {
		String input = "29x13x26";
		String[] expected = {"29", "13", "26"};

		assertArrayEquals(expected, actual.mutateInputToArray(input));
	}
}