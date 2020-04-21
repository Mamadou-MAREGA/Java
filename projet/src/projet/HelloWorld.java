	package projet;
	
	import java.util.Scanner;
	
	class HelloWorld {
	  public static void main(String[] args)
	  {
		 /* Ville v = new Ville();
		  Ville v1 = new Ville("Marseille", 1236, "France");       
		  Ville v2 = new Ville("Rio", 321654, "Brésil");
		          
		  System.out.println("\n\n"+v1.decrisToi());
		  System.out.println(v.decrisToi());
		  System.out.println(v2.decrisToi()+"\n\n");
		  System.out.println(v1.comparer(v2));*/
		  
		//Définition d'un tableau de villes null
		  Ville[] tableau = new Ville[6];
		    String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		    int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

		    for(int i = 0; i < 6; i++){
		      if (i <3){
		        Ville V = new Ville(tab[i], tab2[i], "france");
		        tableau[i] = V;
		      }
		                
		      else{
		        Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		        tableau[i] = C;
		      }
		    }
		                 
		    //Il ne nous reste plus qu'à décrire tout notre tableau !
		    for(Object v : tableau)
		    {
		      System.out.println(((Ville) v).decrisToi()+"\n");
		    }
	}
	}