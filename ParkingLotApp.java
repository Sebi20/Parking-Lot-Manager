/*This program is used to implement the the ParkingLot class.
It's written to emulate a parking lot check in and checkout system*/

package vehicle;
import java.util.*;
import java.io.*;
import java.awt.Color;

public class ParkingLotApp{
	
	public static void main(String [] args) throws Exception{
		Car car;  
		
		Scanner input = new Scanner(System.in);
		Scanner file = new Scanner(new File("/Users/sebiseb/eclipse-workspace/Random-p rojects/src/vehicle/ParkingLot.txt"));
		
		int MAX;// Represents the MAX amount of cars allowed in the lot
		double price;// Price of staying in the lot per hour
		
		
		System.out.println("What is the maximum number of cars that can hold in the lot?");
		MAX = input.nextInt();
		
		System.out.println("What is your charge per hour?");
		price = input.nextDouble();
		
		ParkingLot lot = new ParkingLot(MAX, price);
		
		
		
		
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
		
			
		}// End of the while loop
		
	}// End of the ReadFile method
	
}// End of the class