public class Dog {
    private int age = 0; // age field can only be directly referenced within the Dog class
    
    public Dog (int age) {
        setAge(age);
    }
    
    public void woof() {
        System.out.println("Woof!");
    }
    
    public void setAge(int age) {
    	if (age >= 0) {
    		this.age = age;
    	}
    }
    
    public int getAge() {
    	return age;
    }
}
