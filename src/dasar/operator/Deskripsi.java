package dasar.operator;

public class Deskripsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		String a = "90";
		int b = 15;
		
		String c = a + b;
		int d = Integer.parseInt(a)+b;
		
		System.out.println("nomor 1");
		System.out.println(c);
		System.out.println("9 + 15 = " + d);
		
		//2
		double e = 1.1;
		float f = 2.2f;
		
		double g = e + f;
		
		System.out.println("nomor 2");
		System.out.println("1.1 + 1.2 = " + g);
		
		//3
		System.out.println("nomor 3");
		System.out.println("tipe data boolean");
		
		//4 
		long h = 1000000000L;
		int i = 10;
		
		long j = h * i;
		
		System.out.println("nomor 4");
		System.out.println("1000000000 X 10 = " + j);
		
		
	}

}
