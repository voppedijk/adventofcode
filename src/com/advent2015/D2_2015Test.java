package com.advent2023.template;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class D2_2015Test {

	D2_2015 actual = new D2_2015();

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