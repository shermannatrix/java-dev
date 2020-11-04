package com.s4lprod.research;

import javax.swing.*;

public class Main {
	
	public static void main ( String[] args ) {
		JFrame frame = new JFrame ( "HelloJava2" );
		frame.add ( new HelloComponent2 ( "Hello, Java!" ) );
		frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		frame.setSize ( 300, 300 );
		frame.setVisible ( true );
	}
}
