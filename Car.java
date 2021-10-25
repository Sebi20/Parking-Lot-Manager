package vehicle;


public class Car extends Vehicle{
	private String VIN;

	
	public Car(String brand, String type, String name) {
		super();
	}// End of the constructor
	
	public Car(String VIN) {
		this.VIN = VIN;
		
	}// End of the constructor 
	
	public Car() {
		super();
	}// End of the constructor
	
	/*Setters*/
	
	public void setVIN(String VIN) {
		this.VIN = VIN;
	}// End of the setVIN method
	
	
	/*Getters*/
	
	public String getVIN() {
		return this.VIN;
	}// End of the getVIN method
	
	
}// End of the class

