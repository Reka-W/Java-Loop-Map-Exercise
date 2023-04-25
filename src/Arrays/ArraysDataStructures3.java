package Arrays;
import java.util.Arrays;

public class ArraysDataStructures3 {
	public static void main(String[] args) {
	System.out.println(Arrays.toString(toPower(5, 3)));
		
	};	
	
	
	public static int[] toPower(int size, int power) {
		int[] result = new int[size]; 
		for (int i = 0; i < result.length; i++) {
			result[i] =  (int) Math.pow(i, power);
		}
		return result;
	}

}