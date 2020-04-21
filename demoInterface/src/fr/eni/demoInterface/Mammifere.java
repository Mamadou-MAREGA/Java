package fr.eni.demoInterface;

public class Mammifere implements Volant{
	
	public void communiquer() {
		System.out.println("Communique");
	}

	@Override
	public void voler() {
		
		System.out.println("Chauve-souris vole");
	}

}
