package com.myapp.tdd;

public class BusinessFlight extends NewFlight {

	public BusinessFlight(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		if(passenger.isVip()) {
			return getList().add(passenger);
		}
		return false;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return false;
	}

}
