//package com.myapp.tdd;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Spy;
//
//
//
//public class FlightsRecordsTest {
//	
//	@Spy
//	private FlightRecords records;
//	
//	private List<List<String>> queriedData;
//	
//	private List<NewFlight> flightsList;
//	
//	@BeforeEach
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//		queriedData = new ArrayList<>();
//		
//		List<String> row1 = Arrays.asList("1","e","Passenger1","false","500");
//		List<String> row2 = Arrays.asList("2","b","Passenger2","true","800");
//		List<String> row3 = Arrays.asList("3","e","Passenger3","false","700");
//		List<String> row4 = Arrays.asList("4","b","Passenger4","true","900");
//		
//		queriedData.add(row1);
//		queriedData.add(row2);
//		queriedData.add(row3);
//		queriedData.add(row4);
//		
//		
//	}
//	
//	@Test
//	public void testQueriedData() {
//		when(records.queryFlightsData()).thenReturn(queriedData);
//		
//		flightsList = NewFlightUtility.buildFlightsList(queriedData);
//		
//		assertEquals(725,records.avgDistance(flightsList));
//		assertEquals(900,records.maxDistance(flightsList));
//		assertEquals(500,records.minDistance(flightsList));
//		
//		
//		
//	}
//	
//}


package com.myapp.tdd;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;


public class FlightsRecordsTest {

@Spy
private FlightRecords records;

private List<List<String>> queriedData;

private List<NewFlight> flightsList;

@BeforeEach
public void setup() {
MockitoAnnotations.initMocks(this);
queriedData = new ArrayList<>();
List<String> row1= Arrays.asList("1","e","Passenger1","false","600");
List<String> row2= Arrays.asList("2","b","Passenger2","true","800");
List<String> row3= Arrays.asList("3","e","Passenger3","false","400");
List<String> row4= Arrays.asList("5","b","Passenger4","true","300");

queriedData.add(row1);
queriedData.add(row2);
queriedData.add(row3);
queriedData.add(row4);
}

@Test
public void testQueriedData() {
when(records.queryFlightsData()).thenReturn(queriedData);

flightsList = NewFlightUtility.buildFlightsList(queriedData);

assertEquals(525, records.avgDistance(flightsList));
assertEquals(300, records.minDistance(flightsList));
assertEquals(800, records.maxDistance(flightsList));

}


}

