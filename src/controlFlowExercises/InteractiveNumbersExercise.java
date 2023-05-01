package controlFlowExercises;
import java.util.Scanner;

public class InteractiveNumbersExercise {

	public static void main(String[] args) {

		interactivePortion();
			
	}

	public static int clipRange(int number, int minValue, int maxValue) {
		int numberOfValues = (maxValue - minValue) + 1;
		while (number > maxValue) {
			number -= numberOfValues;
		}
		
		while (number < maxValue) {
			number += numberOfValues;
		}
		return number;
	}
	
	public static void interactivePortion() {
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String nameOfUser = nameInput.nextLine();
		
		Scanner interactivePortionInput = new Scanner(System.in);
		System.out.println("Hi " + nameOfUser + ". Would you like to continue with the interactive portion?");
		String interactiveResponse = interactivePortionInput.nextLine();
		
		if (interactiveResponse.equalsIgnoreCase("yes") || interactiveResponse.equalsIgnoreCase("y")) {
			System.out.println("Great! Let's continue!");
			
			int i = 0;
			while (i != -1) {
				
				final int MIN_RANDOM_NUMBER = 1;
				final int MAX_RANDOM_NUMBER = 65;
				final int MIN_MAGIC_BALL_NUMBER = 1;
				final int MAX_MAGIC_BALL_NUMBER = 75;
				
				System.out.println("Do you have a red car? (yes, no):");
				String carAnswer = interactivePortionInput.next();
				
				System.out.println("What is the name of your favorite pet?");
				String petAnswer = interactivePortionInput.next();
				
				System.out.println("What is the age of your favorite pet?");
				int petAgeAnswer = interactivePortionInput.nextInt();
				
				System.out.println("What is your lucky number?");
				int luckyNumberAnswer = interactivePortionInput.nextInt();
				
				System.out.println("Do you have a favorite quarterback?  If so what is their jersey number?");
				int qbAnswer = interactivePortionInput.nextInt();
				
				System.out.println("What is two-digit model year of your car?");
				int carModelAnswer = interactivePortionInput.nextInt();
				
				System.out.println("What is the first name of your favorite actor or actress? ");
				String faveCelebrityAnswer = interactivePortionInput.next();
				
				System.out.println("Enter a random number between 1 and 50.");
				int randomNumberAnswer = interactivePortionInput.nextInt();
				
				int randomNum1, randomNum2, randomNum3;
				int range = (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 1;
				
				randomNum1 = (int) (Math.random() * range) + MIN_RANDOM_NUMBER;
				
				randomNum2 = (int) (Math.random() * range) + MIN_RANDOM_NUMBER;
				
				randomNum3 = (int) (Math.random() * range) + MIN_RANDOM_NUMBER;
				
				int magicBall = clipRange(luckyNumberAnswer * randomNum1, MIN_MAGIC_BALL_NUMBER, MAX_MAGIC_BALL_NUMBER);
				
				int nonMagic1 = carModelAnswer + luckyNumberAnswer; 
				int nonMagic2 = (int) (Math.random() * 50 + 1) - randomNum2;
				int nonMagic3 = qbAnswer + petAgeAnswer + luckyNumberAnswer;
				int nonMagic4 = (int) faveCelebrityAnswer.charAt(faveCelebrityAnswer.length() -1);
				int nonMagic5 = (int) faveCelebrityAnswer.charAt(0);
				
				if (magicBall > MAX_MAGIC_BALL_NUMBER) {
					magicBall = magicBall - MAX_MAGIC_BALL_NUMBER;
				} else if (magicBall < MIN_MAGIC_BALL_NUMBER) {
					magicBall = magicBall + MAX_MAGIC_BALL_NUMBER;
				}
				
				if (nonMagic1 > MAX_RANDOM_NUMBER) {
					nonMagic1 = nonMagic2 - MAX_RANDOM_NUMBER;
				} else if (nonMagic1 < MIN_RANDOM_NUMBER) {
					nonMagic1 = nonMagic1 + MAX_RANDOM_NUMBER;
				}
				
				if (nonMagic2 > MAX_RANDOM_NUMBER) {
					nonMagic2 = nonMagic2 - MAX_RANDOM_NUMBER;
				} else if (nonMagic2 < MIN_RANDOM_NUMBER) {
					nonMagic2 = nonMagic2 + MAX_RANDOM_NUMBER;
				}
				
				if (nonMagic3 > MAX_RANDOM_NUMBER) {
					nonMagic3 = nonMagic3 - MAX_RANDOM_NUMBER;
				} else if (nonMagic3 < MIN_RANDOM_NUMBER) {
					nonMagic3 = nonMagic3 + MAX_RANDOM_NUMBER;
				}
				
				if (nonMagic4 > MAX_RANDOM_NUMBER) {
					nonMagic4 = nonMagic4 - MAX_RANDOM_NUMBER;
				} else if (nonMagic4 < MIN_RANDOM_NUMBER) {
					nonMagic4 = nonMagic4 + MAX_RANDOM_NUMBER;
				}
				
				if (nonMagic5 > MAX_RANDOM_NUMBER) {
					nonMagic5 = nonMagic5 - MAX_RANDOM_NUMBER;
				} else if (nonMagic5 < MIN_RANDOM_NUMBER) {
					nonMagic5 = nonMagic5 + MAX_RANDOM_NUMBER;
				}
				
				System.out.printf("Lottery numbers: %d, %d, %d, %d, %d  Magic ball: %d \n", nonMagic1,nonMagic2,nonMagic3,nonMagic4,nonMagic5, magicBall);
				
				System.out.println("Would you like to generate another set of numbers?");
				String playAgain = interactivePortionInput.next();
				
				if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")) {
					i= 0;
				} else {
					System.out.println("Thank you!");
					i = -1;
				}
			}
			 	
		} else {
			System.out.println("Please return later to complete the survey.");
		}	
	}
}


