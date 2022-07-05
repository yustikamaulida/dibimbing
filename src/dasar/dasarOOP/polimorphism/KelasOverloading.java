package dasar.dasarOOP.polimorphism;

public class KelasOverloading {

	public void tambah(int a, int b) {
		int hasil = a + b;
		System.out.println(hasil);
		
	}
	public void tambah(int a, String b) {
		int hasil = a + Integer.valueOf(b);
		System.out.println(hasil);
		
	}
	public void tambah(String c, String d) {
		int hasil = Integer.valueOf(c) + Integer.valueOf(d);
		System.out.println(hasil);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		// artinya mempunyai method dengan nama yang sama, namun berada dalam 1 class yang sama
		KelasOverloading ko = new KelasOverloading();
		ko.tambah(90, 10);
		ko.tambah(10, 91);
		ko.tambah(80, 70);
		
		
	
	}

}
