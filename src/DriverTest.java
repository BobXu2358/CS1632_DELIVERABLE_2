import static org.junit.Assert.*;
import org.mockito.*;
import org.junit.Test;

public class DriverTest {

	//test if constructor works/creates Driver object correctly
	@Test
	public void testDriverConstructor() {
		Location loc = Mockito.mock(Location.class);
		Driver d = new Driver(loc);
		assertNotNull(d);
	}
	
	//test if driver changed current location using moveTo()
	//moveTo() should return updated Location object
	@Test
	public void testMoveTo() {
		Location dest = Mockito.mock(Location.class);
		Driver d = new Driver(Mockito.mock(Location.class));
		assertEquals(dest, d.moveTo(dest));
	}
	
	//test if inTown() return value is true when driver is in the city
	@Test
	public void testInTown() {
		Location loc = Mockito.mock(Location.class);
		Mockito.when(loc.toString()).thenReturn("Hotel");
		Driver d = new Driver(loc);
		assertTrue(d.inTown());
	}
	
	//test if inTown() return value is false when driver is not in the city
	@Test
	public void testOutTown() {
		Location loc = Mockito.mock(Location.class);
		Mockito.when(loc.toString()).thenReturn("CLE");
		Driver d = new Driver(loc);
		assertFalse(d.inTown());
	}
	
	//test if getLocation() returns current location
	@Test
	public void testCurrentLocation() {
		Location loc = Mockito.mock(Location.class);
		Driver d = new Driver(loc);
		assertEquals(loc, d.getLocation());
	}
}
