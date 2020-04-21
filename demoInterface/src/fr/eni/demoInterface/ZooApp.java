package fr.eni.demoInterface;

public class ZooApp {

	public static void main(String[] args) {
		Chat c = new Chat();
		c.communiquer();
		
		ChauveSouris cs = new ChauveSouris();
		cs.communiquer();
		
		cs.voler();
		
		Volant v = new ChauveSouris();
		v.voler();
		
		Exocet e = new Exocet();
		e.nager();
		e.voler();
	}

}
