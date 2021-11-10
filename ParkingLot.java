package vehicle;

import java.util.*;
import java.io.*;
import java.time.*;


public class ParkingLot{
	private Set <Set<Car>> lot;
	private int levels;// The number of levels that a parking lot has. 
	private int lvlMax;// Max number of cars that can fit on each level
	private int lotMax;// Maximum Parking spaces
	private int count;// The count of all the cars in the parking lot
	private LocalTime time;
	private double price;
	private boolean isFull;
	private boolean isEmpty;
	
	
			
	
	public ParkingLot() {
		
		
	}// End of the Parking
	
	/*Setters*/
	public void setLevels(int levels) {
		this.levels = levels;
		
	}// End of the setLevels method
	
	public void lvlMax(int max) {
		this.lvlMax = max;
	}// End of the lvlMax method
	
	
	
	
	/*Getters*/
	
	
	
	
	
	
	
	
}// End of the class