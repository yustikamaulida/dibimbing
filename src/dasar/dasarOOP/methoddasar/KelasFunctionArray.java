package dasar.dasarOOP.methoddasar;

public class KelasFunctionArray {

	public String[] nama() {
		String namaDepan = "Intan"; // i = 0
		String namaTengah = "Maulida"; // i = 1
		String namaBelakang = "Rizy"; //  i = 2
		String[] namaLengkap = { namaDepan, namaTengah, namaBelakang };
		return namaLengkap;
	}

	public static void main(String[] args) {

		KelasFunctionArray kfs = new KelasFunctionArray();
		String[] test = kfs.nama(); //variable penampung
		for (int i = 0; i < test.length; i++) { // .length membuat otomatis
			System.out.println(test[i]);
		}
		System.out.println(test.length); //lenght gak dari index
	}
}
