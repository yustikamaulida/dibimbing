package dasar.dasarOOP.enkapsulasi.enkap;

public class KelasInheritanceExtendsDasar extends KelasEncapsulation{
	
	public KelasInheritanceExtendsDasar() {
		super.contoh();// memanggil
	}
	public void gaes() {
		super.contoh();//memanggil
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance : yang memiliki akses bukanlah sebuah class, akan tetapi sebuah object. yang bisa di gunakan untuk mengakses semua fungsi yang ada di dalam sebuah class.
		KelasInheritanceExtendsDasar call = new KelasInheritanceExtendsDasar();
		call.contoh();
				
	
		
	}

}
