import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {


	//test if constructor works
	@Test
	public void LocationConstructorTest() {
		Location loc = new Location("Hotel");
		assertEquals(loc, loc);
	}
	

	//test if to string returns name of the location
	@Test
	public void toStringTest() {
		Location loc = new Location("Dinner");
		assertEquals("Dinner", loc.toString());
	}
	
	//test if getGoesTo() returns correct locations of the current place
	//the method should return a String array that contains 2 elements
	@Test
	public void getGoesToTest() {
		Location loc = new Location("Coffee");
		String[] expect = {"Library", "Dinner"};
		assertArrayEquals(expect, loc.getGoesTo());
	}
}
