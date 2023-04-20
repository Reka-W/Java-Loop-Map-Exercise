import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class LoopsDataStructures {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		ArrayList<Integer> numInputs = new ArrayList<Integer>();	
		
		Scanner enterNum = new Scanner(System.in);
		System.out.println("Enter a whole number:");
		int num1 = enterNum.nextInt();
		numInputs.add(num1);
		System.out.println(numInputs);

		Scanner enterNum2 = new Scanner(System.in);
		System.out.println("Enter another whole number:");
		int num2 = enterNum.nextInt();
		numInputs.add(num2);
		System.out.println(numInputs);
		
		Scanner enterNum3 = new Scanner(System.in);
		System.out.println("Enter a third whole number:");
		int num3 = enterNum3.nextInt();
		numInputs.add(num3);
		System.out.println(numInputs);
		
		Scanner enterNum4 = new Scanner (System.in);
		System.out.println("Enter a fourth whole number:");
		int num4 = enterNum4.nextInt();
		numInputs.add(num4);
		System.out.println(numInputs);
		
		Scanner enterNum5 = new Scanner(System.in);
		System.out.println("Enter one more number, please:");
		int num5 = enterNum5.nextInt();
		numInputs.add(num5);
		System.out.println(numInputs);
		
		System.out.println("The sum is " + Sum(numInputs) + ".");
		
		System.out.println("The product is " + Product(numInputs));
		
		int largest = Collections.max(numInputs);
		System.out.println(largest);
		
		int smallest = Collections.min(numInputs);
		System.out.println(smallest);
	}
	
	public static int Sum(ArrayList<Integer> numInputs) {
		int sum = 0;
		for (int i = 0; i < numInputs.size(); i++) {
			sum = sum + numInputs.get(i);
		}
		return sum;
	}
	
	public static int Product(ArrayList<Integer> numInputs) {
		int product = 1;
		for (int i = 0; i < numInputs.size(); i++) {
			product *= numInputs.get(i);
		}
		return product;
	}

}
