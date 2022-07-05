package dasar.dasarOOP.contractor;

public class ContohConstractor {

	public ContohConstractor() {
		//nilai awal atau inisialisasi
		System.out.println("Inisialisasi dari class /pertama kali yang"
				+ "dipanggil saat di instance tanpa di panggil kunci panggilnya");
	}
	
	public void methodVoid(){
		System.out.println("Aku method biasa harus dideklarasi setelah di instance");
	}
	
	public String methodFunction() {
		return "hasil";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContohConstractor kac = new ContohConstractor(); // instance atau menghidupkan memori  namaClass instan = new namaClass();
		//contructor tanpa perlu di panggil langsung muncul ketika dirunning
		kac.methodVoid(); // method biasa 
		String variabelPenampungMethodFunction = kac.methodFunction();
//		String variabelPenampungMethodVoid = kac.methodVoid();
		
		System.out.println(variabelPenampungMethodFunction);
		
	}

}
