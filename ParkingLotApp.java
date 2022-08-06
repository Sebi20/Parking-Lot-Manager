/*This program is used to implement the the ParkingLot class.
It's written to emulate a parking lot check in and checkout system*/

package vehicle;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.*;
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
		
		//Initialization of the Contents
		JFrame frame = new JFrame();
		JFrame test = new JFrame();
		test.setSize(390, 300);
		test.setBackground(Color.black);
		JPanel mainPanel = new JPanel();
		
		//These contents go in the mainPanel
		JLabel headerLabel = new JLabel();
		JPanel inputsContainerPanel = new JPanel();
		
		//These contents go into inputsContainerPanel
		JPanel vinPanel = new JPanel();
		JPanel typePanel = new JPanel();
		JPanel brandPanel = new JPanel();
		JPanel namePanel = new JPanel();
		JPanel colorPanel = new JPanel();
		JButton submit = new JButton("submit");
		
		//These contents go into vinPanel
		JLabel vinLabel = new JLabel();
		JTextField vin = new JTextField();
		
		//Code for the vinLabel
		vinLabel.setText("VIN Number:");
		
		//Code for the vin
		vin.setPreferredSize(new Dimension(100, 30));
		
		//Code for the vinPanel
		//vinPanel.setBackground(Color.PINK);
		vinPanel.add(vinLabel);
		vinPanel.add(vin);
		
		//These contents go into typePanel
		JLabel typeLabel = new JLabel();
		JTextField type = new JTextField();
		
		//Code for the typeLabel
		typeLabel.setText("Type:");
		
		//Code for the type
		type.setPreferredSize(new Dimension(100, 30));
		
		//Code for the vinPanel
		//typePanel.setBackground(Color.PINK);
		typePanel.add(typeLabel);
		typePanel.add(type);
		
		
		//These contents go into brandPanel
		JLabel brandLabel = new JLabel();
		JTextField brand = new JTextField();
		
		//Code for the brandLabel
		brandLabel.setText("Brand:");
		
		//Code for the brand
		brand.setPreferredSize(new Dimension(100, 30));
		
		//Code for the brandPanel
		//brandPanel.setBackground(Color.PINK);
		brandPanel.add(brandLabel);
		brandPanel.add(brand);
		
		
		//These contents go into namePanel
		JLabel nameLabel = new JLabel();
		JTextField name = new JTextField();
		
		//Code for the nameLabel
		nameLabel.setText("Name:");
		
		//Code for the name
		name.setPreferredSize(new Dimension(100, 30));
		
		//Code for the namePanel
		//namePanel.setBackground(Color.PINK);
		namePanel.add(nameLabel);
		namePanel.add(name);
		
		
		//These contents go into colorPanel
		JLabel colorLabel = new JLabel();
		JTextField color = new JTextField();
		
		//Code for the colorLabel
		colorLabel.setText("Color:");
		
		//Code for the color
		color.setPreferredSize(new Dimension(100, 30));
		
		//Code for the colorPanel
		//colorPanel.setBackground(Color.PINK);
		colorPanel.add(colorLabel);
		colorPanel.add(color);
		
		
		//Code for the submit button
		submit.setBackground(new Color(255, 89, 32));
		submit.setOpaque(true);
		submit.setBorderPainted(false);
		
		
		//Code for the headerLabel
		headerLabel.setText("Parking lot Manager");
		headerLabel.setPreferredSize(new Dimension(390, 50));
		headerLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		//Code for the inputsContainerPanel
		inputsContainerPanel.setLayout(new BoxLayout(inputsContainerPanel, BoxLayout.Y_AXIS));
		//inputsContainerPanel.setBackground(Color.BLUE);
		inputsContainerPanel.add(vinPanel);
		inputsContainerPanel.add(typePanel);
		inputsContainerPanel.add(brandPanel);
		inputsContainerPanel.add(namePanel);
		inputsContainerPanel.add(colorPanel);
		inputsContainerPanel.add(submit);
		
		//Code for the mainPanel
		//mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		//mainPanel.add(headerLabel);
		mainPanel.add(inputsContainerPanel);
		
		//Action listener when a user submits
		submit.addActionListener(e -> {
			
			test.setVisible(true);
			System.out.println("Vin: " + vin.getText());
			System.out.println("type: " + type.getText());
			System.out.println("brand: " + brand.getText());
			System.out.println("name: " + name.getText());
			System.out.println("color: " + color.getText());
		});
		
		//Code for the frame
		frame.setTitle("Parking Lot Manager");
		frame.setSize(490, 400);
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		
	}// End of the main method
	
}// End of the class