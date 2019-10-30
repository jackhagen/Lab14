package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String cont = "y";

		Player opponent;

		System.out.println("Welcome");
		String name = Validator.getString(scnr, "Enter your name: ");

		int choice = Validator.getInt(scnr, "Would you like to play against \n1. PlayerRock or \n2. PlayerOptimal?", 1,
				2);

		if (choice == 1) {

			opponent = new PlayerRock("Whale");

		} else {

			opponent = new PlayerOptimal("LIBRATUS");

		}

		while (cont.equalsIgnoreCase("y")) {

			String input = Validator.getString(scnr, "Rock, Paper, or Scissors?");

			System.out.println(opponent.generateRoshambo());

			cont = Validator.getStringMatchingRegex(scnr, "Would you like to play again? (y/n)", "[YyNn]");

		}

		scnr.close();

	}

}
