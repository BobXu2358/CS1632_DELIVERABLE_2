public class Location {
	
	private String[] goesTo;
	private String name;
	//constructor
	public Location(String n) {
		name = n;
		goesTo = new String[2];
		if(!setGoesTo(name))
			return;
	}
	
	private boolean setGoesTo(String n) {
		switch(n) {
			case "Hotel":
				goesTo[0] = "Library";
				goesTo[1] = "Diner";
				return true;
			case "Diner":
				goesTo[0] = "Coffee";
				goesTo[1] = "PHI";
				return true;
			case "Coffee":
				goesTo[0] = "Library";
				goesTo[1] = "Diner";
				return true;
			case "Library":
				goesTo[0] = "Hotel";
				goesTo[1] = "CLE";
				return true;
			case "CLE":
				goesTo[0] = "outside";
				goesTo[1] = "outside";
				return true;
			case "PHI":
				goesTo[0] = "outside";
				goesTo[1] = "outside";
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
	
	/*
	 * get street name from this location to destination
	 * @param dest: destination
	 * @return street name
	 */
	public String getStreetName(Location dest) {
		String d = dest.toString();
		switch(name) {
			case "Hotel":
				if(d.equals("Diner")) return "Fourth Ave.";
				else return "Bill St.";
			case "Diner":
				if(d.equals("PHI")) return "Fourth Ave.";
				else return "Phil St.";
			case "Coffee":
				if(d.equals("Library")) return "Fifth Ave.";
				else return "Phil St.";
			case "Library":
				if(d.equals("CLE")) return "Fifth Ave.";
				else return "Bill St.";
			default:
				return "Error";
		}
	}
}