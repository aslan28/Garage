import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.List;

class Garage {

	public static List<Vehicle> vehicleList = new ArrayList<>(); // creating a new array list to store vehicles

	private static void addVehicle(Vehicle v) { // method for adding vehicles to the array list
		vehicleList.add(v);
	}

	private static void removeVehicle(Vehicle v) { // method for removing vehicles from the array list
		vehicleList.remove(v);
	}

	private static void removeVehicle(int id) { // using the iterator to iterate through each vehicle
		Iterator<Vehicle> i = vehicleList.iterator(); // iterating through the vehicle array lists
		while (i.hasNext()) {
			Vehicle veh = (Vehicle) i.next();
			if (veh.getID() == id) {
				i.remove();
			}
		}
	}

	private static float generateBill(Vehicle v) {
		float total = 0.00f;

		if (v.isCar())
			total = calculate("Car") + 15.00f; // Generating the total bill for the vehicle if its a car
		else if (v.isVan())
			total = calculate("Van") + 15.00f; // Generating the total bill for the vehicle if its a car
		else
			total = calculate("Motorcycle") + 15.00f; // Generating the total bill for the vehicle if its a car

		removeVehicle(v); // removing the vehicle once the bill is calculated for that particular vehicle

		return total; // return value is the total bill generated
	}

	private static float calculate(String s) { // calculating the bill at random for car, van or motorcycle
		float value = 0.00f;
		if (s.equals("Car")) {
			Random random = new Random();
			value = ((350 - 60) * random.nextFloat() + 60);
		} else if (s.equals("Van")) {
			Random random = new Random();
			value = ((550 - 55) * random.nextFloat() + 55);
		} else {
			Random random = new Random();
			value = ((300 - 60) * random.nextFloat() + 60);
		}
		return value; // returns the total value of the bill
	}

	public static void main(String[] args) {
		// main method, consisting of new vehicles
		Car c1 = new Car(1, "BMW 1Series", true, false, false, "Manual", 5);
		Van v1 = new Van(2, "Fiat", "Doblo", false, false, true);
		Motorcycle m1 = new Motorcycle(3, "Yamaha", 600, "Petrol", false, true, false);

		// adding those vehicles to the array list using the addVehicle method
		addVehicle(c1);
		addVehicle(v1);
		addVehicle(m1);

		// output of the array list for the total vehicles in the garage
		System.out.println("Current vehicles in the garage:\n" + vehicleList + "\n\nBill Calculation (VAT inclusive):");

		// generating the bill for the new vehicles and outputting the total bill to 2 decimal places
		System.out.println("Total Bill for BMW-1Series: " + String.format("%,.2f", generateBill(c1)));
		System.out.println("Total Bill for Mercedez-Benz: " + String.format("%,.2f", generateBill(v1)));
		System.out.println("Total Bill for Kawasaki: " + String.format("%,.2f", generateBill(m1)) + "\n\n");

		// shows new output once the vehicles are billed and removed from the array list
		System.out.println("Total vehicles now present in the garage: " + vehicleList);
	}// end of main method
}
