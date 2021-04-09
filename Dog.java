package DAY3;

public class Dog {
	private String name;
	private int age;
	private int weight;
	public void setName(String name){
		this.name = name;
	}

	public String getName(){	
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

// Business method
	public void doFeedAnimal(){
		this.weight+=10;
	}

	public void playGames(){
		if(weight < 2 || weight > 30) {
			System.out.println(this.name+" of age "+this.age+" cannot play games as it's weight is "+this.weight);
		} else {	
			this.weight-=1;
			System.out.println(this.name+" of age "+this.age+" can play games as it's weight is "+this.weight);
		}
	}
}
