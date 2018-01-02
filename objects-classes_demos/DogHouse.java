public class DogHouse {
	private static Dog snoopy = new Dog();
	private static Dog sunnie = new Dog("Sunnie");
	private static Dog clifford = new Dog("Clifford", 54, 174000);
	
	public static void main(String args[]) {
		snoopy.listInfo();
		sunnie.listInfo();
		clifford.listInfo();
		
		System.out.println(Dog.getDogsBorn() + " dogs have been born so far!");
		
		sunnie.wagTail();
		clifford.wagTail();
		
		snoopy = new Dog("Snoop Dogg", 46, 165);
		
		sunnie.setAge(4);
		sunnie.setWeight(150);
		
		snoopy.listInfo();
		sunnie.listInfo();
		clifford.listInfo();
		
		System.out.println(Dog.getDogsBorn() + " dogs have been born so far!");
		System.out.println("Dogs are " + Dog.getAwesomenessLevel() + "% awesome!");
	}
}
