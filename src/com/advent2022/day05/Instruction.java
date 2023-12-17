package com.advent2022.day05;

import java.util.Objects;

public class Instruction {
    private final int amount;
    private final int from;
    private final int to;

    Instruction(String input) {
        String[] splitted = input.split("from");
        String amount = splitted[0].replaceAll(" ", "");
        this.amount = Integer.valueOf(amount.substring(4, amount.length()));

        String[] fromTo = splitted[1].split("to");
        this.from = Integer.valueOf(fromTo[0].strip());
        this.to = Integer.valueOf(fromTo[1].strip());
    }

    public int getAmount() {
        return amount;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instruction that = (Instruction) o;
        return amount == that.amount && from == that.from && to == that.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, from, to);
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "amount=" + amount +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
