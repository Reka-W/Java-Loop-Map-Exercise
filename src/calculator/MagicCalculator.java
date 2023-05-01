package calculator;

class MagicCalculator extends CalculatorExercise {
	public static int squareRoot(int num) {
		total = (int)(Math.sqrt(num));
		return total;
	}
	
	public static int sin(int num) {
		total = (int)(Math.sin(num));
		return total;
	}
	
	public static int cosine(int num) {
		total = (int)(Math.cos(num));
		return total;
	}
	
	public static int tangent(int num) {
		total = (int)(Math.tan(num));
		return total;
	}
	
	public static int factorial(int num) {
		total = 1;
		for(int i = 1; i < num; i++) {
			total = total * i; 
		}
		return total;
		
	}
	
}
