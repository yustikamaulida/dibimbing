package dasar.dasarOOP.methoddasar;

public class KelasFunctionString {

	public String returnString() { // method berjenis tipe data memerlukan return
		String kota = "Jakarta";
		/* return null; */
		return kota;
	}

	public int returnInt() {
		int angkaSatu = 1;
		/* return 0; */
		return angkaSatu;
	}
	
	public double returnDouble() {
		double angkaBerkoma = 7.999000;
		
		/* return 0.0; */
		return angkaBerkoma;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KelasFunctionString kfs = new KelasFunctionString();
		
		// return string function
		String city = kfs.returnString();
		System.out.println(city);
		
		// return int function
		int angka = kfs.returnInt();
		System.out.println(angka + angka);
		
		// retur double function
		double AngkaDouble = kfs.returnDouble();
		System.out.println(AngkaDouble+AngkaDouble);
		
		
	}

}
