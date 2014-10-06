package trippie.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import trippie.domain.Trip;

public class TripManagerImplTest extends TestCase{

	private TripManagerImpl tripManager;
	private List<Trip> trips;
	private static int TRIP_COUNT = 1;
	
	private static String TRIP_NAME = "Patagonia";
	private static String TRIP_DESCRIPTION = "South America trip";
	
	protected void setUp() throws Exception {
		tripManager = new TripManagerImpl();
		trips = new ArrayList<Trip>();
		
		//Stub up a trip
		Trip trip = new Trip();
		trip.setName(TRIP_NAME);
		trip.setDescription(TRIP_DESCRIPTION);
		trips.add(trip);
		
		tripManager.setTrips(trips);
	}
	
	
	public void testGetTripswithNoTrips() {
		tripManager = new TripManagerImpl();
		assertNull(tripManager.getTrips());
	}
	
	
	public void testGetTrips() {
		
		List<Trip> trips = tripManager.getTrips();
		assertNotNull(trips);
		assertEquals(TRIP_COUNT, tripManager.getTrips().size());
		
		Trip trip = trips.get(0);
		assertEquals(TRIP_NAME, trip.getName());
		assertEquals(TRIP_DESCRIPTION, trip.getDescription());
		
	}
}
