package com.advent2022.day05;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Advent05Test {

    Advent05 actual = new Advent05();

    @Test
    public void canMoveMultipleCrates() {
        List<String> input = List.of(
                "    [D]    ",
                "[N] [C]    ",
                "[Z] [M] [P]",
                " 1   2   3 ",
                "",
                "move 1 from 2 to 1",
                "move 3 from 1 to 3",
                "move 2 from 2 to 1",
                "move 1 from 1 to 2");

        Map<Integer, Deque> dequeMap = actual.getIntegerDequeMap(input, true);
        assertEquals("C", dequeMap.get(1).getLast());
        assertEquals("M", dequeMap.get(2).getLast());
        assertEquals("Z", dequeMap.get(3).getLast());
    }

    @Test
    public void canMoveCrate() {
        String input = "move 1 from 1 to 3";
        Instruction actualInstruction = new Instruction(input);
        Deque<String> stack1 = new ArrayDeque<>();
        stack1.add("N");
        Deque<String> stack3 = new ArrayDeque<>();
        stack3.add("P");
        Map<Integer, Deque> dequeMap = new HashMap<>();
        dequeMap.put(1, stack1);
        dequeMap.put(3, stack3);
        actual.moveCrate(dequeMap, actualInstruction);

        assertEquals("P", dequeMap.get(3).getFirst());
        assertEquals("N", dequeMap.get(3).getLast());
    }

    @Test
    public void canCreateInstruction() {
        String input = "move 11 from 7 to 2";
        Instruction actualInstruction = new Instruction(input);

        assertEquals(11, actualInstruction.getAmount());
        assertEquals(7, actualInstruction.getFrom());
        assertEquals(2, actualInstruction.getTo());
    }

    @Test
    public void canCreateMapOfStacks() {
        List<String> input = List.of(
                "    [D]    ",
                "[N] [C]    ",
                "[Z] [M] [P]",
                " 1   2   3 ");

        Deque<String> stack1 = new ArrayDeque<>();
        stack1.add("Z");
        stack1.add("N");
        Deque<String> stack2 = new ArrayDeque<>();
        stack2.add("M");
        stack2.add("C");
        stack2.add("D");
        Deque<String> stack3 = new ArrayDeque<>();
        stack3.add("P");

        Map<Integer, Deque> actualMap = actual.createDeque(input);

        assertArrayEquals(stack1.toArray(), actualMap.get(1).toArray());
        assertArrayEquals(stack2.toArray(), actualMap.get(2).toArray());
        assertArrayEquals(stack3.toArray(), actualMap.get(3).toArray());
    }
}