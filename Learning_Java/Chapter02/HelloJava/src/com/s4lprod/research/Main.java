package com.s4lprod.research;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello, Java!");
		//JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
		frame.add(new HelloComponent());
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
