package dasar.dasarOOP.methoddasar;

import java.util.List;
import java.util.ArrayList;

public class KelasFunctionArrayList {

	public List<String> testList() {
		List<String> test = new ArrayList<String>();
		test.add("Intan");
		test.add("Yustika");
		return test;
	}

	public static void main(String[] arg) {

		KelasFunctionArrayList test2 = new KelasFunctionArrayList();
		List<String> test3 = test2.testList();
		
		for (int i = 0; i < test3.size(); i++) {
			System.out.println(test3.get(i));
		}
		
		
	}

}
