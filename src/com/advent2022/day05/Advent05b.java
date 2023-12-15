package com.advent2022.day05;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.List;

public class Advent05b {
	
	List<String> bestand;
	String[] input = new String[9];

	public void init() throws IOException {
		bestand = FileProcessor.textFileToList("2022","");
	}
	
	public void opdracht5() throws IOException {
		init();
		
		input[0] = "SZPDLBFC";
		input[1] = "NVGPHWB";
		input[2] = "FWBJG";
		input[3] = "GJNFLWCS";
		input[4] = "WJLTPMSH";
		input[5] = "BCWGFS";
		input[6] = "HTPMQBW";
		input[7] = "FSWT";
		input[8] = "NCR";
		
		for(String s : bestand) {
			
			String[] splitOpKoppelteken = s.split("-");
			int moveAantalKratten = Integer.valueOf(splitOpKoppelteken[0]);
			int from = Integer.valueOf(splitOpKoppelteken[1]) - 1;
			int to = Integer.valueOf(splitOpKoppelteken[2]) - 1;
			
			String fromSubstring = input[from].substring(input[from].length() - moveAantalKratten, input[from].length());
			String updatedFromSubstring = input[from].substring(0, input[from].length() - moveAantalKratten);
			
			input[from] = updatedFromSubstring;
			input[to] = input[to] + fromSubstring;
			
		}
		
		for(String q : input) {
			System.out.println(q);
		}
		
	}
	
}