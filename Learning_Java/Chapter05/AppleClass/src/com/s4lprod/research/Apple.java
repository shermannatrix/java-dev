package com.s4lprod.research;

public class Apple {
	float mass;
	private float diameter = 1.0f;
	int x, y;
	static float gravAccel = 9.8f;
	static final float EARTH_ACCEL = 9.8f;
	static int SMALL = 0, MEDIUM = 1, LARGE = 2;
	
	float getWeight() {
		return mass * gravAccel;
	}
	
	public void setDiameter(float newDiameter) {
		diameter = newDiameter;
	}
	
	public float getDiameter() {
		return diameter;
	}
	
	public void moveTo(int x, int y) {
		System.out.println("Moving apple to " + x + ", " + y);
		this.x = x;
		if (y > diameter / 2) {
			this.y = y;
		} else {
			this.y = (int) (diameter / 2);
		}
	}
	
	public static String[] getAppleSizes() {
		// Return names for our constants
		// The index of the name should match the value of the constant
		return new String[] { "SMALL", "MEDIUM", "LARGE" };
	}
	
	boolean isTouching(Apple other) {
		double xdiff = x - other.x;
		double ydiff = y - other.y;
		double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
		if (distance < diameter / 2 + other.diameter / 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printDetails() {
		System.out.println("  mass: " + mass);
		System.out.println("  diameter: " + diameter);
		System.out.println("  position: (" + x + ", " + y + ")");
		// Print a nice, human-friendly approximate
		String niceNames[] = getAppleSizes ();
		if (diameter < 5.0f) {
			System.out.println("This is a " + niceNames[SMALL] + " apple.");
		} else if (diameter < 10.0f) {
			System.out.println("This is a " + niceNames[MEDIUM] + " apple.");
		} else {
			System.out.println("This is a " + niceNames[LARGE] + " apple.");
		}
	}
}
