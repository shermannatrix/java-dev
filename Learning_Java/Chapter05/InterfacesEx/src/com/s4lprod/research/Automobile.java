package com.s4lprod.research;

public class Automobile implements Driveable {
	
	@Override
	public boolean startEngine () {
		return false;
	}
	
	@Override
	public void stopEngine () {
	
	}
	
	@Override
	public float accelerate ( float acc ) {
		return 0;
	}
}
