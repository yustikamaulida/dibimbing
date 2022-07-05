package dasar.dasarOOP.methoddasar;

public class MethodOutputInput {

	public int perkalian(int a, int b, int c) {
		int hasil = a + (b / c);
		return hasil;
	}
	
	public void perkalian(String a, String b) {
	
	}
	
	public String perkalian(String d) {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MethodOutputInput moi = new MethodOutputInput();
		int hasilPerkalian = moi.perkalian(10, 10, 10);
		System.out.println(hasilPerkalian);
		
		
	}

}
