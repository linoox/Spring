package trippie.domain;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class TripTest extends TestCase{
	
	private Trip trip;
	
	protected void setUp() throws Exception {
		trip = new Trip();
	}
	
	public void testSetandGetDescription() {
		String testDescription = "a description";
		assertNull(trip.getDescription());
		trip.setDescription(testDescription);
		assertEquals(testDescription,trip.getDescription());
	}
}
