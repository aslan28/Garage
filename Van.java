public class Van extends Vehicle {

	// private variables to s="";tore the attributes of a van
	private String variant = "";

	public Van(int id, String manufacturer, String variant, boolean isCar, boolean isMotorcycle, boolean isVan)
	{
		super(id, manufacturer, isCar, isMotorcycle,isVan);
		this.variant = variant;
		
	} // end of constructor

	public String getVariantType()
	{
		return variant;
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
