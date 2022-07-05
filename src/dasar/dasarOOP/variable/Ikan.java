package dasar.dasarOOP.variable;

public class Ikan {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instance atau property class sendiri
		Ikan fish = new Ikan(); //  membuat atau menghidupkan memori
		fish.berenang();
		fish.bernafas();
		
		//instance dari class lain
		KelasDenganTigaMethod kdtm = new KelasDenganTigaMethod();
		kdtm.methodSatu();

	}
	
	public void berenang() {
		System.out.println("dikolam");
	}
	
	public void bernafas() {
		System.out.println("Menghirup udara");
	}
	
}
