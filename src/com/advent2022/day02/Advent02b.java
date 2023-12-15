package AdventKalender;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Advent02b {

	List<String> listOfLines = new ArrayList<>();
	Integer myTotalScore = 0;

	public static void main(String[] args) throws IOException {
		Advent02b aoc2b = new Advent02b();
		aoc2b.opdracht2();
	}

	public void opdracht2() throws IOException {

		listOfLines = FileProcessor.textFileToList("2022","02.txt");

		int teller = 0;

		while (teller < listOfLines.size()) {
			String s = listOfLines.get(teller);

			String hisHand = s.substring(0, 1);
			String myHand = s.substring(2);

			berekenScore(hisHand, myHand);

			teller++;
		}
		
		System.out.println("Antwoord Advent dag 2-2: " + myTotalScore);
		
	}

	public void berekenScore(String hisHand, String myHand) {
		if (myHand.equals("X")) {
			if (hisHand.equals("A")) {
				myTotalScore = myTotalScore + 3;
			} else if (hisHand.equals("B")) {
				myTotalScore = myTotalScore + 1;
			} else if (hisHand.equals("C")) {
				myTotalScore = myTotalScore + 2;
			}
		} else if (myHand.equals("Y")) {
			myTotalScore = myTotalScore + 3;
			
			if (hisHand.equals("A")) {
				myTotalScore = myTotalScore + 1;
			} else if (hisHand.equals("B")) {
				myTotalScore = myTotalScore + 2;
			} else if (hisHand.equals("C")) {
				myTotalScore = myTotalScore + 3;
			}
		} else if (myHand.equals("Z")) {
			myTotalScore = myTotalScore + 6;
			
			if (hisHand.equals("A")) {
				myTotalScore = myTotalScore + 2;
			} else if (hisHand.equals("B")) {
				myTotalScore = myTotalScore + 3;
			} else if (hisHand.equals("C")) {
				myTotalScore = myTotalScore + 1;
			}
		}
	}

}
