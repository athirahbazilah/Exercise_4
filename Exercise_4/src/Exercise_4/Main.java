package Exercise_4;

public class Main {

	public static void main(String[] args) {
		
		//Battery objEner = new Battery();
		//System.out.println(objEner);
		//System.out.println();
		
		Battery objPana = new Battery ("Panasonic", "AA", 1.5, 34.50, 3);
		System.out.println(objPana);
		System.out.println("Total Price Base On Quantity: RM " + objPana.getPrice());
		System.out.println("Total Voltage Base On Quantity: " + objPana.getVoltage());
		

	}

}
