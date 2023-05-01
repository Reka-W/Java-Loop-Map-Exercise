package controlFlowExercises;

public class AsciiChars {
	
	public static void main(String[] args) {
		AsciiChars.printNumbers();			
	}
	
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
