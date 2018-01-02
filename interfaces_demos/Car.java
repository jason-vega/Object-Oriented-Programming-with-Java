public class Car implements Drivable {
	private int passengers = 0;
	
	public Car(int passengers) {
		setPassengers(passengers);
	}
	
	public void setPassengers(int passengers) {
		if (passengers >= 0) {
			this.passengers = passengers;
		}
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void moveAround() { // As specified in Drivable interface
		System.out.println("Rotating set of four wheels...");
	}
	
	public void makeSignalNoise() { // As specified in Drivable interface
		System.out.println("Honk!");
	}
}
