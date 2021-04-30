package com.myapp.tdd;

import java.util.*;

public class FlightRecords {
	
	private List<List<String>> queriedData = new ArrayList<>();
	
	public List<List<String>> queryFlightsData(){
		return queriedData;
	}

	public final double avgDistance(List<NewFlight>flightsList ) {
		
		return flightsList.stream().mapToDouble(f -> f.getDistance()).average().getAsDouble();
				
	//	return flightsList.stream().mapToDouble(NewFlight::getDistance).average().getAsDouble();
		
	}
	
	public final double maxDistance(List<NewFlight> flightsList) {
		
		return flightsList.stream().mapToDouble(f ->f.getDistance()).max().getAsDouble();
				
		//return flightsList.stream().mapToDouble(NewFlight::getDistance).max().getAsDouble();
	}
	
	public final double minDistance(List<NewFlight> flightsList) {
		
		return flightsList.stream().mapToDouble(f -> f.getDistance()).min().getAsDouble();
		
		//return flightsList.stream().mapToDouble(NewFlight::getDistance).min().getAsDouble();
	}
}
