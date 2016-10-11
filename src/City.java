import java.util.Random;

public class City {
		Location Hotel;
		Location Diner;
		Location Library;
		Location Coffee;
		Location CLE;
		Location PHI;
		Random rand;
		Driver d;
		
	public City(Random r) {
		rand = r;
		Hotel = new Location("Hotel");
		Diner = new Location("Diner");
		Library = new Location("Library");
		Coffee = new Location("Coffee");
		CLE = new Location("CLE");
		PHI = new Location("PHI");
	}
	
	//initialize a driver object with random starting location
	public Driver initDriver() {
		int r = rand.nextInt(4);
		switch(r) {
			case 0:
				d = new Driver(Hotel);
				break;
			case 1:
				d = new Driver(Diner);
				break;
			case 2:
				d = new Driver(Library);
				break;
			case 3:
				d = new Driver(Coffee);
				break;
		}
		
		return d;
	}
	
	//move the driver randomly
	//returns string array that contains, in order: origin, destination, street 
	public String[] moveDriver() {
		String[] movement = new String[3];
		Location origin = d.getLocation();
		Location dest;
		movement[0] = origin.toString();
		Boolean rb = rand.nextBoolean();
		String[] destArr = d.getLocation().getGoesTo();
		if(rb)
			dest = findLocationByString(destArr[0]);
		else 
			dest = findLocationByString(destArr[1]);
		
		d.moveTo(dest);
		if(dest.toString().equals("CLE") || dest.toString().equals("PHI"))
			movement[1] = "Outside City";
		else
			movement[1] = dest.toString();
		movement[2] = origin.getStreetName(dest);
		
		return movement;
	}
	//helper method that works with moveDriver() to find location object by input string
	private Location findLocationByString(String str) {
		switch(str) {
			case "Hotel":
				return Hotel;
			case "Library":
				return Library;
			case "Diner":
				return Diner;
			case "Coffee":
				return Coffee;
			case "CLE":
				return CLE;
			case "PHI":
				return PHI;
		}
		return null;
	}
}
