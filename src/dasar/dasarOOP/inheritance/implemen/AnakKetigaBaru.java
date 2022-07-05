package dasar.dasarOOP.inheritance.implemen;

public class AnakKetigaBaru implements OrangTuaBaru{

	@Override
	public void motor() {
		// TODO Auto-generated method stub
		System.out.println("Motor Sport");
	}

	@Override
	public void mobil() {
		// TODO Auto-generated method stub
		System.out.println("Motor City Car");
	}

	@Override
	public void gubuk() {
		// TODO Auto-generated method stub
		System.out.println("Kosan");
	}
	
	public static void main (String[]args) {
		AnakKetigaBaru k3 = new AnakKetigaBaru();
		k3.mobil();
		AnakKeduaBaru k2 = new AnakKeduaBaru();
		k2.mobil();
	}

}
