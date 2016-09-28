class Animal{
	//private by default access modifier
	private int numOfLegs;
	private double height;
	private double weight;

	public Animal()
	{
		numOfLegs = 0;
		height = 0.0;
		weight = 0.0;
	}

	public Animal(int nol, double h, double w)
	{
		this.numOfLegs = nol;
		this.height = h;
		this.weight = w;
	}

	public int getNumOfLegs(){
		return height;
	}

	public void setNumOfLegs(double h){
		this.height = h;
	}
}