package com.myapp.tdd;

public class AirConditioningSystem {

	private Thermometer thermometer;
	
	private double temperatureThreshhold;
	
	private boolean open;
	
	public void checkAirConditioningSystem() {
		
		this.open = (thermometer.getTemperature() >= temperatureThreshhold);
	}

	public Thermometer getThermometer() {
		return thermometer;
	}

	public void setThermometer(Thermometer thermometer) {
		this.thermometer = thermometer;
	}

	public double getTemperatureThreshhold() {
		return temperatureThreshhold;
	}

	public void setTemperatureThreshhold(double temperatureThreshhold) {
		this.temperatureThreshhold = temperatureThreshhold;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
}
