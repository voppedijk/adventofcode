package com.advent2015.day04;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution4 {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Solution4 aoc = new Solution4();
        boolean part1 = false;
        MessageDigest md = MessageDigest.getInstance("MD5");

        for (int i = 0; i < 10000000; i++) {
            String input = "bgvyzdsv" + i;
            byte[] theMD5digest = md.digest(input.getBytes());
            String s = aoc.toHex(theMD5digest);

            if (part1 && s.startsWith("00000")) {
                System.out.println(s);
                System.out.println("Solution part1: " + i);
                return;
            } else if (s.startsWith("000000")) {
                System.out.println(s);
                System.out.println("Solution part2: " + i);
                return;
            }
        }
    }

    public String toHex(byte[] bytes) {
        BigInteger bi = new BigInteger(1, bytes);
        return String.format("%0" + (bytes.length << 1) + "X", bi);
    }
}