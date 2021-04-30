package com.myapp.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FlightPassengerTest {

@Test
public void testFlight() {
         Flight economyFlight = new Flight("1", "Economy");
         
         Flight businessFlight = new Flight("1", "Business");
         
         Passenger ram =new Passenger("Ram", true);
         
         Passenger sham =new Passenger("Sham", false);
         
         assertEquals(true, economyFlight.addPassenger(ram));
         
         assertEquals(false, economyFlight.removePassenger(ram));
         
         
         assertEquals(true, businessFlight.addPassenger(ram));
         
         assertEquals(false, businessFlight.removePassenger(ram));
         
         
         assertEquals(true, economyFlight.addPassenger(sham));
         
         assertEquals(false, economyFlight.removePassenger(sham));
         
         
         assertEquals(true, businessFlight.addPassenger(sham));
         
         assertEquals(false, businessFlight.removePassenger(sham));
    }


}

