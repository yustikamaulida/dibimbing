package dasar.condition;

import java.util.Scanner;

public class Yustika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"Pilih warna : \n1. Merah \n2. Orange \n3. Kuning \n4. Hijau \n5. Biru \n6. Ungu \n7. Coklat \n8. Warna Lainnya \n(Ketikkan nomor)=>");

		Scanner sc = new Scanner(System.in);
		int pilihWarna = sc.nextInt();

		switch (pilihWarna) {
		case 1:
			System.out.println("Merah \nBahaya, Gairah, Kegembiraan, & Energi");
			break;
		case 2:
			System.out.println("Orange \nSegar, Bermuda, Kreatif, & Petualang");
			break;
		case 3:
			System.out.println("Kuning \nOptimistis, Ceria, Menyenangkan, & Bahagia");
			break;
		case 4:
			System.out.println("Hijau \nAlami, Daya Hidup, Martabat, & Kekayaan");
			break;
		case 5:
			System.out.println("Biru \nKomunikatif, Dapat Dipercaya, Menenagkan & Depresi");
			break;
		case 6:
			System.out.println("Ungu \nKerajaan, Keagungan, Spiritual, & Misterius");
			break;
		case 7:
			System.out.println("Coklat \nOrganik, Menyeluruh, Sederhana, & Jujur");
			break;

		default:
			System.out.println("Hidupmu kurang berwarna");
			break;
		}
		sc.close();
	}

}
