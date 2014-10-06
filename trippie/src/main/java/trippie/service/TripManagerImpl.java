package trippie.service;

import java.util.List;

import trippie.domain.Trip;

public class TripManagerImpl implements TripManager{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Trip> trips;
	
	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips=trips;
	}
	
	@Override
	public void createTrip() {
		throw new UnsupportedOperationException();
	}
	
	
}
