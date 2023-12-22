package com.advent2022.day06;

import com.utilities.FileProcessor;

import java.util.List;

public class Advent06b {

	List<String> file;

	public static void main(String[] args) {
		Advent06b aoc = new Advent06b();
		aoc.opdracht6();
	}

	public void opdracht6() {
		file = FileProcessor.textFileToList("2022","06.txt");
		String input = file.get(0);
		String firstFourCharacters;

		int count = 13;
		int start = 0;
		int end = 14;
		boolean check = true;

		while (check) {
			firstFourCharacters = input.substring(start, end);
			check = !firstFourCharactersAreUnique(firstFourCharacters);

			count++;
			start++;
			end++;

		}
		System.out.println(count);
	}

	public boolean firstFourCharactersAreUnique(String s) {
		boolean b = true;
		String eerste = s.substring(0, 1);
		String tweede = s.substring(1, 2);
		String derde = s.substring(2, 3);
		String vierde = s.substring(3, 4);
		String fijfde = s.substring(4, 5);
		String zesde = s.substring(5, 6);
		String zevende = s.substring(6, 7);
		String achtste = s.substring(7, 8);
		String negende = s.substring(8, 9);
		String tiende = s.substring(9, 10);
		String elfde = s.substring(10, 11);
		String twaalfde = s.substring(11, 12);
		String dertiende = s.substring(12, 13);
		String veertiende = s.substring(13, 14);

		if (eerste.equals(tweede)) {
			b = false;
		}
		if (eerste.equals(derde)) {
			b = false;
		}
		if (eerste.equals(vierde)) {
			b = false;
		}
		if (eerste.equals(fijfde)) {
			b = false;
		}
		if (eerste.equals(zesde)) {
			b = false;
		}
		if (eerste.equals(zevende)) {
			b = false;
		}
		if (eerste.equals(achtste)) {
			b = false;
		}
		if (eerste.equals(negende)) {
			b = false;
		}
		if (eerste.equals(tiende)) {
			b = false;
		}
		if (eerste.equals(elfde)) {
			b = false;
		}
		if (eerste.equals(twaalfde)) {
			b = false;
		}
		if (eerste.equals(dertiende)) {
			b = false;
		}
		if (eerste.equals(veertiende)) {
			b = false;
		}

		if (tweede.equals(derde)) {
			b = false;
		}
		if (tweede.equals(vierde)) {
			b = false;
		}
		if (tweede.equals(fijfde)) {
			b = false;
		}
		if (tweede.equals(zesde)) {
			b = false;
		}
		if (tweede.equals(zevende)) {
			b = false;
		}
		if (tweede.equals(achtste)) {
			b = false;
		}
		if (tweede.equals(negende)) {
			b = false;
		}
		if (tweede.equals(tiende)) {
			b = false;
		}
		if (tweede.equals(elfde)) {
			b = false;
		}
		if (tweede.equals(twaalfde)) {
			b = false;
		}
		if (tweede.equals(dertiende)) {
			b = false;
		}
		if (tweede.equals(veertiende)) {
			b = false;
		}

		if (derde.equals(vierde)) {
			b = false;
		}
		if (derde.equals(fijfde)) {
			b = false;
		}
		if (derde.equals(zesde)) {
			b = false;
		}
		if (derde.equals(zevende)) {
			b = false;
		}
		if (derde.equals(achtste)) {
			b = false;
		}
		if (derde.equals(negende)) {
			b = false;
		}
		if (derde.equals(tiende)) {
			b = false;
		}
		if (derde.equals(elfde)) {
			b = false;
		}
		if (derde.equals(twaalfde)) {
			b = false;
		}
		if (derde.equals(dertiende)) {
			b = false;
		}
		if (derde.equals(veertiende)) {
			b = false;
		}

		if (vierde.equals(fijfde)) {
			b = false;
		}
		if (vierde.equals(zesde)) {
			b = false;
		}
		if (vierde.equals(zevende)) {
			b = false;
		}
		if (vierde.equals(achtste)) {
			b = false;
		}
		if (vierde.equals(negende)) {
			b = false;
		}
		if (vierde.equals(tiende)) {
			b = false;
		}
		if (vierde.equals(elfde)) {
			b = false;
		}
		if (vierde.equals(twaalfde)) {
			b = false;
		}
		if (vierde.equals(dertiende)) {
			b = false;
		}
		if (vierde.equals(veertiende)) {
			b = false;
		}

		if (fijfde.equals(zesde)) {
			b = false;
		}
		if (fijfde.equals(zevende)) {
			b = false;
		}
		if (fijfde.equals(achtste)) {
			b = false;
		}
		if (fijfde.equals(negende)) {
			b = false;
		}
		if (fijfde.equals(tiende)) {
			b = false;
		}
		if (fijfde.equals(elfde)) {
			b = false;
		}
		if (fijfde.equals(twaalfde)) {
			b = false;
		}
		if (fijfde.equals(dertiende)) {
			b = false;
		}
		if (fijfde.equals(veertiende)) {
			b = false;
		}

		if (zesde.equals(zevende)) {
			b = false;
		}
		if (zesde.equals(achtste)) {
			b = false;
		}
		if (zesde.equals(negende)) {
			b = false;
		}
		if (zesde.equals(tiende)) {
			b = false;
		}
		if (zesde.equals(elfde)) {
			b = false;
		}
		if (zesde.equals(twaalfde)) {
			b = false;
		}
		if (zesde.equals(dertiende)) {
			b = false;
		}
		if (zesde.equals(veertiende)) {
			b = false;
		}

		if (zevende.equals(achtste)) {
			b = false;
		}
		if (zevende.equals(negende)) {
			b = false;
		}
		if (zevende.equals(tiende)) {
			b = false;
		}
		if (zevende.equals(elfde)) {
			b = false;
		}
		if (zevende.equals(twaalfde)) {
			b = false;
		}
		if (zevende.equals(dertiende)) {
			b = false;
		}
		if (zevende.equals(veertiende)) {
			b = false;
		}

		if (achtste.equals(negende)) {
			b = false;
		}
		if (achtste.equals(tiende)) {
			b = false;
		}
		if (achtste.equals(elfde)) {
			b = false;
		}
		if (achtste.equals(twaalfde)) {
			b = false;
		}
		if (achtste.equals(dertiende)) {
			b = false;
		}
		if (achtste.equals(veertiende)) {
			b = false;
		}

		if (negende.equals(tiende)) {
			b = false;
		}
		if (negende.equals(elfde)) {
			b = false;
		}
		if (negende.equals(twaalfde)) {
			b = false;
		}
		if (negende.equals(dertiende)) {
			b = false;
		}
		if (negende.equals(veertiende)) {
			b = false;
		}

		if (tiende.equals(elfde)) {
			b = false;
		}
		if (tiende.equals(twaalfde)) {
			b = false;
		}
		if (tiende.equals(dertiende)) {
			b = false;
		}
		if (tiende.equals(veertiende)) {
			b = false;
		}

		if (elfde.equals(twaalfde)) {
			b = false;
		}
		if (elfde.equals(dertiende)) {
			b = false;
		}
		if (elfde.equals(veertiende)) {
			b = false;
		}

		if (twaalfde.equals(dertiende)) {
			b = false;
		}
		if (twaalfde.equals(veertiende)) {
			b = false;
		}

		if (dertiende.equals(veertiende)) {
			b = false;
		}

		return b;
	}
}