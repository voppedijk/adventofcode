package com.advent2015.day02;

import com.utilities.FileProcessor;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 aoc = new Solution2();
		List<String> input = FileProcessor.textFileToList("2015", "02.txt");
		List<Integer> result1Lst = new ArrayList<>();
		List<Integer> result2Lst = new ArrayList<>();

		for (final String s : input) {
			String[] singleLineArr = aoc.mutateInputToArray(s);
			result1Lst.add(aoc.calculateWrappingPaper(singleLineArr));
			result2Lst.add(aoc.calculateRibbon(singleLineArr));
		}

		Integer sum1 = aoc.getSum(result1Lst);
		Integer sum2 = aoc.getSum(result2Lst);

		System.out.println("AOC 2015 Day 2, part1: " + sum1);
		System.out.println("AOC 2015 Day 2, part2: " + sum2);
	}

	private Integer getSum(final List<Integer> result1Lst) {
		return result1Lst.stream()
				.reduce(0, (a, b) -> a + b);
	}

	public int calculateRibbon(final String[] lwh) {
		int l = Integer.parseInt(lwh[0]);
		int w = Integer.parseInt(lwh[1]);
		int h = Integer.parseInt(lwh[2]);

		int min = Math.min(l, Math.min(w, h));
		int max = Math.max(l, Math.max(w, h));
		int mid = l + w + h - min - max;
		int ribbon = min + min + mid + mid;

		int bow = l * w * h;

		return ribbon + bow;
	}

	public int calculateWrappingPaper(final String[] lwh) {
		int l = Integer.parseInt(lwh[0]);
		int w = Integer.parseInt(lwh[1]);
		int h = Integer.parseInt(lwh[2]);

		int lxw = l * w;
		int lxh = l * h;
		int wxh = w * h;
		int smallestNr = Math.min(Math.min(lxw, lxh), wxh);

		return (lxw * 2) + (lxh * 2) + (wxh * 2) + smallestNr;
	}

	public String[] mutateInputToArray(final String input) {
		return input.split("x");
	}
}