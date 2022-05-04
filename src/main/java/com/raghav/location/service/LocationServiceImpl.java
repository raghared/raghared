package com.raghav.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghav.location.entities.Location;
import com.raghav.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository dao;

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return dao.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		Location loc= new Location();
		loc.setName(location.getName());
		loc.setCode(location.getCode());
		loc.setType(location.getType());
		return dao.save(loc);
	}

	@Override
	public void deleteLocation(Location location) {
		dao.delete(location);

	}

	@Override
	public Location LocationById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Location> getLocations() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
