package fr.eni.demoCollection;

import java.util.ArrayList;

public class BasketApp {

	public static void main(String[] args) {

		//Personne[] equipe;
		ArrayList<Personne> equipe;
		

		//création du tableau
		//equipe = new Personne[3];
		equipe = new ArrayList<Personne>();

		//Affectation des valeurs
		//equipe[0] = new Personne("Tony", "Parker");
		//equipe[1] = new Personne("Michael", "Jordan");
		//equipe[2] = new Personne("Lebron", "James");
		
		equipe.add(new Personne("Tony", "Parker"));
		equipe.add(new Personne("Michael", "Jordan"));
		equipe.add(new Personne("Lebron", "James"));

		//Lecture des valeurs
//		for (int i = 0; i < equipe.length; i++) {
//			System.out.println("Equipe " + equipe[i].toString());
//		}
		
		for (Personne p: equipe) {
			System.out.println(p);
			
		}
	}

}
