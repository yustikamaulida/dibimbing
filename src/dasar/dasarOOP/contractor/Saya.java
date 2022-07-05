package dasar.dasarOOP.contractor;

public class Saya {
	
	//biking method enaknya diatas
	
	public void nama() {
		System.out.println("Nama Saya");
	}
	protected void kamera() { //package yang sama 
		System.out.println("Kamera Saya");
	}
	private void handphone() { //bisa diakses pada kelasnya sendiri
		System.out.println("Handphone Saya");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cara instance pake "new"
		Saya call = new Saya();
		// ijo public, merah private, kuning protected
		call.nama();
		call.kamera();
		call.handphone();
	
		
	}

}
