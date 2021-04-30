package com.myapp.tdd;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class AirConditioningTest {

@InjectMocks
AirConditioningSystem airconditioningSystem;

@Mock
Thermometer thermometer;


@BeforeEach
public void setUp() {
MockitoAnnotations.initMocks(this);
}

@Test
public void testAirConditionStopped() {
when(thermometer.getTemperature()).thenReturn(23.0);
airconditioningSystem.setTemperatureThreshhold(25.0);
airconditioningSystem.checkAirConditioningSystem();
assertFalse(airconditioningSystem.isOpen());
verify(thermometer,times(1)).getTemperature();
}



}