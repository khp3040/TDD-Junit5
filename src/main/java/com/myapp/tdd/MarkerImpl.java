package com.myapp.tdd;

public class MarkerImpl implements Marker {
	
	public void CheckInterface() {
		
		if (this instanceof Marker) {
			System.out.println("Implementing Marker");
		}
		else {
			System.out.println("Not Implementing Marker");
		}
		
		
	}
	
	public MarkerImpl() {
		// TODO Auto-generated constructor stub
		
		MarkerImpl marker = new MarkerImpl();
		marker.CheckInterface();
	}

}
