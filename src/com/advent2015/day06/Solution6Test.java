package com.advent2015.day06;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution6Test {

    Solution6 actual = new Solution6();

    @Test
    public void canToggleLight() {

    }

    @Test
    public void canTurnLightOff() {

    }

    @Test
    public void canTurnLightOn() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put(0 + "," + 0, 1);
        expected.put(0 + "," + 1, 0);
        expected.put(1 + "," + 0, 0);
        expected.put(1 + "," + 1, 0);

        Map<String, Integer> actualMap = actual.createLight(2);
        actual.turnOnLights(actualMap, 0, 0, 0, 0);

        assertEquals(expected, actualMap);
    }

    @Test
    public void canTurnAllLightsOn() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put(0 + "," + 0, 1);
        expected.put(0 + "," + 1, 1);
        expected.put(1 + "," + 0, 1);
        expected.put(1 + "," + 1, 1);

        Map<String, Integer> actualMap = actual.createLight(2);
        actual.turnOnLights(actualMap, 0, 0, 2, 2);

        assertEquals(expected, actualMap);
    }

    @Test
    public void canCreateLight() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put(0 + "," + 0, 0);
        expected.put(0 + "," + 1, 0);
        expected.put(1 + "," + 0, 0);
        expected.put(1 + "," + 1, 0);

        assertEquals(expected, actual.createLight(2));
    }

}