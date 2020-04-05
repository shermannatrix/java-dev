public class Tablet extends Computer {
	// variables
	private double screenSize;
	
	// methods
	void setScreenSize(double _screenSize) {
		screenSize = _screenSize;
	}
	
	double getScreenSize() {
		return screenSize;
	}
	
	@Override
	public void whatIsIt() {
		System.out.println("it is a tablet");
	}
}
