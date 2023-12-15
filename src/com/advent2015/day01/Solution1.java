package com.advent2015.day01;

import com.utilities.FileProcessor;

import java.util.List;

class Solution1 {

    public static void main(String[] args) {
        List<String> input = FileProcessor.textFileToList("2015","01.txt");

        Solution1 aoc = new Solution1();
        aoc.calculateFloor(input.get(0));
    }

    private void calculateFloor(String s) {
        int currentFloor = 0;
        boolean b = true;
        int part2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                currentFloor++;
            } else if (s.charAt(i) == ')') {
                currentFloor--;

                if (currentFloor == -1 & b) {
                    part2 = i + 1;
                    b = false;
                }
            }
        }

        System.out.println("Part1 answer. Current floor: " + currentFloor);
        System.out.println("Part2 answer. First time going down: " + part2);
    }
}