package vehicle;

import java.util.*;
import java.io.*;
import java.time.*;


public class ParkingLot{
	private Set <Car> lot;
	final private int lotMax;// Maximum Parking spaces
	private LocalTime time;
	final private double price;
	
	
			
	
	public ParkingLot(int max, double price) {
		this.lotMax = max;
		this.price = price;
		
		
	}// End of the Parking
	
	public void checkIn(Car car, LocalTime time) {
		
		
	}// End of the checkIn method
	
	
	
	
	
	/*Adds a car to the parking lot
	 * However if car lot is full then the car is not added, false is returned. 
	 * returns true if parking lot isn't full */
	public boolean addCar(Car car) {
		if(isFull()) {
			return false;
		}// End of the if statement
		return this.lot.add(car);
		
	}// End of the addCar method
	
	public boolean removeCar(Car car) {
		if(this.isEmpty()) {
			return false;
		}// End of the if statement
		
		return this.lot.remove(car);
	}// End of the removeCar method
	
	/*If the number of cars in the lot is equal to max spaces in the lot
	 * then the method returns true
	 * otherwise, false
	 * */
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
		return this.lot.contains(car);
	}// End of the contains method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// End of the class