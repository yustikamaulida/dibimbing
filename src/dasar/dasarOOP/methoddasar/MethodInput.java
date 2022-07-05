package dasar.dasarOOP.methoddasar;

public class MethodInput {
	// method procedure, ada sysout tapi ga nampilin sysout
	// void : method tidak menghasilka suatu nilai output disebut dengan procedure
	// return : method yangmenghasilkannilai output disebut dengan function

	public String methodOutputString() { // ganti void, butuh return
		String nama = "william";
		String nama2 = "yus";
		return nama+nama2; // pasti error kalau void ga diganti string
	}

	public static void main(String[] args) {
		MethodInput kmf = new MethodInput();
		String nama = null;
		nama = kmf.methodOutputString();
		System.out.println(nama);
		
	}

}
