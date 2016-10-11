import static org.junit.Assert.*;
import org.junit.Test;

public class LocationTest {


	//test if constructor works
	@Test
	public void testLocationConstructor() {
		Location loc = new Location("Hotel");
		assertNotNull(loc);
	}

	//test if to string returns name of the location
	@Test
	public void testToString() {
		Location loc = new Location("Diner");
		assertEquals("Diner", loc.toString());
	}
	
	//test if getGoesTo() returns correct locations of the current place
	//the method should return a String array that contains 2 elements
	@Test
	public void testGetGoesTo() {
		Location loc = new Location("Coffee");
		String[] expect = {"Library", "Diner"};
		assertArrayEquals(expect, loc.getGoesTo());
	}
	
	//test if getGoesTo() returns string array contains "outside" if the location name is CLE
	@Test
	public void testGoesToOutside() {
		Location loc1 = new Location("CLE");
		String[] expect = {"outside", "outside"};
		assertArrayEquals(expect, loc1.getGoesTo());
	}
	
	//test if getStreetName returns correct street name
	//the path from Library to Hotel should return "Bill St."
	//Mock location class and stub toString() method for test purpose
	@Test
	public void testGetStreetName() {
		Location Hotel = new Location("Hotel");
		Location Library = new Location("Library");
		assertEquals("Bill St.", Library.getStreetName(Hotel));
	}
}
