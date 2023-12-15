package com.advent2022.day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Advent01 {
	public void opdracht1() throws IOException {
		BufferedReader bufReader = new BufferedReader(new FileReader("01advent.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();

		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}

		bufReader.close();

		Integer nr1 = 0;
		Integer nr2 = 0;
		Integer nr3 = 0;
		Integer maxCalOmTeBerekenen = 0;
		int teller = 0;

		while (teller < listOfLines.size()) {

			if (!listOfLines.get(teller).equals("")) {
				Integer i = Integer.valueOf(listOfLines.get(teller));
				maxCalOmTeBerekenen = maxCalOmTeBerekenen + i;
				teller++;
			} else {
				if (maxCalOmTeBerekenen > nr1) {
					nr3 = nr2;
					nr2 = nr1;
					nr1 = maxCalOmTeBerekenen;
				} else if (maxCalOmTeBerekenen > nr2) {
					nr3 = nr2;
					nr2 = maxCalOmTeBerekenen;
				} else if (maxCalOmTeBerekenen > nr3) {
					nr3 = maxCalOmTeBerekenen;
				}

				maxCalOmTeBerekenen = 0;
				teller++;
			}
		}

		System.out.println("Antwoord Advent dag 1-1: " + nr1);
		//System.out.println("Cal. nr2: " + nr2);
		//System.out.println("Cal. nr3: " + nr3);
		Integer antwoordTwee = nr3 + nr2 + nr1;
		System.out.println("Antwoord Advent dag 1-2: " + antwoordTwee);

	}
}
