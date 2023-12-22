package com.advent2022.day01;

import com.utilities.FileProcessor;

import java.util.List;

public class Advent01 {

	public static void main(String[] args) {
		Advent01 aoc = new Advent01();
		aoc.opdracht1();
	}

	public void opdracht1() {
		List<String> listOfLines = FileProcessor.textFileToList("2022", "01.txt");

		int nr1 = 0;
		int nr2 = 0;
		int nr3 = 0;
		int maxCalories = 0;
		int count = 0;

		while (count < listOfLines.size()) {

			if (!listOfLines.get(count).equals("")) {
				int i = Integer.parseInt(listOfLines.get(count));
				maxCalories = maxCalories + i;
				count++;
			} else {
				if (maxCalories > nr1) {
					nr3 = nr2;
					nr2 = nr1;
					nr1 = maxCalories;
				} else if (maxCalories > nr2) {
					nr3 = nr2;
					nr2 = maxCalories;
				} else if (maxCalories > nr3) {
					nr3 = maxCalories;
				}

				maxCalories = 0;
				count++;
			}
		}

		System.out.println("Solution 1-1: " + nr1);
		int antwoordTwee = nr3 + nr2 + nr1;
		System.out.println("Solution 1-2: " + antwoordTwee);
	}
}