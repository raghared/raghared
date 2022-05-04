package com.raghav.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghav.location.entities.Location;
import com.raghav.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService ls;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap mm) {

		Location saveLocation = ls.saveLocation(location);
		String msg = "location saved with id :" + saveLocation.getId();
		mm.addAttribute("msg", msg);
		return "createLocation";

	}

	@RequestMapping("/displayLocations")
	public String displayLocation( ModelMap mm) {

		List<Location> locations = ls.getLocations();
		mm.addAttribute("locations", locations);
		return "displayLocations";

	}

}