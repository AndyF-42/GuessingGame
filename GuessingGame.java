import java.util.Scanner;

/*
 * In this project, the program creates a number from 1 to 50
 * and the user tries to guess the number while being told 
 * whether the number was too high or too low. If correct,
 * program will tell how many tries it took ask to play again.
 * Author: Andy Fleischer
 * Date: 9-10-2019 
 */


public class GuessingGame {

	//Constructor function
	public GuessingGame() {
		
		Scanner scanner = new Scanner(System.in);
		boolean stillPlaying = true;
		System.out.println("I am thinking of a number between 1 and 50, and you have to find out what it is.");
		
		while (stillPlaying) {
			int randomNum = (int)(Math.random() * 51);
			int guess = -1;
			int tries = 0;
			
			while (guess != randomNum) {
				System.out.println("What is your guess?");
				String input = scanner.nextLine();
				guess = Integer.parseInt(input);
				tries++;
				
				if (guess < randomNum) {
					System.out.println("Too low!");
				}
				else if (guess > randomNum) {
					System.out.println("Too high!");
				}
				else {
					System.out.println("That's it! It took you " + tries + " guesses.");
				}
			}
			System.out.println("Would you like to play again?");
			String yesno = scanner.nextLine().toLowerCase();
			
			if (yesno.equals("yes") || yesno.equals("y")) {
				System.out.println("Okay! I have another number.");
				stillPlaying = true;
			}
			else {
				stillPlaying = false;
			}
		}
		System.out.println("Goodbye!");
	}
	
	//Main method (starts constructor function
	public static void main(String[] args) {
		new GuessingGame();
	}

}
