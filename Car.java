public class Car extends Vehicle {

	// private variables to store the attributes of a car
	private int seats;
	private String gearType;

	public Car(int id, String manufacturer, boolean isCar, boolean isMotorcycle, boolean isVan, String gearType,
			int seats) {
		super(id, manufacturer, true, false, false); // importing the characteristics of vehicle to car

		this.seats = seats; // variable seat for car
		this.gearType = gearType; // variable gearType for car
	} // end of constructor

	public int getSeats() {
		return seats;
	}

	public String getGearType() {
		return gearType;
	}
}
