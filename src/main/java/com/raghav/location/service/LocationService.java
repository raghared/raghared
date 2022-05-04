package com.raghav.location.service;

import java.util.List;

import com.raghav.location.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location LocationById(int id);
	List<Location> getLocations();

}
