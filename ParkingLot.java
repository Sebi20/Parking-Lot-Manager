package vehicle;

import java.util.*;
import java.io.*;
import java.time.*;


public class ParkingLot{
	private Map<Car, LocalTime>lot;
	final private int lotMax;// Maximum Parking spaces
	final private double price; 
	
	
			
	
	public ParkingLot(int max, double price) {
		this.lotMax = max;
		this.price = price;
		
		
	}// End of the Parking
	
	public LocalTime checkIn(Car car, LocalTime time) {
		if(this.isFull()) {
			System.out.println("Car lot is full");
			return null;
		}
		return lot.put(car, time);
	
	}// End of the checkIn method
	
	public LocalTime checkout(Car car, LocalTime time) {
		if(lot.containsKey(car)) {
			return lot.remove(car);
		}
		return null;
	}
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// End of the class