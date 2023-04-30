public class ClassesAndObjects {
	
	public static void main() {
		Singer Luther = new Singer();
	}
	
	public class Pet {
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
			this.getType();
		}
	}
	
	public static class Singer {
		private String name;
		private String firstAlbum;
		private int yearBorn;
		private String pronoun;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getFirstAlbum() {
			return firstAlbum;
		}
		
		public void setFirstAlbum(String firstAlbum) {
			this.firstAlbum = firstAlbum;
		}
		
		public int getyearBorn() {
			return yearBorn;
		}
		
		public void setyearBorn(int yearBorn) {
			this.yearBorn = yearBorn;
		}
		
		public String getPronoun() {
			return pronoun;
		}
		
		public void setPronoun(String pronoun) {
			this.pronoun = pronoun;
		}
		
		public Singer() { }
		
		public Singer(String name, String firstAlbum) {
			this.setName(name);
			this.setFirstAlbum(firstAlbum);
		}
		
		public Singer(String name, String firstAlbum, int yearBorn, String pronoun) {
			this.setName(name);
			this.setFirstAlbum(firstAlbum);
			this.setyearBorn(yearBorn);
			this.setPronoun(pronoun);
		}
		
		public void intro(String name, int yearBorn, String pronoun, String firstAlbum) {
			System.out.println("Legendary singer " + name + " was born in " + yearBorn + ". " + pronoun + " first album was " + firstAlbum + ".");
		}
		
		public void overFifty(int age) {
			System.out.println(pronoun.equalsIgnoreCase("Her"));
		}
	}
}


