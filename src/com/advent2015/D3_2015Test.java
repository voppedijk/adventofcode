package com.advent2023.template;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class D3_2015Test {

	D3_2015 aoc = new D3_2015();

	@Test
	public void canCalculateAmountOfHousesVisited2() {
		String in1 = "^v";
		Map<String, Integer> actual1 = aoc.amountOfHousesVisited2(in1);
		Map<String, Integer> expected1 = Map.of("00", 2, "01", 1, "0-1", 1);
		assertEquals(expected1, actual1);
		assertEquals(3, actual1.size());

		String in2 = "^>v<";
		Map<String, Integer> actual2 = aoc.amountOfHousesVisited2(in2);
		Map<String, Integer> expected2 = Map.of("00", 4, "01", 1, "10", 1);
		assertEquals(expected2, actual2);
		assertEquals(3, actual2.size());

		String in3 = "^v^v^v^v^v";
		Map<String, Integer> actual3 = aoc.amountOfHousesVisited2(in3);
		Map<String, Integer> expected3 = new HashMap<>();
		expected3.put("00", 2);
		expected3.put("01", 1);
		expected3.put("02", 1);
		expected3.put("03", 1);
		expected3.put("04", 1);
		expected3.put("05", 1);
		expected3.put("0-1", 1);
		expected3.put("0-2", 1);
		expected3.put("0-3", 1);
		expected3.put("0-4", 1);
		expected3.put("0-5", 1);
		assertEquals(expected3, actual3);
		assertEquals(11, actual3.size());
	}

	@Test
	public void canCreateArrForSantaAndRobot() {
		String in1 = "^v";
		String in2 = "^>v<";
		String in3 = "^v^v^v^v^v";
		String[] expected1 = { "^", "v" };
		String[] expected2 = { "^v", "><" };
		String[] expected3 = { "^^^^^", "vvvvv" };

		assertArrayEquals(expected1, aoc.createArrForSantaAndRobot(in1));
		assertArrayEquals(expected2, aoc.createArrForSantaAndRobot(in2));
		assertArrayEquals(expected3, aoc.createArrForSantaAndRobot(in3));
	}

	@Test
	public void canRetrieveAmountOfHousesVisited() {
		String input = "^>v<";

		assertEquals(4, aoc.amountOfHousesVisited(input).size());
	}

}