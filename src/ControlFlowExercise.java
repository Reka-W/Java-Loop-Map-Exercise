import java.util.Scanner;

public class ControlFlowExercise {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
//		AsciiChars.printNumbers();
//		AsciiChars.printLowerCase();
//		AsciiChars.printUpperCase();
		
		interactivePortion();
		
		
	}

	public class AsciiChars {
		static final int NUMBERS_COUNTED = 10;
		static final int LETTERS_IN_ALPHABET = 26;
		
		public static void printNumbers() {
			for (char i = 48; i < 48 + NUMBERS_COUNTED; i++) {
				System.out.println(i);
			}
		}
		
		public static void printLowerCase() {
			for (char i = 97; i < 97 + LETTERS_IN_ALPHABET; i++) {
				System.out.println(i);
			}
		}
		
		public static void printUpperCase() {
			for (char i = 65; i < 65 + LETTERS_IN_ALPHABET; i++) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void interactivePortion() {
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String nameOfUser = nameInput.nextLine();
		
		Scanner interactivePortionInput = new Scanner(System.in);
		System.out.println("Hi " + nameOfUser + ". Would you like to continue with the interactive portion?");
		String interactiveResponse = interactivePortionInput.nextLine();
		
	
		if (interactiveResponse.equalsIgnoreCase("yes") || interactiveResponse.equals("y")) {
			System.out.println("Great! Let's continue!");
			
			int i = 0;
			while (i != -1) {
				
				final int MIN_RANDOM_NUMBER = 1;
				final int MAX_RANDOM_NUMBER = 65;
				final int MIN_MAGIC_BALL__NUMBER = 1;
				final int MAX_MAGIC_BALL__NUMBER = 75;
				
				System.out.println("Do you have a red car? (yes, no):");
				String carAnswer = interactivePortionInput.nextLine();
				
				System.out.println("What is the name of your favorite pet?");
				String petAnswer = interactivePortionInput.nextLine();
				
				System.out.println("What is the age of your favorite pet?");
				int petAgeAnswer = interactivePortionInput.nextInt();
				
				System.out.println("What is your lucky number?");
				int luckyNumberAnswer = interactivePortionInput.nextInt();
				
				System.out.println("WDo you have a favorite quarterback?  If so what is their jersey number?");
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
				
				int magicBall = luckyNumberAnswer * randomNum1;
				
				int nonMagic1 = carModelAnswer + luckyNumberAnswer; 
				int nonMagic2 = (int) (Math.random() * 50 + 1) - randomNum2;
				int nonMagic3 = qbAnswer + petAgeAnswer + luckyNumberAnswer;
				int nonMagic4 = (int) faveCelebrityAnswer.charAt(faveCelebrityAnswer.length() -1);
				int nonMagic5 = (int) faveCelebrityAnswer.charAt(0);
				
				System.out.printf("Lottery numbers: %d, %d %d, %d, %d  Magic ball: %d", nonMagic1,nonMagic2,nonMagic3,nonMagic4,nonMagic5, magicBall);
				i = -1;
			}
			 
			
			
		} else {
			System.out.println("Please return later to complete the survey.");
		}
		
		

		
		
	}
	
	
}


