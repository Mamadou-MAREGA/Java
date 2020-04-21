package demoGenericite;

import java.util.ArrayList;
import java.util.List;

public class demoGenericteApp {

	public static void main(String[] args) {
		
		//Avant les généricités
		List<String> liste = new ArrayList<String>();
		liste.add("toto");
		liste.add("tutu");
		liste.add("loulou");
		liste.add("234");
		
		String p = (String) liste.get(1); //Obligation de faire un cast
		String p2 = (String) liste.get(2);
		
		
	}

}
