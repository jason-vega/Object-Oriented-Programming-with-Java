public class Dog {
	private static final int DOG_AWESOMENESS_LEVEL = 9001;
	private static int dogsBorn = 0;
	
	private String name = "Snoopy";
	private int age = 0;
	private int weight = 10;
	private int id = dogsBorn;
	
	public Dog() {
		increaseDogsBorn();
		setId();
	}
	
	public Dog(String name) {
		this();
		setName(name);
	}
	
	public Dog(String name, int age, int weight) {
		this(name);
		setAge(age);
		setWeight(weight);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setId() {
		this.id = dogsBorn;
	}
	
	public void increaseDogsBorn() {
		dogsBorn++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getDogsBorn() {
		return dogsBorn;
	}
	
	public static int getAwesomenessLevel() {
		return DOG_AWESOMENESS_LEVEL;
	}
	
	public void listInfo() {
		System.out.println(getName() + "'s Age: " + getAge());
		System.out.println(getName() + "'s Weight: " + getWeight());
		System.out.println(getName() + "'s ID: " + getId());
	}
	
	public void wagTail() {
		System.out.println(name + ": *wags tail*");
	}
}
