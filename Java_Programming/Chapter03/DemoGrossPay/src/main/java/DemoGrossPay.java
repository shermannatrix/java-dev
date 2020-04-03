public class DemoGrossPay {
	public static double calculateGross(double hours, double rate) {
		double gross;
		gross = hours * rate;
		return gross;
	}
	
	public static double calculateNetPay(double hours, double rate) {
		double gross;
		double withholding;
		double net;
		gross = calculateGross ( hours, rate );

	}
	
	public static void main(String[] args) {
		double hours = 25;
		double yourHoursWorked = 37.5;
		calculateGross ( 10 );
		calculateGross ( hours );
		calculateGross ( yourHoursWorked );
	}
}
