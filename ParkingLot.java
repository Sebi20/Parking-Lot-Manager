package vehicle;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class ParkingLot{
	private Map<Car, LocalTime>lot;
	final private int lotMax;// Maximum Parking spaces
	final private double price; // The price per hour of being in the lot
			
	
	public ParkingLot(int max, double price) {
		this.lot = new HashMap<Car, LocalTime>();
		this.lotMax = max;
		this.price = price;
		
		
	}// End of the Parking
	
	public LocalTime checkIn(Car car, LocalTime time) {
		if(this.isFull()) {
			System.out.println("Car lot is full");
			return null;
		}// End of if statement
		
		return lot.put(car, time);
	
	}// End of the checkIn method
	
	public double checkout(Car car, LocalTime time) {
		double cost;
		if(lot.containsKey(car)) {
			
			/*As we remove the remove the car, the time is returned
			we collect the time when removing the car and then use the
			until function to find the difference in time in terms of hours passed.
			This is then multiplied by the price to get the true cost of the car being in the lot. */
			return cost = lot.remove(car).until(time, ChronoUnit.HOURS) * this.price;
			
		}// End of the if statement
		return 0.0;// returns the 0.0 as default if the car isn't found in the lot
	}// End of the checkout method
	
	
	public boolean isFull() {
		return this.lotMax == this.numOfCars();
	}// End of the isFull method
	
	public boolean isEmpty() {
		if(this.lot.size() == 0) {
			return true;
		}// End of if statement
		
		return false;
	}// End of the isEmpty method
	
	public int numOfCars() {
		return this.lot.size();
	}// End of the numOfCars method
	
	public boolean contains(Car car) {
		return this.lot.containsKey(car);
	}// End of the contains method
	
	public boolean contains(LocalTime time) {
		return this.lot.containsValue(time);
	}// End of the contains method
	
	public void displayCars() {
		for (Map.Entry<Car, LocalTime> entry : lot.entrySet()) {
		    System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// End of the class