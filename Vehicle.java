package vehicle;

import java.awt.*;

public class Vehicle{
	private Color color;
	private String brand;
	private String type;
	private int wheelNum;
	private String name;
	
	
	public Vehicle(String brand, String type, String name)	{
		this.brand = brand;
		this.type = type;
		this.name = name;
		
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
	
	public void setName(String name){
		this.name = name;
	}// End of the setName method
	
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
	
	public String getname() {
		return this.name;
	}// End of the getName method	
	
	public String toString() {
		return this.color + " " + this.brand + " " + this.name;
	}// End of the toString method
	
	public boolean equals(Vehicle v) { // More work to be done
		return this.brand.equals(v.brand) && this.color.equals(v.color) && this.name.equals(v.name) && this.type.equals(v.type) && this.wheelNum == v.wheelNum;
		
	}// End of the equals method
	
	
}// End of the vehicle class