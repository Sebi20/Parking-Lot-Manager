package vehicle;

import java.awt.*;

public class Vehicle{
	private Color color;// Color of the vehicle 
	private String brand;// Brand of the vehicle
	private String type;// Type of the vehicle
	private String name;// Given name of the vehicle
	private int vMax;// Top speed of the vehicle
	private double weight;// Weight of the vehicle
	private double length;// length of the vehicle
	private double height;// Height of the vehicle
	private double width; // Width of the vehicle
	
	
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
	
//	public void setWheelNum(int wheelNum) {
//		this.wheelNum = wheelNum;
//	}// End of the the setWheelNum method
	
	public void setName(String name){
		this.name = name;
	}// End of the setName method
	
	public void setVMax(int vMax) {
		
	}// End of the setVMax method
	
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
	
	public int getVMax() {
		return this.vMax;
	}// End of the getVMax method
	
	public String getname() {
		return this.name;
	}// End of the getName method	
	
	public String toString() {
		return this.color + " " + this.brand + " " + this.name;
	}// End of the toString method
	
	public boolean equals(Vehicle v) { // More work to be done
		return this.brand.equals(v.brand) && this.color.equals(v.color) && this.name.equals(v.name) && this.type.equals(v.type);
		
	}// End of the equals method
	
	
}// End of the vehicle class