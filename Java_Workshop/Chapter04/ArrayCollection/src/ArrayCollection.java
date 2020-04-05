import java.util.Arrays;

public class ArrayCollection {
	public static void main(String[] args) {
		String[] text = new String[] { "spam", "more", "buy" };
		
		Arrays.sort(text);
		
		System.out.println(Arrays.toString(text));
		
		for ( String s : text ) System.out.print ( s + " " );
	}
}
