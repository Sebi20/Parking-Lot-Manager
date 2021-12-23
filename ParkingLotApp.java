/*This program is used to implement the the ParkingLot class.
It's written to emulate a parking lot check in and checkout system*/

package vehicle;
import java.util.*;
import java.io.*;
public class ParkingLotApp{
	
	public static void main(String [] args) throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		int MAX;// Represents the MAX amount of cars allowed in the lot
		double price;// Price of staying in the lot per hour
		
		
		System.out.println("What is the maximum number of cars that can hold in the lot?");
		MAX = input.nextInt();
		
		System.out.println("What is your charge per hour?");
		price = input.nextDouble();
		
		ParkingLot lot = new ParkingLot(MAX, price);
		
		input.close();
	}// End of the main function
	
	public static void readFile() {
		
	}
	
}// End of the class