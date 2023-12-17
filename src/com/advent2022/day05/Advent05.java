package com.advent2022.day05;

import com.utilities.FileProcessor;

import java.util.*;

public class Advent05 {

    public static void main(String[] args) {
        List<String> input = FileProcessor.textFileToList("2022","05.txt");
        Advent05 aoc = new Advent05();
        Map<Integer, Deque> dequeMap = aoc.getIntegerDequeMap(input, false); //true for part1, false for part2

        for (Map.Entry<Integer, Deque> entry : dequeMap.entrySet()) {
            System.out.print(entry.getValue().peekLast());
        }

    }

    public Map<Integer, Deque> getIntegerDequeMap(List<String> input, boolean part1) {
        Map<Integer, Deque> dequeMap = createDeque(input);
        List<Instruction> instructionLst = new ArrayList<>();

        for (String s : input) {
            if (s.startsWith("move")) {
                instructionLst.add(new Instruction(s));
            }
        }

        if (part1) {
            for (Instruction instruction : instructionLst) {
                moveCrate(dequeMap, instruction);
            }
        } else {
            for (Instruction instruction : instructionLst) {
                moveCrate2(dequeMap, instruction);
            }
        }

        return dequeMap;
    }

    public Map<Integer, Deque> createDeque(List<String> input) {
        Map<Integer, Deque> result = new HashMap<>();
        int lineWithStackNrs = 0;
        int amountOfStacks = 0;

        for (int i = 0; i < input.size(); i++) {
            if (!       input.get(i).isBlank() && Character.isDigit(input.get(i).strip().charAt(0))) {
                lineWithStackNrs = i;
                String line = input.get(i).strip();
                amountOfStacks = Character.getNumericValue(line.charAt(line.length() - 1));
            }
        }

        int stackNr = 1;

        for (int i = 0; i < amountOfStacks; i++) {
            Deque<String> stack = new ArrayDeque<>();
            for (int j = 0; j <= lineWithStackNrs; j++) {
                String s = String.valueOf(input.get(lineWithStackNrs - j).charAt(stackNr));
                if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(s)) {
                    stack.add(s);
                }
            }

            result.put(i + 1, stack);
            stackNr += 4;
        }

        return result;
    }


    public void moveCrate(Map<Integer, Deque> dequeMap, Instruction actualInstruction) {
        int amount = actualInstruction.getAmount();
        int from = actualInstruction.getFrom();
        int to = actualInstruction.getTo();

        for (int i = 0; i < amount; i++) {
            dequeMap.get(to).add(dequeMap.get(from).pollLast());
        }
    }

    public void moveCrate2(Map<Integer, Deque> dequeMap, Instruction actualInstruction) {
        int amount = actualInstruction.getAmount();
        int from = actualInstruction.getFrom();
        int to = actualInstruction.getTo();

        Map<Integer, Deque> temp = new HashMap<>();
        temp.put(0, new ArrayDeque());

        for (int i = 0; i < amount; i++) {
            temp.get(0).add(dequeMap.get(from).pollLast());
        }

        for (int i = 0; i < amount; i++) {
            dequeMap.get(to).add(temp.get(0).pollLast());
        }
    }
}
