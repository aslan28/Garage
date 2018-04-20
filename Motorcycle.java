public class Motorcycle extends Vehicle {

	// private variables to store the attributes of a motorcycle
	private String fuelType = "";
	private int cc;
	//private int year;

	public Motorcycle(int id, String manufacturer, int cc, String fuelType, boolean isCar, boolean isMotorcycle, boolean isVan)
	{
		super(id, manufacturer, isCar, isMotorcycle, isVan);
		
		this.fuelType = fuelType;
		this.cc = cc;
	} // end of constructor


	public String getFuelType() {
		return fuelType;
	}

	public double getCc() {
		return cc;
	}

	
	/**
	 * This method returns a String to represent a car
	 * 
	 * @return
	 *
	*public String toString() {
	*	return (make + " " + model + " " + year);
	*}
	*/
}
