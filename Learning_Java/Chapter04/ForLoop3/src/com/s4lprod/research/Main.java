package com.s4lprod.research;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int [] arrayOfInts = new int [] { 1, 2, 3, 4 };
	    
	    for (int i : arrayOfInts) {
	        System.out.println(i);
        }
    
        List<String> list = new ArrayList<String>();
	    list.add("foo");
	    list.add("bar");
	    
	    for (String s: list)
	        System.out.println(s);
    }
}
