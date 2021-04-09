package DAY3;

public class Car {
	private String model;
	private float speed;
	private double price;
	private int year;
	private String color;
	
	Car(){

	}
	Car(String model, float speed, double price, int year){
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed=speed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + ", price=" + price + ", year=" + year + ", color=" + color + "]";
	}
	
}
