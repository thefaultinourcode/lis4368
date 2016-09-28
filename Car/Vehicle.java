class Vehicle{
	private String make;
	private String model;
	private int year;

	public Vehicle(){
		System.out.println("\nInside vehicle default constructor.");
		this.make="My Make";
		this.model="My Model";
		this.year=1970;
	}

	public Vehicle(String ma, String mo, int y){
		System.out.println("\nInside vehicle constructor with parameters:\n");
		this.make=ma;
		this.model=mo;
		this.year=y;
	}

	public void setMake(String m)
	{
		this.make = m;
	}

	public void setModel(String m){
		this.model = m;
	}

	public void setYear(int y){
		this.year = y;
	}

	public String getMake(){
		return make;
	}

	public String getModel(){
		return model;
	}

	public int getYear(){
		return year;
	}

	public void printr(){
		System.out.println("\nMake: " + make + ", Model: " + model + ", Year: " + year);
	}

}