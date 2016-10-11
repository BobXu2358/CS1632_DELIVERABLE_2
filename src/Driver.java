public class Driver {
	private Location currLoc;
	private int coffeeNum;
	
	/* 
	 * constructor
	 * @param a location object represents current location
	 */	
	public Driver(Location loc) {
		currLoc = loc;
		coffeeNum = 0;
		if(currLoc.toString().equals("Coffee"))
			coffeeNum++;
	}
	
	/*
	 * move the driver from current location to destination location
	 * @param dest: destination
	 * @return updated current location
	 */
	public Location moveTo(Location dest) {
		if(dest.toString().equals("Coffee"))
			coffeeNum++;
		currLoc = dest;
		return currLoc;
	}
	
	/*
	 * check if driver is in town
	 * @return false if in CLE or PHI, otherwise true	
	 */
	public boolean inTown() {
		if(currLoc.toString().equals("CLE")) return false;
		if(currLoc.toString().equals("PHI")) return false;
		return true;
	}
	
	/*
	 * get number of coffee
	 * @return number of coffee
	 */
	public int getNumCoffee() {
		return coffeeNum;
	}
	
	/*
	 * get current location
	 */
	public Location getLocation() {
		return currLoc;
	}
}
