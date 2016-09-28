class Car extends Vehicle{

private float speed;

public Car(){
	super();
	System.out.println("\nInside car default constructor.");
	speed = 100.0f;
}

public Car(String ma, String mo, int y, float s){
	super(ma, mo, y);
	System.out.println("\nInside car constructor with parameters.");
	speed = s;
}

public float getSpeed(){
	return speed;
}

public void setSpeed(float s){
	speed = s;
}

public void printr(){		
	System.out.println("\nMake: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear() + ", Speed: " + getSpeed());
	}

}