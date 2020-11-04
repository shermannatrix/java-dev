package com.s4lprod.research;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Simple Java code
//        List myNumbers = new ArrayList ();
//        Integer thirtyThree = new Integer(33);
//        myNumbers.add(thirtyThree);
//        
//        Integer theNumber = (Integer) myNumbers.get(0);
//        int n = theNumber.intValue();       // 33
        
        // Java code using autoboxing and generics.
        List<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        int n = myNumbers.get(0);
    }
}
