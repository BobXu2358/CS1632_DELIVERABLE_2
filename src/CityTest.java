import static org.junit.Assert.*;
import java.util.Random;
import org.mockito.*;
import org.junit.Test;

public class CityTest {

	//test constructor, a doubled random generator is created using Mock for test purpose
	@Test
	public void testConstructor() {
		Random rand = Mockito.mock(Random.class);
		assertNotNull(new City(rand));
	}
	
	//test if initDriver() will generate a Driver object 
	@Test
	public void testInitDriver() {
		Random rand = Mockito.mock(Random.class);
		Mockito.when(rand.nextInt(4)).thenReturn(0);
		City c = new City(rand);
		Driver d = c.initDriver();
		assertNotNull(d);
	}
		
	//test if initDriver() will generate a Driver object with random location
	//the Random number will always generate 0
	@Test
	public void testInitDriverLocation() {
		Random rand = Mockito.mock(Random.class);
		Mockito.when(rand.nextInt(4)).thenReturn(0);
		City c = new City(rand);
		Driver d = c.initDriver();
		assertEquals("Hotel",d.getLocation().toString());
	}
	
	//test if the driver moved when moveDriver() is called
	//random number will always generate 0, which means driver will always spawn in Hotel
	//random boolean will always generate true, which means driver will always move to Library
	//therefore the result should always be an array of Location contains String "Hotel", "Library" and "Bill St."
	@Test
	public void testMoveDriver() {
		Random rand = Mockito.mock(Random.class);
		Mockito.when(rand.nextBoolean()).thenReturn(true);
		Mockito.when(rand.nextInt(4)).thenReturn(0);
		City c = new City(rand);
		c.initDriver();
		String[] expected = {"Hotel", "Library", "Bill St."};
		assertArrayEquals(expected, c.moveDriver());
	}
}
