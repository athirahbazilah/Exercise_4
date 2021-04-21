package Exercise_4;

public class Panasonic extends Battery
{
	
	private int quantity;
	
	public Panasonic(String B, String S, double V, double P, int Q) {
		super (B, S, V, P);
		quantity = Q;
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return super.getPrice() * quantity;
	}
	
	public double getVoltage() {
		return getVoltage() * quantity;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Quantity: " + quantity;
	}

}
