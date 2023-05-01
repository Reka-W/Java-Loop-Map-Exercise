package ClassesAndObject;

public class Singer {

	public static void main(String[] args) {
		Singer singer1 = new Singer("Luther Vandross", "Album 1", 1951, "His");
//		singer1.gender();
		singer1.bio();
	}
	
		private static String name;
		private static String firstAlbum;
		private static int yearBorn;
		private static String pronoun;
		
		public static String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public static String getFirstAlbum() {
			return firstAlbum;
		}
		
		public void setFirstAlbum(String firstAlbum) {
			this.firstAlbum = firstAlbum;
		}
		
		public static int getYearBorn() {
			return yearBorn;
		}
		
		public void setYearBorn(int yearBorn) {
			this.yearBorn = yearBorn;
		}
		
		public static String getPronoun() {
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
			this.setYearBorn(yearBorn);
			this.setPronoun(pronoun);
		}
		
		public static void bio() {
			System.out.println("Legendary singer " + getName() + " was born in " + getYearBorn() + ". " + getPronoun() + " first album was titled \"" + getFirstAlbum() + "\".");
		}
		
		public void gender(String pronoun) {
			System.out.println(pronoun.equalsIgnoreCase("Her"));
		}
}
