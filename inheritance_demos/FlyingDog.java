public class FlyingDog extends Dog { // FlyingDog subclass derived from superclass Dog
	 /* Although FlyingDog cannot directly reference Dog's private age field,
     * it can still interact with the field through any getter and setter methods
     * defined in the superclass. Here, we set Dog’s age field using a 
     * superclass constructor.
     */
	
	public FlyingDog(int age) {
		super(age); // First line of subclass constructor must invoke a superclass constructor
	}
	
	public void fly() {
        woof(); // Can still behave like superclass (refer to its non-private methods)
        System.out.println("Wuff wuff and away!");
    }
}
