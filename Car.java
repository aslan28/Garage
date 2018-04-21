public class Car extends Vehicle {

	// private variables to store the attributes of a car
	private int seats;
	private String gearType;

	public Car(int id, String manufacturer, boolean isCar, boolean isMotorcycle, boolean isVan, String gearType,
			int seats) {
		super(id, manufacturer, true, false, false);

		this.seats = seats;
		this.gearType = gearType;
	} // end of constructor

	public int getSeats() {
		return seats;
	}

	public String getGearType() {
		return gearType;
	}
}
