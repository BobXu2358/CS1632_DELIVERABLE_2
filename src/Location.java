
public class Location {
	
	private String[] goesTo;
	private String name;
	//constructor
	public Location(String n) {
		name = n;
		goesTo = new String[2];
		if(!setGoesTo(name))
			System.exit(1);
	}
	
	private boolean setGoesTo(String n) {
		switch(n) {
			case "Hotel":
				goesTo[0] = "Library";
				goesTo[1] = "Dinner";
				return true;
			case "Dinner":
				goesTo[0] = "Coffee";
				goesTo[1] = "PHI";
				return true;
			case "Coffee":
				goesTo[0] = "Library";
				goesTo[1] = "Dinner";
				return true;
			case "Library":
				goesTo[0] = "Hotel";
				goesTo[1] = "CLE";
				return true;
			case "CLE":
				goesTo[0] = "none";
				goesTo[1] = "none";
				return true;
			case "PHI":
				goesTo[0] = "none";
				goesTo[1] = "none";
				return true;
			default:
				return false;
		}
	}
	
	//return name of the place
	public String toString(){
		return name;
	}
	
	/*
	 * @return a string array that contains 2 possible locations can be reached from current location
	 */
	public String[] getGoesTo() {
		return goesTo;
	}
}