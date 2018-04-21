public class Van extends Vehicle {

	// private variables to store the attributes of a motorcycle
	private String variant = "";

	public Van(int id, String manufacturer, String variant, boolean isCar, boolean isMotorcycle, boolean isVan) {
		super(id, manufacturer, false, false, true);
		this.variant = variant;

	} // end of constructor

	public String getVariantType() {
		return variant;
	}
}
