public class Train implements Drivable {
	private boolean withCaboose = false;
	
	public Train(boolean withCaboose) {
		setWithCaboose(withCaboose);
	}
	
	public void setWithCaboose(boolean withCaboose) {
		this.withCaboose = withCaboose;
	}
	
	public boolean hasCaboose() {
		return withCaboose;
	}
	
	public void moveAround() {
        System.out.println("Engaging pistons... Moving many wheels...");
    }
	
    public void makeSignalNoise() {
        System.out.println("Toot!");
    }
}
