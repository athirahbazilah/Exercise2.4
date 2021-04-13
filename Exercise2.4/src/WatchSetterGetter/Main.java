package WatchSetterGetter;

public class Main {

	public static void main(String[] args) {
		
		Watch Pierre = new Watch();
		
		Pierre.setBrand("Pierre Cardin");
		Pierre.setType("Wrist Watch");
		Pierre.setMaterial("Leather");
		Pierre.setPrice(275.53);
		Pierre.setWeight(50);
		
		
		System.out.println("Brand: " + Pierre.getBrand());
		System.out.println("Type: " + Pierre.getType());
		System.out.println("Material: " + Pierre.getMaterial());
		System.out.println("Price: RM " + Pierre.getPrice());
		System.out.println("Weight: " + Pierre.getWeight() + " g");
		System.out.println();
		
		Pierre.Timer('N');
		Pierre.knowTime();
		

	}

}
