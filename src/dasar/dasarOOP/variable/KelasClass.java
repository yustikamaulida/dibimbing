package dasar.dasarOOP.variable;

public class KelasClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int angka = 10;
		//String nama = "Yustika";
		// Tipe data primitif

		// Tipe data custom

		Sekolah alAzhar = new Sekolah();
		alAzhar.Alamat = "Jl. Apel no 10";
		alAzhar.Nama = "Al-Azhar"; // cara pertama

		Sekolah alAzharPusat = new Sekolah()
		{
			{
				 Alamat = "Jl. B";
				 Nama = "Al Azhar Pusat";
			}
		};
		
		alAzhar.GetInfo();
		alAzharPusat.GetInfo();
		
		//vs
		
		Sekolah.GetRandomInfo();
		Sekolah.GetRandomInfo();
		
		System.out.println(alAzhar.GetInfo());
		
	}

}
