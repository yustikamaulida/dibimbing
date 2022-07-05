package dasar.dasarOOP.polimorphism;

public class OverloadingKelas {

	static void hitung(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	static void hitung(String a, String b) {
		String c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	parameter int
		hitung(2, 4);
		
	//parameter string
		hitung("2", "2");

	}

}
