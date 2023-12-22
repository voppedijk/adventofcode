package com.advent2022.day04;

import com.utilities.FileProcessor;

import java.util.List;

public class Advent04 {

	List<String> file;

	public static void main(String[] args) {
		Advent04 aoc = new Advent04();
		aoc.opdracht4();
	}

	public void init() {
		file = FileProcessor.textFileToList("2022","04.txt");
	}

	public void opdracht4() {

		init();
		int count = 0;
		int totalAmountWithOverlap = 0;

		while (count < file.size()) {

			String line = file.get(count);
			String[] splitted = line.split(",");
			String part1 = splitted[0];
			String part2 = splitted[1];
			String[] splittedPart1 = part1.split("-");
			String[] splittedPart2 = part2.split("-");
			int part1a = Integer.parseInt(splittedPart1[0]);
			int part1b = Integer.parseInt(splittedPart1[1]);
			int part2a = Integer.parseInt(splittedPart2[0]);
			int part2b = Integer.parseInt(splittedPart2[1]);

			if (part1a >= part2a && part1b <= part2b) {
				totalAmountWithOverlap++;
			} else if (part2a >= part1a && part2b <= part1b) {
				totalAmountWithOverlap++;
			}

			count++;
		}

		System.out.println("Solution 4-1: " + totalAmountWithOverlap);
	}
}