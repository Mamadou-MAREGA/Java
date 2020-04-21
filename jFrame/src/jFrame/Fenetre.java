package jFrame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	public Fenetre()
	{
		 this.setTitle("Ma premi�re fen�tre");
	     this.setSize(400, 100);
	     this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     //Instanciation de notre panel
	     JPanel pan = new JPanel();
	     //d�finition de la couleur
	     pan.setBackground(Color.ORANGE);
	     //On pr�vient notre Jframe que notre Jpanel sera son content pan
	     this.setContentPane(pan);

	        
	     this.setVisible(true);
	}

}
