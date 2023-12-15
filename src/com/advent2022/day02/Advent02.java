package com.advent2022.day02;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Advent02 {

    List<String> listOfLines = new ArrayList<>();
    Integer myTotalScore = 0;

    public static void main(String[] args) throws IOException {
        Advent02 aoc2 = new Advent02();
        aoc2.opdracht2();
    }

    public void opdracht2() throws IOException {

        listOfLines = FileProcessor.textFileToList("2022", "02.txt");

        int teller = 0;

        while (teller < listOfLines.size()) {
            String s = listOfLines.get(teller);

            String hisHand = s.substring(0, 1);
            String myHand = s.substring(2);

            berekenScore(hisHand, myHand);

            teller++;
        }

        System.out.println("Antwoord Advent dag 2-1: " + myTotalScore);

    }

    public void berekenScore(String hisHand, String myHand) {
        if (myHand.equals("X")) {
            myTotalScore = myTotalScore + 1;
            if (hisHand.equals("A")) {
                myTotalScore = myTotalScore + 3;
            } else if (hisHand.equals("B")) {

            } else if (hisHand.equals("C")) {
                myTotalScore = myTotalScore + 6;
            }

        } else if (myHand.equals("Y")) {
            myTotalScore = myTotalScore + 2;
            if (hisHand.equals("A")) {
                myTotalScore = myTotalScore + 6;
            } else if (hisHand.equals("B")) {
                myTotalScore = myTotalScore + 3;
            } else if (hisHand.equals("C")) {

            }

        } else if (myHand.equals("Z")) {
            myTotalScore = myTotalScore + 3;
            if (hisHand.equals("A")) {

            } else if (hisHand.equals("B")) {
                myTotalScore = myTotalScore + 6;
            } else if (hisHand.equals("C")) {
                myTotalScore = myTotalScore + 3;
            }

        }
    }

}
