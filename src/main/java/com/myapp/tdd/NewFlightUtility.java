package com.myapp.tdd;

import java.util.ArrayList;
import java.util.List;

public class NewFlightUtility {

	public static List<NewFlight> buildFlightsList(List<List<String>> queriedData){
	
		//("1","e","Passenger1","false","500")
		//("2","b","Passenger2","true","600")
		
		List<NewFlight> flightsList = new ArrayList<>();
		queriedData.forEach(list ->{
			NewFlight flight = null;
			
			if(list.get(1).equals("e")) {
				flight = new EconomyFlight(list.get(0));
			
			}
			else if(list.get(1).equals("b")) {
				flight = new BusinessFlight(list.get(0));
				
			}
			
			flight.addPassenger(new Passenger(list.get(2),Boolean.valueOf(list.get(3))));
			flight.setDistance(Integer.valueOf(list.get(4)));
			flightsList.add(flight);
			
		});
		
		
		return flightsList;
		
	}
}
