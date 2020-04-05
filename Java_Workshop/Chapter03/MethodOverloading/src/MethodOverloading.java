public class MethodOverloading {
	public static void main(String[] args) {
		Age age1 = new Age(12.5);
		Age age2 = new Age(9, 3);
//		age.setAge ( 12.5 );
//		System.out.println(age.getAge ());
//		age.setAge ( 9, 3 );
//		System.out.println(age.getAge ());
		
		System.out.println(age1.getAge ());
		System.out.println(age2.getAge ());
	}
}
