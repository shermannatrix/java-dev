import java.util.*;

public class ArrayToSet {
	public static void main(String[] args) {
		Integer[] myArray = new Integer[] { 3, 25, 2, 79, 2 };
		
		Set<Integer> mySet = new HashSet<Integer> ( Arrays.asList(myArray) );
		
		System.out.println(mySet);
	}
}
