public class DogHouse {
	// Can create both Dog and FyingDog objects
    	private static Dog sunnie = new Dog(3); 
    	private static FlyingDog superSunnie = new FlyingDog(4);
    	private static BionicDog bionicSunnie = new BionicDog(5);
    
    	public static void main(String[] args) {
        	sunnie.woof(); // sunnie can only "Woof!"
        	System.out.println("sunnie is " + sunnie.getAge());
        
        	superSunnie.woof(); // superSunnie can do everything sunnie can do...
        	System.out.println("supperSunnie is " + superSunnie.getAge());
        	superSunnie.fly(); // ...and more!
        
        	bionicSunnie.woof(); // bionicSunnie can do everything superSunnie can do...
        	System.out.println("bionicSunnie is " + bionicSunnie.getAge());
        	bionicSunnie.fly(); // ...with a cool overridden fly() method!
	}
}
