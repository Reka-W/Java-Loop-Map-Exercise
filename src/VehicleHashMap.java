import java.util.HashMap;
import java.util.Scanner;


public class VehicleHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> vehicles = new HashMap<>();
			vehicles.put("Mazda", "6");
			vehicles.put("Toyota", "Celica");
			vehicles.put("Honda", "Accord");
			vehicles.put("Ford", "Focus");
			
		Scanner input = new Scanner(System.in);
		System.out.println("What car model are you looking for?");
		
		String customerRequest = input.nextLine();
		
		if (vehicles.containsKey(customerRequest)) {
			System.out.println("Oh, you're looking for a " + vehicles.get(customerRequest) + "? Our " + customerRequest + " selection is right over here...");
		}
		else if (!vehicles.containsKey(customerRequest)) {
			System.out.println("Sorry, we're all out. But, how about I show you what we have in stock.");
		} 
	}
}
