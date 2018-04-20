import java.util.ArrayList;
import java.util.Iterator;

class Garage {

	public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

	private static void addVehicle(Vehicle v)
	{
		vehicleList.add(v);	
	}
	
	
	private void removeVehicle(Vehicle v)
	{
		Iterator i = vehicleList.iterator();
		while(i.hasNext())
		{
			Vehicle veh = (Vehicle) i.next();
			if(veh.equals(v)) ;
			   {
				   i.remove();
			   }
		}
	}
			   
	private void removeVehicle(int id)
	{
		Iterator i = vehicleList.iterator();
		while(i.hasNext())
		{
			Vehicle veh = (Vehicle) i.next();
			if(veh.getID()== id)
			   {
				   i.remove();
			   }
		}
	}
	
	private void emptyList()
	{
		vehicleList.clear();
	}

	/*private float generateBill(Vehicle v) {
		float total = 0.00f;

		if (v.isCar)
			total = calculate("Car") + 15.00f;
		else if (v.isVan)
			total = calculate("Van") + 15.00f;
		else
			total = calculate("Motorcycle") + 15.00f;

		return total;
	}

	private float calculate(String s) {
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
		return value;
	}*/

	public static void main(String[] args) {
		Car c1 = new Car(1, "Ford", false, false, true, "Manual", 5);
		Car c2 = new Car(2, "BMW", true, false, false, "Manual", 5);
		Van v1 = new Van(3, "Fiat", "Doblo", false, false, true);
		Van v2 = new Van(4, "Ford", "Transit", false, false, true);
		Motorcycle m1 = new Motorcycle(5, "BMW", 600, "Petrol", false, true, false);
		Motorcycle m2 = new Motorcycle(6, "Kawasaki", 600, "Petrol", false, true, false);
		
		addVehicle(c1);
		addVehicle(c2);
		addVehicle(v1);
		addVehicle(v2);
		addVehicle(m1);
		addVehicle(m2);
		
		System.out.println(vehicleList);
	}// end of main method
}
