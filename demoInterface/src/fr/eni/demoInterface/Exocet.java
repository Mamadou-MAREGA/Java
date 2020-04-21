package fr.eni.demoInterface;

public class Exocet implements Nageant, Volant{

	@Override
	public void voler() {
		System.out.println("Exocet vole");
	}

	@Override
	public void nager() {
		System.out.println("Exocet nage");
	}

}
