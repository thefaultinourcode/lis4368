import java.util.Scanner;

class VehicleDemo{
	public static void main(String args[])
	{
		//instantiating Vehicle object using default constructor
		System.out.println("Inside vehicle default constructor:");
		Vehicle v = new Vehicle();
		System.out.println("Make = " + v.getMake() + 
		"\nModel = " + v.getModel() + 
		"\nYear = " + v.getYear());

		
		//accepting user input to instantiate new Vehicle object
		System.out.println("\nBelow are user-entered values:\n");
		Scanner vinfo = new Scanner(System.in);
		System.out.print("Enter Make:");
		String ma = vinfo.nextLine();
		System.out.print("Enter Model:");
		String mo = vinfo.nextLine();
		System.out.print("Enter Year:");
		int y = vinfo.nextInt();

		Vehicle n = new Vehicle(ma, mo, y);

		System.out.println("\nInside vehicle constructor with parameters:\n");

		System.out.println("Make = " + n.getMake() + 
		"\nModel = " + n.getModel() + 
		"\nYear = " + n.getYear());
			
	}
}