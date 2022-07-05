package dasar.dasarOOP.inheritance.dasar;

public class KelasBaron extends KelasWiliam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KelasBaron kb = new KelasBaron(); //setealh extends, meng instance kelasnya sendiri ciri inheritance
		kb.berlari();
		kb.melukis();
		int height = kb.tinggi;
		String pekerjaan =kb.status;
		
		System.out.println(height);
		System.out.println(pekerjaan);

	}

}
