public class Van extends Vehicle {

	// private variables to s="";tore the attributes of a van
	private String variant = "";

	public Van(int id, String manufacturer, String variant, boolean isCar, boolean isMotorcycle, boolean isVan) {
		super(id, manufacturer, false, false, true);
		this.variant = variant;

	} // end of constructor

	public String getVariantType() {
		return variant;
	}
}
