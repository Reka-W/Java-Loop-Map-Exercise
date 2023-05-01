package ClassesAndObject;

public class Pet {

	public static void main(String[] args) {
		Pet myPet = new Pet("Rex", 2, "Covington, GA", "shepherd");
		
		System.out.println(myPet.type);
	}
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getType() {
		return type;
	}
		
	Pet() { }
	
	Pet(String name, int age, String location, String type) {
		this.setName(name);
		this.setAge(age);
		this.setLocation(location); 
		this.type = type;
	}
}
