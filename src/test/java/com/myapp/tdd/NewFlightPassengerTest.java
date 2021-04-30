package com.myapp.tdd;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class NewFlightPassengerTest {

@Nested
@DisplayName("Given There is a Economy Flight")
class EconomyFlightTest{
private EconomyFlight economyFlight;

@BeforeEach
void setup() {
economyFlight = new EconomyFlight("1");
}
@AfterEach
void teardown() {
economyFlight = null;
}

@Test
public void testEconomyFlightRegularPassenger() {

Passenger sham = new Passenger("Sham", false);


assertEquals(true, economyFlight.addPassenger(sham));

assertEquals(1, economyFlight.getList().size());
}

}

@Nested
@DisplayName("Given There is a Business Flight")
class BusinessFlightTest{
private BusinessFlight businessFlight;

@BeforeEach
void setup() {
businessFlight = new BusinessFlight("2");
}
@AfterEach
void teardown() {
businessFlight = null;
}

@Test
public void testEconomyFlightRegularPassenger() {

Passenger ram = new Passenger("Ram", true);


assertEquals(true, businessFlight.addPassenger(ram));

assertEquals(1, businessFlight.getList().size());
}

}



}