package WatchSetterGetter;

public class Watch {
	
	String brand;
	String type;
	String material;
	double price;
	double weight;
	char timer;
	
	
	
	//Create Setter Method
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Create Getter Method
	public String getBrand() {
		return this.brand;
	}

	public String getType() {
		return this.type;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	//Create a Method
	public void Timer(char timer) {
		if (timer == 'Y') {
			System.out.println("This Watch Can Set a Timer!");
			
		}else {
			System.out.println("This Watch Cannot Set a Timer!");
			
		}
	}
	
	public void knowTime() {
		System.out.println("Can Know What Time it is Now!");
	}
}
