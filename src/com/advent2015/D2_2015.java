package com.advent2023.template;

import java.util.ArrayList;
import java.util.List;

import com.advent2023.utilities.FileProcessor;

public class D2_2015 {

	public static void main(String[] args) {
		D2_2015 aoc = new D2_2015();
		List<String> input = FileProcessor.textFileToList("2015_02.txt");
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
		String[] result = input.split("x");
		return result;
	}
}