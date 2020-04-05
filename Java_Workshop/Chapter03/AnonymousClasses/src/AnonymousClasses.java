public class AnonymousClasses {
	public static void main(String[] args) {
		// inner class
		Container container = new Container() {
			@Override
			public void print() {
				System.out.println("This is an inner class");
			}
		};
		container.print();
		System.out.println(container.c);
	}
}
