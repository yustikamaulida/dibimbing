package dasar.dasarOOP.inheritance.isahasa.dalam;

import dasar.dasarOOP.inheritance.isahasa.luar.KelasMotor;

public class KelasVespa extends KelasMotor{ //is a pake extends
	public void spesifikasi() {
		KelasMesin km = new KelasMesin(); //has a : karena mumbutuhkan beberapa atribut, instance sendiri untuk mengambil atribut
		km.mesinMatic();					//hanya
	
	}
}
