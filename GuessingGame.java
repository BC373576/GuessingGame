/*This game will have the user guess a number between 0 and 100
*Author: Brian Chou
*Date: 9/14/21
*/

package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public GuessingGame( ) {
		boolean stillPlaying =true;
		
		while(stillPlaying ==true) {
			//This generates the random number and sets up the scanner
			int randomNum = (int)(Math.random() * 101);
			Scanner scanner = new Scanner(System.in);
			//This sets up the guessing variable and the counting variable, which will count the number of guesses the user takes
			int guess = -1;
			int count = 0;
			//This compares the guess to the random number generated
			while(guess != randomNum) {
				String input = scanner.nextLine();
				System.out.println("You typed: " + input);
				guess = Integer.parseInt(input);
				System.out.println(guess);
				count++;
				//This tells the player that their guess is less than the random number generated
				if (guess < randomNum) {
					System.out.println("Guess is too low.");
				}
				//This tells the player that their guess is greater than the random number generated
				else if (guess > randomNum) {
					System.out.println("Guess is too high");
				}
				//This tells the player that they are correct and the number of guesses it took for them to guess the number correctly
				else {
					System.out.println("Correct");
					System.out.println("You took " + count + " number of guesses.");
				}
			}
			//This asks if the player wants to play again
			System.out.println("Play again?");
			String yesno = scanner.nextLine();
			if (yesno.equals("yes") || yesno.equals("y")) {
				stillPlaying =true;
			}
			else {
				stillPlaying = false;
			}
		}

	}
	
	public static void main(String[] args) {
		new GuessingGame();
	}

}
