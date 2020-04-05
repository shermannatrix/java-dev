public class Age {
	public double a = 0;
	
	Age(double _a) {
		a = _a;
	}
	
	Age (int year, int month) {
		a = year + (double) month / 12;
	}
	
	public void setAge(double _a) {
		a = _a;
	}
	
	public void setAge(int year, int month) {
		a = year + (double) month / 12;
	}
	
	public double getAge() {
		return a;
	}
}
