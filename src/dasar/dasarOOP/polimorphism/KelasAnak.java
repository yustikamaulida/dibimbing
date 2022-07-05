package dasar.dasarOOP.polimorphism;

public class KelasAnak extends KelasBapak{
	
	public void makan() {
		System.out.println("Nasi Goreng");
	}

	public static void main(String[]args) {
		
		KelasBapak kba = new KelasBapak();
		kba.makan();
		
		
		KelasAnak kbaOverride = new KelasAnak();
		kbaOverride.makan();
		
		//override
		KelasBapak kba2 = new KelasAnak();
		kba2.makan();
	}
	
}
