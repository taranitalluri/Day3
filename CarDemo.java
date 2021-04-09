package DAY3;

public class CarDemo {
	public static void main(String[] args) {
		Car c=new Car();
		c.setModel("Maruthi");
		c.setSpeed(10);
		c.setYear(2021);
		c.setPrice(20.8);
		c.setColor("Silver");
		System.out.println(c);
		
		Car c1=new Car();
		c1.setModel("Audi");
		c1.setSpeed(70);
		c1.setYear(2009);
		c1.setPrice(90.4);
		c1.setColor("Black");
		System.out.println(c1);
	}

}
