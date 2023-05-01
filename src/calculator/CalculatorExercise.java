package calculator;

import java.util.Scanner;

public class CalculatorExercise {
		public static int total = 0;
		
		public static void main(String[] args) {
			System.out.println(MagicCalculator.factorial(10));
		}
		
		public static int add(int num1, int num2) {
			total = num1 + num2;
			return total;
		} 
		
		public static int subtract(int num1, int num2) {
			total = num1 - num2;
			return total;
		}
		
		public static int multiply(int num1, int num2) {
			total = num1 * num2;
			return total;
		}
		
		public static int divide(int num1, int num2) {
			total = num1 / num2;
			return total;
		}
		
		public static int square(int num) {
			total = (int)Math.pow(num, 2);
			return total;
		}
		

}
