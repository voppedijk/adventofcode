package com.advent2022.day06;

import com.utilities.FileProcessor;

import java.util.ArrayList;
import java.util.List;

public class Advent06 {

	List<String> input = new ArrayList<>();

	public static void main(String[] args) {
		Advent06 aoc = new Advent06();
		aoc.opdracht6();
	}

	public void opdracht6() {
		input = FileProcessor.textFileToList("2022","06.txt");
		String input = this.input.get(0);
		String firstFourCharacters;

		int count = 3;
		int start = 0;
		int end = 4;
		boolean check = true;

		while (check) {
			firstFourCharacters = input.substring(start, end);
			check = !firstFourCharactersAreUnique(firstFourCharacters);

			count++;
			start++;
			end++;
		}
		System.out.println("Solution: " + count);
	}

	public boolean firstFourCharactersAreUnique(String s) {
		boolean b = true;
		String first = s.substring(0, 1);
		String second = s.substring(1, 2);
		String third = s.substring(2, 3);
		String fourth = s.substring(3, 4);

		if (first.equals(second)) {
			b = false;
		}
		if (first.equals(third)) {
			b = false;
		}
		if (first.equals(fourth)) {
			b = false;
		}
		if (second.equals(third)) {
			b = false;
		}
		if (second.equals(fourth)) {
			b = false;
		}
		if (third.equals(fourth)) {
			b = false;
		}
		return b;
	}
}