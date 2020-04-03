public class IntDoubleConversion {
	public static void main(String[] args) {
		if (args.length > 0) {
			int intValue = Integer.parseInt ( args[0] );
			System.out.println(intValue);
			
			double doubleValue = Double.parseDouble ( args[1] );
			System.out.println(doubleValue);
		}
	}
	
}
