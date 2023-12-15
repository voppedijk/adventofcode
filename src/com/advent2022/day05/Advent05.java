package com.advent2022.day05;

import com.utilities.FileProcessor;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

public class Advent05 {

	Stack<String> stack1 = new Stack<>();
	Stack<String> stack2 = new Stack<>();
	Stack<String> stack3 = new Stack<>();
	Stack<String> stack4 = new Stack<>();
	Stack<String> stack5 = new Stack<>();
	Stack<String> stack6 = new Stack<>();
	Stack<String> stack7 = new Stack<>();
	Stack<String> stack8 = new Stack<>();
	Stack<String> stack9 = new Stack<>();

	List<String> bestand;

	public void init() throws IOException {
		bestand = FileProcessor.textFileToList("", "");

	}

	public void opdracht5() throws IOException {
		init();
		createStacks();

		for (String s : bestand) {

			String[] splitOpKoppelteken = s.split("-");

			int moveAantalKratten = Integer.valueOf(splitOpKoppelteken[0]);
			int teller = 0;
			int from = Integer.valueOf(splitOpKoppelteken[1]);
			int to = Integer.valueOf(splitOpKoppelteken[2]);

			while (teller < moveAantalKratten) {

				switch (from) {

				case 1:
					if(to == 2) {
						stack2.push(stack1.pop());
					}
					if(to == 3) {
						stack3.push(stack1.pop());
					}
					if(to == 4) {
						stack4.push(stack1.pop());
					}
					if(to == 5) {
						stack5.push(stack1.pop());
					}
					if(to == 6) {
						stack6.push(stack1.pop());
					}
					if(to == 7) {
						stack7.push(stack1.pop());
					}
					if(to == 8) {
						stack8.push(stack1.pop());
					}
					if(to == 9) {
						stack9.push(stack1.pop());
					}
					break;

				case 2:

					if(to == 1) {
						stack1.push(stack2.pop());
					}
					if(to == 3) {
						stack3.push(stack2.pop());
					}
					if(to == 4) {
						stack4.push(stack2.pop());
					}
					if(to == 5) {
						stack5.push(stack2.pop());
					}
					if(to == 6) {
						stack6.push(stack2.pop());
					}
					if(to == 7) {
						stack7.push(stack2.pop());
					}
					if(to == 8) {
						stack8.push(stack2.pop());
					}
					if(to == 9) {
						stack9.push(stack2.pop());
					}
					break;

				case 3:

					if(to == 1) {
						stack1.push(stack3.pop());
					}
					if(to == 2) {
						stack2.push(stack3.pop());
					}
					if(to == 4) {
						stack4.push(stack3.pop());
					}
					if(to == 5) {
						stack5.push(stack3.pop());
					}
					if(to == 6) {
						stack6.push(stack3.pop());
					}
					if(to == 7) {
						stack7.push(stack3.pop());
					}
					if(to == 8) {
						stack8.push(stack3.pop());
					}
					if(to == 9) {
						stack9.push(stack3.pop());
					}
					break;

				case 4:

					if(to == 1) {
						stack1.push(stack4.pop());
					}
					if(to == 2) {
						stack2.push(stack4.pop());
					}
					if(to == 3) {
						stack3.push(stack4.pop());
					}
					if(to == 5) {
						stack5.push(stack4.pop());
					}
					if(to == 6) {
						stack6.push(stack4.pop());
					}
					if(to == 7) {
						stack7.push(stack4.pop());
					}
					if(to == 8) {
						stack8.push(stack4.pop());
					}
					if(to == 9) {
						stack9.push(stack4.pop());
					}
					break;

				case 5:

					if(to == 1) {
						stack1.push(stack5.pop());
					}
					if(to == 2) {
						stack2.push(stack5.pop());
					}
					if(to == 3) {
						stack3.push(stack5.pop());
					}
					if(to == 4) {
						stack4.push(stack5.pop());
					}
					if(to == 6) {
						stack6.push(stack5.pop());
					}
					if(to == 7) {
						stack7.push(stack5.pop());
					}
					if(to == 8) {
						stack8.push(stack5.pop());
					}
					if(to == 9) {
						stack9.push(stack5.pop());
					}
					break;

				case 6:

					if(to == 1) {
						stack1.push(stack6.pop());
					}
					if(to == 2) {
						stack2.push(stack6.pop());
					}
					if(to == 3) {
						stack3.push(stack6.pop());
					}
					if(to == 4) {
						stack4.push(stack6.pop());
					}
					if(to == 5) {
						stack5.push(stack6.pop());
					}
					if(to == 7) {
						stack7.push(stack6.pop());
					}
					if(to == 8) {
						stack8.push(stack6.pop());
					}
					if(to == 9) {
						stack9.push(stack6.pop());
					}
					break;

				case 7:

					if(to == 1) {
						stack1.push(stack7.pop());
					}
					if(to == 2) {
						stack2.push(stack7.pop());
					}
					if(to == 3) {
						stack3.push(stack7.pop());
					}
					if(to == 4) {
						stack4.push(stack7.pop());
					}
					if(to == 5) {
						stack5.push(stack7.pop());
					}
					if(to == 6) {
						stack6.push(stack7.pop());
					}
					if(to == 8) {
						stack8.push(stack7.pop());
					}
					if(to == 9) {
						stack9.push(stack7.pop());
					}
					break;

				case 8:

					if(to == 1) {
						stack1.push(stack8.pop());
					}
					if(to == 2) {
						stack2.push(stack8.pop());
					}
					if(to == 3) {
						stack3.push(stack8.pop());
					}
					if(to == 4) {
						stack4.push(stack8.pop());
					}
					if(to == 5) {
						stack5.push(stack8.pop());
					}
					if(to == 6) {
						stack6.push(stack8.pop());
					}
					if(to == 7) {
						stack7.push(stack8.pop());
					}
					if(to == 9) {
						stack9.push(stack8.pop());
					}
					break;

				case 9:

					if(to == 1) {
						stack1.push(stack9.pop());
					}
					if(to == 2) {
						stack2.push(stack9.pop());
					}
					if(to == 3) {
						stack3.push(stack9.pop());
					}
					if(to == 4) {
						stack4.push(stack9.pop());
					}
					if(to == 5) {
						stack5.push(stack9.pop());
					}
					if(to == 6) {
						stack6.push(stack9.pop());
					}
					if(to == 7) {
						stack7.push(stack9.pop());
					}
					if(to == 8) {
						stack8.push(stack9.pop());
					}
					break;

				}

				teller++;
			}
		}

		System.out.println("1: " + stack1.peek() + ". 2: " + stack2.peek() + ". 3: " + stack3.peek() + ". 4: "
				+ stack4.peek() + ". 5: " + stack5.peek() + ". 6: " + stack6.peek() + ". 7: " + stack7.peek() + ". 8: "
				+ stack8.peek() + ". 9: " + stack9.peek());
	}

	public void createStacks() {

		stack1.push("S");
		stack1.push("Z");
		stack1.push("P");
		stack1.push("D");
		stack1.push("L");
		stack1.push("B");
		stack1.push("F");
		stack1.push("C");

		stack2.push("N");
		stack2.push("V");
		stack2.push("G");
		stack2.push("P");
		stack2.push("H");
		stack2.push("W");
		stack2.push("B");

		stack3.push("F");
		stack3.push("W");
		stack3.push("B");
		stack3.push("J");
		stack3.push("G");

		stack4.push("G");
		stack4.push("J");
		stack4.push("N");
		stack4.push("F");
		stack4.push("L");
		stack4.push("W");
		stack4.push("C");
		stack4.push("S");

		stack5.push("W");
		stack5.push("J");
		stack5.push("L");
		stack5.push("T");
		stack5.push("P");
		stack5.push("M");
		stack5.push("S");
		stack5.push("H");

		stack6.push("B");
		stack6.push("C");
		stack6.push("W");
		stack6.push("G");
		stack6.push("F");
		stack6.push("S");

		stack7.push("H");
		stack7.push("T");
		stack7.push("P");
		stack7.push("M");
		stack7.push("Q");
		stack7.push("B");
		stack7.push("W");

		stack8.push("F");
		stack8.push("S");
		stack8.push("W");
		stack8.push("T");

		stack9.push("N");
		stack9.push("C");
		stack9.push("R");

	}

}
