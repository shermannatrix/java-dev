public static class BreakingTheLaw {
	static class MyException extends Exception {
		// Constructor
		MyException() {
			super();
		};
		
		MyException(String message) {
			super(message);
		}
		
		MyException(String message, Throwable cause) {
			super(message, cause);
		}
		
		MyException(Throwable cause) {
			super(cause);
		}
	}
	
	public static void main(String[] args) throws MyException {
		String s = null;
		
		try {
			System.out.println(s.length());
		} catch (NullPointerException ne) {
			throw new MyException("Exception: my exception happened");
		}
	}
	
	
}
