package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Random random = new Random();

		int numberToGuess = random.nextInt(100);

		int numberOfGuess = 0;

		boolean wonGame = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pick a number between 1 and 100");

		while (numberOfGuess < 5) {
			int userInput = scanner.nextInt();

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (userInput < numberToGuess) {
				System.out.println("Please pick a higher number");
				numberOfGuess = numberOfGuess + 1;
			} else if (userInput > numberToGuess) {
				System.out.println("Please pick a lower number");
				numberOfGuess = numberOfGuess + 1;
			} else {
				wonGame = true;
				break;
			}
		}

		if (wonGame) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + numberToGuess);
		}
	}

}
