import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog(null, "Veillez entrer votre identit�", "Gendarmerie nationale !",
				JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Votre nom est " + nom, "identit� ", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
