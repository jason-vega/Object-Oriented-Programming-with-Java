public class BionicDog extends FlyingDog {
    public BionicDog(int age) {
        super(age);
    }
    
    @Override // “Hey, I’m going to be overriding the fly() method!”
    public void fly() { // Override fly() method inherited from FlyingDog class
        System.out.println("Jetpacks - ignite!");
        System.out.println("Lasers - blast!");
	}
}
