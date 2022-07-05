package dasar.dasarOOP.variable;

public class GlobalVariable {

	// variable global
	int TINGGI = 170;
	String GLOBAL_VARIABLE = "Variable ini adalah global," + "karena didalam class dan tidak didalam" + "suatu method";

	public void meodeSatu() {
		int tinggi = 168;
		String variablePenampungGlobal = GLOBAL_VARIABLE;
	}
	public String meodeDua() {
		return null;
	}
}
