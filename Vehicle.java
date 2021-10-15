package vehicle;

import java.awt.*;

public class Vehicle{
	private Color color;
	private String brand;
	private String type;
	private int wheelNum;
	
	
	public Vehicle(String brand, String type)	{
		this.brand = brand;
		this.type = type;
		
	}// End of the constructor	
	
	public Vehicle() {
		
	}// End of the default constructor
	
	/*Setters*/
	
	public void setBrand(String brand) {
		this.brand = brand;
	}// End of the setType method
	
	public void setType(String type) {
		this.type = type;
	}// End of the setType method
	
	public void getColor(Color color) {
		this.color = color;
	}// End of the setColor method
	
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}// End of the the setWheelNum method
	
	
	/*Getters*/
	
	public String getBrand() {
		return this.brand;
	}// End of the getBrand method
	
	public String getType() {
		return this.brand;
	}// End of the getType method
	
	public Color getColor() {
		return this.color;
	}// End of the getColor method
	
	public int getWheelNum() {
		return this.wheelNum;
	}// End of the getWheelNum method
	
	
}// End of the vehicle class