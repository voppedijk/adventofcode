package com.advent2022.day06;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Advent06 {

	List<String> bestand = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Advent06 aoc = new Advent06();
		aoc.opdracht6();
	}

	public void init() throws IOException {
		bestand = FileProcessor.textFileToList("2022","06.txt");
	}

	public void opdracht6() throws IOException {

		init();
		String input = bestand.get(0);
		// String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";
		String eersteVierKarakters;

		int teller = 3;
		int start = 0;
		int eind = 4;
		boolean checkBool = true;

		while (checkBool) {
			eersteVierKarakters = input.substring(start, eind);
			checkBool = !firstFourCharactersAreUnique(eersteVierKarakters);

			teller++;
			start++;
			eind++;
			System.out.println(teller);
		}

	}

	public boolean firstFourCharactersAreUnique(String s) {
		boolean b = true;
		String eerste = s.substring(0, 1);
		String tweede = s.substring(1, 2);
		String derde = s.substring(2, 3);
		String vierde = s.substring(3, 4);

		if (eerste.equals(tweede)) {
			b = false;
		}
		if (eerste.equals(derde)) {
			b = false;
		}
		if (eerste.equals(vierde)) {
			b = false;
		}
		if (tweede.equals(derde)) {
			b = false;
		}
		if (tweede.equals(vierde)) {
			b = false;
		}
		if (derde.equals(vierde)) {
			b = false;
		}
		return b;
	}

}
