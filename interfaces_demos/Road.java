public class Road {
	private static Car honda = new Car(4);
	private static Train thomas = new Train(true);
	
	public static void main(String[] args) {
		honda.moveAround();
		honda.makeSignalNoise();
		
		thomas.moveAround();
		thomas.makeSignalNoise();
		
		System.out.println("Drivable objects only have " + Drivable.DRIVERS + " driver.");
	}
}
