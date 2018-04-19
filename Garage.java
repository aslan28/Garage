import java.util.ArrayList;

class Garage {

	public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

	private void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}

	private void removeVehicle(Vehicle v)
	{
		Iterator i = vehicleList.iterator();
		while(i.hasNext())
		{
			Vehicle veh = iterator.next();
			if(veh.equals(v)
			   {
				   iterator.remove();
			   }
		}
	}

	private void removeVehicle(int id) {
		Iterator i = vehicleList.iterator();
		while (i.hasNext()) {
			Vehicle veh = iterator.next();
			if (veh.getID() == id) {
				iterator.remove();
			}
		}
	}

	private void emptyList() {
		vehicleList.clear();
	}

	private float generateBill(Vehicle v) {
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
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("BMW", "116i", 2006);
		Van v1 = new Van("", "", 2006);
		Van v2 = new Van("", "", 2006);
		Motorcycle m1 = new Motorcycle("", "", 2006);
		Motorcycle m2 = new Motorcycle("", "", 2006);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(m1);
		System.out.println(m2);
	}// end of main method
}
