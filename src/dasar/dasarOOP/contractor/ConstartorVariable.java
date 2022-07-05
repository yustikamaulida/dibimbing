package dasar.dasarOOP.contractor;

public class ConstartorVariable {
	String namaDepan;
	int usia;

	public ConstartorVariable() {
		namaDepan = "Sugar Gleder";
		usia = 29;
		System.out.println("hai"); 
	}
	
	public void methodBiasa() {
		System.out.println("harus di instance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstartorVariable call = new ConstartorVariable();
		System.out.println("Nama : " + call.namaDepan);
		System.out.println("Usia : " + call.usia);
	}

}
