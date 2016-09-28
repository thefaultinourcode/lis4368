import java.util.Scanner;

class VehicleDemo{
	public static void main(String args[])
	{
		//instantiating Vehicle object using default constructor
		
		Vehicle v = new Vehicle();
		System.out.println("Make = " + v.getMake() + 
		"\nModel = " + v.getModel() + 
		"\nYear = " + v.getYear());

		v.printr();
		
		//accepting user input to instantiate new Vehicle object
		System.out.println("\nBelow are user-entered values:\n");
		Scanner vinfo = new Scanner(System.in);
		System.out.print("Enter Make:");
		String ma = vinfo.next();
		System.out.print("Enter Model:");
		String mo = vinfo.next();
		System.out.print("Enter Year:");
		int y = vinfo.nextInt();

		Vehicle n = new Vehicle(ma, mo, y);

		System.out.println("Make = " + n.getMake() + 
		"\nModel = " + n.getModel() + 
		"\nYear = " + n.getYear());

		n.printr();
	
		Car c = new Car();
		System.out.println("Make = " + c.getMake() + 
		"\nModel = " + c.getModel() + 
		"\nYear = " + c.getYear() +
		"\nSpeed = " + c.getSpeed());

		c.printr();

		System.out.println("\nBelow are user-entered values:\n");
		Scanner cinfo = new Scanner(System.in);
		System.out.print("Enter Make:");
		String k = cinfo.next();
		System.out.print("Enter Model:");
		String d = cinfo.next();
		System.out.print("Enter Year:");
		int e = cinfo.nextInt();
		System.out.print("Enter Speed:");
		float f = cinfo.nextFloat();

		Car s = new Car(k,d,e,f);

		System.out.println("Make = " + s.getMake() + 
		"\nModel = " + s.getModel() + 
		"\nYear = " + s.getYear() +
		"\nSpeed = " + s.getSpeed());

		s.printr();

	}
}