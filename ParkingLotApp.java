/*This program is used to implement the the ParkingLot class.
It's written to emulate a parking lot check in and checkout system*/

package vehicle;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JFrame;
import java.io.*;
import java.time.LocalTime;

public class ParkingLotApp{
	
	public static void main(String [] args) throws Exception{
		Car car;  
		
		Scanner input = new Scanner(System.in);
		Scanner file = new Scanner(new File("/Users/sebiseb/eclipse-workspace/Random-projects/src/vehicle/ParkingLot.txt"));
		
		final int MAX;// Represents the MAX amount of cars allowed in the lot
		double price;// Price of staying in the lot per hour
		
		
		MAX = 10;
		price = 1.25;
		
		ParkingLot lot = new ParkingLot(MAX, price);
		//readFile(lot, file);
		
		//System.out.println(lot.numOfCars());
		//lot.displayCars();
		
		
		JFrame frame = new JFrame();// Creates an instance of a JFrame.
		JLabel header = new JLabel();// Creates an instance of a JLabel. 
		
		
		
		frame.setSize(700, 700);
		frame.setTitle("Parking Lot Manager");// Sets the title of the frame (Displayed at the top).
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// This will allow you change what you want the frame to do when the frame is closed
			// This specifically allows the frame to be closed and not on in the background
		//frame.setResizable(false);// This method allows the frame to be resizable if true and not resizable if false.
		frame.getContentPane().setBackground(new Color(38, 40, 32));// Changes the color of the background
		
		
		header.setText("Parking Lot Manager");
		header.setVerticalAlignment(JLabel.TOP);
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setForeground(Color.WHITE);
		
		
		
		
		
		
		frame.add(header);
		frame.setVisible(true);// Allows you to see the frame if true.
		input.close();
		input.close();
	}// End of the main function
	
	
	
	
	
	
	
	public static void readFile(ParkingLot lot, Scanner file) {
		String vin;
		String type;
		String brand;
		String name;
		String color;
		
		while(file.hasNext()) {
			vin = file.next();
			type  = file.next();
			brand = file.next();
			name = file.next();
			color = file.next();
			
			Car car = new Car(brand, type, name);
			car.setColor(color);
			car.setVIN(vin);
			
			lot.checkIn(car, LocalTime.now());
			
		}// End of the while loop
		
	}// End of the ReadFile method
	
}// End of the class