package com.s4lprod.research;

public class Main {

    public static void main(String[] args) {
    	Field f = new Field();
    	f.setupApples();
    	System.out.println("Apple a1:");
    	f.a1.printDetails ();
    	System.out.println("Apple a2:");
    	f.a2.printDetails ();
    	f.detectCollisions ();
    	
	    /*Apple a1 = new Apple();
	    System.out.println("Apple a1:");
	    a1.printDetails ();
	    
	    // fill in some information on a1
		a1.mass = 10.0f;
		a1.x = 20;
		a1.y = 42;
		System.out.println("Updated a1:");
		a1.printDetails ();*/
    }
}
