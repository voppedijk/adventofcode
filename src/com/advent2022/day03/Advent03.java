package com.advent2022.day03;

import com.utilities.FileProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advent03 {

	List<String> listOfLines = new ArrayList<>();
	int count;
	int total;

	public static void main(String[] args) {
		Advent03 aoc3 = new Advent03();
		aoc3.opdracht3();
	}

	public void opdracht3() {

		listOfLines = FileProcessor.textFileToList("2022","03.txt");

		Map<String, Integer> valueMap = new HashMap<>();
		valueMap.put("a", 1);
		valueMap.put("b", 2);
		valueMap.put("c", 3);
		valueMap.put("d", 4);
		valueMap.put("e", 5);
		valueMap.put("f", 6);
		valueMap.put("g", 7);
		valueMap.put("h", 8);
		valueMap.put("i", 9);
		valueMap.put("j", 10);
		valueMap.put("k", 11);
		valueMap.put("l", 12);
		valueMap.put("m", 13);
		valueMap.put("n", 14);
		valueMap.put("o", 15);
		valueMap.put("p", 16);
		valueMap.put("q", 17);
		valueMap.put("r", 18);
		valueMap.put("s", 19);
		valueMap.put("t", 20);
		valueMap.put("u", 21);
		valueMap.put("v", 22);
		valueMap.put("w", 23);
		valueMap.put("x", 24);
		valueMap.put("y", 25);
		valueMap.put("z", 26);
		valueMap.put("A", 27);
		valueMap.put("B", 28);
		valueMap.put("C", 29);
		valueMap.put("D", 30);
		valueMap.put("E", 31);
		valueMap.put("F", 32);
		valueMap.put("G", 33);
		valueMap.put("H", 34);
		valueMap.put("I", 35);
		valueMap.put("J", 36);
		valueMap.put("K", 37);
		valueMap.put("L", 38);
		valueMap.put("M", 39);
		valueMap.put("N", 40);
		valueMap.put("O", 41);
		valueMap.put("P", 42);
		valueMap.put("Q", 43);
		valueMap.put("R", 44);
		valueMap.put("S", 45);
		valueMap.put("T", 46);
		valueMap.put("U", 47);
		valueMap.put("V", 48);
		valueMap.put("W", 49);
		valueMap.put("X", 50);
		valueMap.put("Y", 51);
		valueMap.put("Z", 52);

		while (count < listOfLines.size()) {
			String s = listOfLines.get(count);
			int i = s.length() / 2;
			String s2 = s.substring(0, i);
			String s3 = s.substring(i);

			int count2 = 0;

			while (count2 < s2.length()) {
				String b = String.valueOf(s2.charAt(count2));

				if (s3.contains(b)) {
					total = total + valueMap.get(b);
					count2 = s2.length();
				}

				count2++;
			}

			count++;
		}
		System.out.println("Solution 3-1: " + total);
	}
}
