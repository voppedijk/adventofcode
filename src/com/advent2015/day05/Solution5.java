package com.advent2015.day05;

import com.utilities.FileProcessor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution5 {

    public static void main(String[] args) {
        List<String> input = FileProcessor.textFileToList("2015", "05.txt");
        Solution5 aoc = new Solution5();
        boolean part1 = false;

        int[] naughtyAndNice = aoc.getNaughtyAndNice(input, part1);

        System.out.println("Naughty: " + naughtyAndNice[0] + " Nice: " + naughtyAndNice[1]);
    }

    private int[] getNaughtyAndNice(List<String> input, boolean part1) {
        int naughty = 0;
        int nice = 0;

        if (part1) {
            for (String s : input) {
                boolean hasThreeVowels = inputHasThreeVowels(s);
                boolean hasDoubleLetters = inputHasDoubleLetters(s);
                boolean hasNaughtyString = inputHasNaughtyString(s);

                if (hasThreeVowels && hasDoubleLetters && !hasNaughtyString) {
                    nice++;
                } else {
                    naughty++;
                }
            }
        } else {
            for (String s : input) {
                boolean hasPairTwice = inputHasPairTwice(s);
                boolean hasLetterThatRepeats = inputHasLetterThatRepeatsWithOneLetterInBetween(s);

                if (hasPairTwice && hasLetterThatRepeats) {
                    nice++;
                } else {
                    naughty++;
                }
            }
        }

        return new int[]{naughty, nice};
    }

    public boolean inputHasPairTwice(String input) {
        Set<String> doubleLetter = new HashSet<>();

        for (int i = 0; i < input.length() - 1; i++) {
            String firstLetter = String.valueOf(input.charAt(i));
            String secondLetter = String.valueOf(input.charAt(i + 1));

            if (!doubleLetter.add(firstLetter + secondLetter)) {
                return true;
            }

            if (firstLetter.equals(secondLetter)) {
                if (i < input.length() - 2 && firstLetter.equals(String.valueOf(input.charAt(i + 2)))) {
                    i++;
                }
            }
        }

        return false;
    }

    public boolean inputHasLetterThatRepeatsWithOneLetterInBetween(String input) {
        String letter1 = String.valueOf(input.charAt(0)).toLowerCase();
        String letter2 = String.valueOf(input.charAt(1)).toLowerCase();
        boolean hasLetterThatRepeats = false;

        for (int i = 2; i < input.length(); i++) {
            String currentLetter = String.valueOf(input.charAt(i)).toLowerCase();
            if (letter1.equals(currentLetter)) {
                hasLetterThatRepeats = true;
                break;
            }
            letter1 = letter2;
            letter2 = currentLetter;
        }

        return hasLetterThatRepeats;
    }

    public boolean inputHasThreeVowels(String input) {
        int amountOfVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            if ("aeiou".contains(String.valueOf(input.charAt(i)).toLowerCase())) {
                amountOfVowels++;
            }
        }

        return amountOfVowels >= 3;
    }

    public boolean inputHasDoubleLetters(String input) {
        String letter = String.valueOf(input.charAt(0)).toLowerCase();
        boolean hasDoubleLetter = false;

        for (int i = 1; i < input.length(); i++) {
            String currentLetter = String.valueOf(input.charAt(i)).toLowerCase();
            if (letter.equals(currentLetter)) {
                hasDoubleLetter = true;
                break;
            }
            letter = currentLetter;
        }

        return hasDoubleLetter;
    }

    public boolean inputHasNaughtyString(String input) {
        boolean hasNaughtyString = false;
        input = input.toLowerCase();

        if (input.contains("ab") || input.contains("cd") ||
                input.contains("pq") || input.contains("xy")) {
            hasNaughtyString = true;
        }

        return hasNaughtyString;
    }
}
