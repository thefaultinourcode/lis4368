class Room{
	private double length;
	private double width;

	public Room(){
		this.length=0.0;
		this.width=0.0;
	}

	public Room(double l, double w){
		this.length=l;
		this.width=w;
	}

	public void setLength(double l)
	{
		this.length = l;
	}

	public void setWidth(double w){
		this.width = w;
	}

	public double getLength(){
		return length;
	}

	public double getWidth(){
		return width;
	}

	public double getArea(){
		double area = length * width;
		return area;
	}
}