import java.util.Scanner;
import java.text.DecimalFormat;

class RoomDemo{
	public static void main(String args[])
	{
		//Testing methods of the Room class
		/*
		Room r = new Room();
		System.out.println(r.getLength() + " " + r.getWidth());
		Room q = new Room(12.2, 12.4);
		System.out.println(q.getLength() + " " + q.getWidth() + " " + q.getArea());
		*/

		System.out.println("Program calculates room area.\n"
			+ "Please enter room length and width.\n"
			+ "Calculations are rounded to 2 decimal places.\n"
			+ "Note: Program does *not* check for non-numeric characters.\n");

		//formating 
		DecimalFormat f = new DecimalFormat("##.00");

		//instantiating using default constructor
		System.out.println("Instantiated room object from no-arg constructor:");
		Room r = new Room();
		System.out.println("Room's Length: " + f.format(r.getLength()) + 
		"\nRoom's Width: " + f.format(r.getWidth()) + 
		"\nRoom's Area: " + f.format(r.getArea()));

		//accepting user input to instantiate new Room object
		System.out.println("Instantiated room object from constructor accepting two args:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Room Length :");
		double l = sc.nextDouble();
		System.out.print("Enter Room Width :");
		double w = sc.nextDouble();
		Room s = new Room(l, w);
		System.out.println("Room's Length: " + f.format(s.getLength()) + 
			"\nRoom's Width: " + f.format(s.getWidth()) + 
			"\nRoom's Area: " + f.format(s.getArea()));
	}
}