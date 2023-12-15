package com.advent2022.day04;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.List;

public class Advent04 {

	List<String> bestand;

	public static void main(String[] args) throws IOException {
		Advent04 aoc = new Advent04();
		aoc.opdracht4();
	}

	public void init() throws IOException {
		bestand = FileProcessor.textFileToList("2022","04.txt");
	}

	public void opdracht4() throws IOException {

		init();
		int teller = 0;
		int totaalAantalMetOverlap = 0;

		while (teller < bestand.size()) {

			String regel = bestand.get(teller);
			String[] splitOpKomma = regel.split(",");
			String deel1 = splitOpKomma[0];
			String deel2 = splitOpKomma[1];
			String[] splitOpKoppeltekenVoorDeel1 = deel1.split("-");
			String[] splitOpKoppeltekenVoorDeel2 = deel2.split("-");
			int deel1a = Integer.valueOf(splitOpKoppeltekenVoorDeel1[0]);
			int deel1b = Integer.valueOf(splitOpKoppeltekenVoorDeel1[1]);
			int deel2a = Integer.valueOf(splitOpKoppeltekenVoorDeel2[0]);
			int deel2b = Integer.valueOf(splitOpKoppeltekenVoorDeel2[1]);

			if (deel1a >= deel2a && deel1b <= deel2b) {
				totaalAantalMetOverlap++;
			} else if (deel2a >= deel1a && deel2b <= deel1b) {
				totaalAantalMetOverlap++;
			}

			teller++;
		}

		System.out.println("Antwoord Advent dag 4-1: " + totaalAantalMetOverlap);
	}

}
