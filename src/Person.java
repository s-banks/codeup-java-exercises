public class Person {
	private String name;
	private int age;
	private String occupation;
	private String eyeColor;
	public static final boolean areBipedal = true;
	public static final String bloodTemperature = "warm";


	public String getName(){
//TODOne: return the person's name
		return this.name;
	}

	public void setName(String name){
//TODOne: change the name field to the passed value
		this.name = name;
	}
	public String sayHello(){
//TODO: print a message to the console using the person's name
		return String.format("Hello, my name is %s", this.name, this.age, this.occupation);
	}



//	public String sayHello() {
//		if (eyeColor == null) {
//			return String.format("Hello, my name is %s, and I'm %d years old. I toil away as a %s. It's a livin'!", this.name, this.age, this.occupation);
//		} else {
//			return String.format("Hello, my name is %s, and I'm %d years old with beautiful %s eyes. I toil away as a %s. It's a livin'!", this.name, this.age, this.eyeColor, this.occupation);
//		}
//	}

//	public String getName() {
//		return this.name;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public Person() {
	}

	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
//        this.eyeColor = "brown";
	}

	public Person(String name, int age, String occupation, String eyeColor) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.eyeColor = eyeColor;
	}

	public static void main(String[] args) {
		Person ron = new Person("Ron", 42, "Long Haul Trucker/Calgon Representative");
//        ron.name = "Ron";
//        ron.age = 42;
//        ron.occupation = "Long Haul Trucker/Calgon Representative";

		Person jeff = new Person("Jeff", 37, "Rocket Scientist", "amber");
//        jeff.name = "Jeff";
//        jeff.age = 37;
//        jeff.occupation = "Rocket Scientist";

//		System.out.println(ron.sayHello());
//		System.out.println(jeff.sayHello());

		//System.out.println(ron.name);

		//System.out.println(Person.areBipedal);
	}
}