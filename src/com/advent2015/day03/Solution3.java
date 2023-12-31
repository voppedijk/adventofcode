package com.advent2015.day03;

import com.utilities.FileProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {

	public static void main(String[] args) {
		Solution3 aoc = new Solution3();
		List<String> input = FileProcessor.textFileToList("2015","03.txt");
		Map<String, Integer> result = aoc.amountOfHousesVisited(input.get(0));
		System.out.println("part1: " + result.size());

		Map<String, Integer> result2 = aoc.amountOfHousesVisited2(input.get(0));
		System.out.println("part2: " + result2.size()); //2639
	}

	public Map<String, Integer> amountOfHousesVisited2(final String input) {
		Map<String, Integer> housAndPresentMap = new HashMap<>();
		housAndPresentMap.put("0,0", 2);

		String[] inputForSantaAndRobot = createArrForSantaAndRobot(input);
		String santa = inputForSantaAndRobot[0];
		String robot = inputForSantaAndRobot[1];

		fillMap(santa, housAndPresentMap);
		fillMap(robot, housAndPresentMap);

		return housAndPresentMap;
	}

	public String[] createArrForSantaAndRobot(final String input) {
		StringBuilder sbSanta = new StringBuilder();
		StringBuilder sbRobot = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				sbSanta.append(input.charAt(i));
			} else {
				sbRobot.append(input.charAt(i));
			}
		}
		return new String[]{sbSanta.toString(), sbRobot.toString()};
	}

	public Map<String, Integer> amountOfHousesVisited(final String input) {
		Map<String, Integer> housAndPresentMap = new HashMap<>();
		housAndPresentMap.put("0,0", 1);
		fillMap(input, housAndPresentMap);

		return housAndPresentMap;
	}

	public void fillMap(final String input, final Map<String, Integer> housAndPresentMap) {
		int x = 0;
		int y = 0;

		for (int i = 0; i < input.length(); i++) {
			String s = String.valueOf(input.charAt(i));
			switch (s) {
				case ">" -> x++;
				case "<" -> x--;
				case "^" -> y++;
				case "v" -> y--;
				default -> System.out.println("Case not found.");
			}

			String key = x + "," + y;
			if (housAndPresentMap.containsKey(key)) {
				int currentPresents = housAndPresentMap.get(key);
				housAndPresentMap.put(key, currentPresents + 1);
			} else {
				housAndPresentMap.put(key, 1);
			}
		}
	}
}