package dasar.dasarOOP.variable;

public class LocalVariable {

	String warna = "kuning";
	int x = 12;

	public void metodeSifatWarnaSatu() {

		System.out.println(this.warna);
		String sifat = "Ceria"; // local variable
		String ambilWarna = warna; // var local nilainya dari var global

		System.out.println(sifat + ambilWarna);
	}
}
