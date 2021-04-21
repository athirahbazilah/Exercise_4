package Exercise_4;
import java.util.*;
public class Battery {
	
	private String brand, size;
	private double voltage, price;
	
	Scanner in = new Scanner(System.in);
	
	public Battery() {
		
		System.out.println("Enter Battery Brand: ");
		this.brand = in.nextLine();
		System.out.println("Enter Battery Size: ");
		this.size = in.nextLine();
		System.out.println("Enter Battery Voltage: ");
		this.voltage = in.nextDouble();
		System.out.println("Enter Battery Price: ");
		this.price = in.nextDouble();
		
	}
	
	public Battery(String B, String S, double V, double P) {
		
		brand = B;
		size = S;
		voltage = V;
		price = P;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getSize() {
		return size;
	}
	
	public double getVoltage() {
		return voltage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Brand: " + brand + "\n" + "Size: " + size + "\n" + "Voltage: " + voltage + "\n" + "Price: " + price;
	}

}
