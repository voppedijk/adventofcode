package com.advent2022.day02;

import com.utilities.FileProcessor;

import java.util.ArrayList;
import java.util.List;

public class Advent02 {

    List<String> listOfLines = new ArrayList<>();
    Integer myTotalScore = 0;

    public static void main(String[] args) {
        Advent02 aoc2 = new Advent02();
        aoc2.opdracht2();
    }

    public void opdracht2() {

        listOfLines = FileProcessor.textFileToList("2022", "02.txt");

        int count = 0;

        while (count < listOfLines.size()) {
            String s = listOfLines.get(count);

            String hisHand = s.substring(0, 1);
            String myHand = s.substring(2);

            calculateScore(hisHand, myHand);

            count++;
        }

        System.out.println("Solution 2-1: " + myTotalScore);
    }

    public void calculateScore(String hisHand, String myHand) {
        switch (myHand) {
            case "X" -> {
                myTotalScore = myTotalScore + 1;
                if (hisHand.equals("A")) {
                    myTotalScore = myTotalScore + 3;
                } else if (hisHand.equals("C")) {
                    myTotalScore = myTotalScore + 6;
                }
            }
            case "Y" -> {
                myTotalScore = myTotalScore + 2;
                if (hisHand.equals("A")) {
                    myTotalScore = myTotalScore + 6;
                } else if (hisHand.equals("B")) {
                    myTotalScore = myTotalScore + 3;
                }
            }
            case "Z" -> {
                myTotalScore = myTotalScore + 3;
                if (hisHand.equals("B")) {
                    myTotalScore = myTotalScore + 6;
                } else if (hisHand.equals("C")) {
                    myTotalScore = myTotalScore + 3;
                }
            }
        }
    }
}