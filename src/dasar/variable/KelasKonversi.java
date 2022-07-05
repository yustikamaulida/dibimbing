package dasar.variable;

public class KelasKonversi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer - string
		Integer A = 95;
		System.out.println(String.valueOf(A)+90);
	
		// String - Integer
		String B = "105";
		System.out.println(Integer.valueOf(B)+5);
		
		// Integer - double
		Integer C = 81;
		System.out.println(Double.valueOf(C));
		
		// Integer - float
		Integer D = 82;
		System.out.println(Float.valueOf(D));
		
		// String - double
		String E = "90";
		System.out.println(Double.valueOf(E));
		
		char F = 'A';
		System.out.println(String.valueOf(F));
		System.out.println("test");
		
	}

}
