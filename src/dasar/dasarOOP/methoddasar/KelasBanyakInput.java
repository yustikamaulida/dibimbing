package dasar.dasarOOP.methoddasar;

public class KelasBanyakInput {
	
	public void methodInput(String namaDepan, String namaBelakang) {
		String fullName = namaDepan + namaBelakang;
		System.out.println(fullName);
		
	}

	public String test (String s) {
		return null;
	}
	public void methodInput2(String nama, int tinggi, double ipk) {
		System.out.println(nama);
		System.out.println(tinggi);
		System.out.println(ipk);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KelasBanyakInput mi = new KelasBanyakInput();
		mi.methodInput("Satria", " Wiguna");
		
		mi.methodInput2("Yustika", 156, 3.57);
		
	}

}
