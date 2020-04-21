package projet1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Loup l = new Loup("Gris bleuté", 20);
	    l.boire();
	    l.manger();
	    l.deplacement();
	    l.crier();
	    System.out.println(l.toString());
	    */
		
		// les méthodes d'un chien 
		
		Chien c = new Chien("gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
		
		System.out.println("------------------------------------------------");
		//les méthodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
		
		System.out.println("------------------------------------------------");
		//Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	}

}
