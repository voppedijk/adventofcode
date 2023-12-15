package com.advent2022.day03;

import com.utilities.FileProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advent03b {

	List<String> listOfLines = new ArrayList<>();
	int teller = 0;
	Integer totaal = 0;

	public static void main(String[] args) throws IOException {
		Advent03b aoc3 = new Advent03b();
		aoc3.opdracht3b();
	}

	public void opdracht3b() throws IOException {

		listOfLines = FileProcessor.textFileToList("2022","03.txt");

		Map<String, Integer> waardenMap = new HashMap<>();
		waardenMap.put("a", 1);
		waardenMap.put("b", 2);
		waardenMap.put("c", 3);
		waardenMap.put("d", 4);
		waardenMap.put("e", 5);
		waardenMap.put("f", 6);
		waardenMap.put("g", 7);
		waardenMap.put("h", 8);
		waardenMap.put("i", 9);
		waardenMap.put("j", 10);
		waardenMap.put("k", 11);
		waardenMap.put("l", 12);
		waardenMap.put("m", 13);
		waardenMap.put("n", 14);
		waardenMap.put("o", 15);
		waardenMap.put("p", 16);
		waardenMap.put("q", 17);
		waardenMap.put("r", 18);
		waardenMap.put("s", 19);
		waardenMap.put("t", 20);
		waardenMap.put("u", 21);
		waardenMap.put("v", 22);
		waardenMap.put("w", 23);
		waardenMap.put("x", 24);
		waardenMap.put("y", 25);
		waardenMap.put("z", 26);
		waardenMap.put("A", 27);
		waardenMap.put("B", 28);
		waardenMap.put("C", 29);
		waardenMap.put("D", 30);
		waardenMap.put("E", 31);
		waardenMap.put("F", 32);
		waardenMap.put("G", 33);
		waardenMap.put("H", 34);
		waardenMap.put("I", 35);
		waardenMap.put("J", 36);
		waardenMap.put("K", 37);
		waardenMap.put("L", 38);
		waardenMap.put("M", 39);
		waardenMap.put("N", 40);
		waardenMap.put("O", 41);
		waardenMap.put("P", 42);
		waardenMap.put("Q", 43);
		waardenMap.put("R", 44);
		waardenMap.put("S", 45);
		waardenMap.put("T", 46);
		waardenMap.put("U", 47);
		waardenMap.put("V", 48);
		waardenMap.put("W", 49);
		waardenMap.put("X", 50);
		waardenMap.put("Y", 51);
		waardenMap.put("Z", 52);

		while (teller + 2 < listOfLines.size()) {

			String s1 = listOfLines.get(teller);
			String s2 = listOfLines.get(teller + 1);
			String s3 = listOfLines.get(teller + 2);

			int teller2 = 0;

			while (teller2 < s1.length()) {
				String b = String.valueOf(s1.charAt(teller2));

				if (s2.contains(b)) {
					if (s3.contains(b)) {
						totaal = totaal + waardenMap.get(b);
						teller2 = s1.length();
					}
				}

				teller2++;

			}

			teller = teller + 3;
		}

		System.out.println("Antwoord Advent dag 3-2: " + totaal);

	}

	public void leesBestandOpdr3b() throws IOException {
		BufferedReader bufReader = new BufferedReader(new FileReader("03advent.txt"));

		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();
	}

}