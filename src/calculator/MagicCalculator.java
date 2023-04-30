package calculator;

class MagicCalculator extends CalculatorExercise {
	public int squareRoot(int num) {
		total = (int)(Math.sqrt(num));
		return total;
	}
	
	public int sin(int num) {
		total = (int)(Math.sin(num));
		return total;
	}
	
	public int cosine(int num) {
		total = (int)(Math.cos(num));
		return total;
	}
	
	public int tangent(int num) {
		total = (int)(Math.tan(num));
		return total;
	}
	
	public int factorial(int num) {
		total = 1;
		for(int i = 1; i < num; i++) {
			total = total * i; 
		}
		return total;
		
	}
	
}
