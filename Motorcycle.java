public class Motorcycle extends Vehicle {

	// private variables to store the attributes of a motorcycle
	private String fuelType = "";
	private int cc;

	public Motorcycle(int id, String manufacturer, int cc, String fuelType, boolean isCar, boolean isMotorcycle,
			boolean isVan) {
		super(id, manufacturer, false, true, false); // importing the characteristics of vehicle to car

		this.fuelType = fuelType; // variable fuelType for motorcycle
		this.cc = cc; // variable engine size (cc) for motorcycle
	} // end of constructor

	public String getFuelType() {
		return fuelType;
	}

	public double getCc() {
		return cc;
	}
}
