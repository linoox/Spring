package trippie.service;

import java.io.Serializable;
import java.util.List;

import trippie.domain.Trip;

public interface TripManager extends Serializable{
	
	public List<Trip> getTrips();
	public void createTrip();
}
