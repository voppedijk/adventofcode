package com.advent2015.day06;

import java.util.HashMap;
import java.util.Map;

public class Solution6 {

    public static void main(String[] args) {



    }

    public Map<String, Integer> createLight(int lightsOnGrid) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < lightsOnGrid; i++) {
            for (int j = 0; j < lightsOnGrid; j++) {
                result.put(i + "," + j, 0);
            }
        }

        return result;
    }

    public void turnOnLights(Map<String, Integer> lightMap, int xFrom, int yFrom, int xTo, int yTo) {
        int counter = 1;
        int x = xFrom + xTo;
        int y = yFrom + yTo;
        if (x == 0 && y == 0) {

        }
    }
}
