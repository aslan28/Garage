import java.util.ArrayList;

class Garage {

	public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

	/*
	public void initialize() {
		// create and add 3 ashes on 3 different ways
		Car car1 = new Car();
		Van van1 = new Van();
		this.Vehicle.add(car1); // "this" references the current object, but
		Vehicle.add(van1); // as there is no local trees variable
		Vehicle.add(new car1()); // defined the compiler picks the right one
		vehicle.add(new Vehicle());
	}
	*/

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Focus", 2005);
		Car car2 = new Car("BMW", "116i", 2006);

		System.out.println(car1);
		System.out.println(car2);
	}// end of main method

	
	private void addVehicle(Vehicle v)
	{
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
			   
	private void removeVehicle(int id)
	{
		Iterator i = vehicleList.iterator();
		while(i.hasNext())
		{
			Vehicle veh = iterator.next();
			if(veh.getID()== id)
			   {
				   iterator.remove();
			   }
		}
	}
	
	private void emptyList()
	{
		vehicleList.clear();
	}
			   
	private float generateBill(Vehicle v)
	{
		float total = 0.00f;
		
		if(v.isCar)
			total = calculate("Car")+15.00f;
		else if(v.isVan)
			total = calculate("Van")+15.00f;
		else
			total = calculate("Motorcycle")+15.00f;
		
		return total;
	}
			   
	private float calculate(String s)
	{
		float value = 0.00f; 
		if(s.equals("Car"))
		 {
			 Random random = new Random();
			 value = ((350 - 60) * random.nextFloat() + 60);
		}
		else if(s.equals("Van"))
		 {
			 Random random = new Random();
			 value = ((550 - 55) * random.nextFloat() + 55);
		}
		else
		 {
			 Random random = new Random();
			 value = ((300 - 60) * random.nextFloat() + 60);
		}
		return value;
	}
				   
				   
		
	
	/**
	 * public static void main(String[] args) { Forest forest = new Forest();
	 * forest.initialize(); for (Tree tree : forest.trees) { // FOR EACH loop
	 * System.out.println(tree.getClass()+" Age: "+tree.age); } }
	 */
}
