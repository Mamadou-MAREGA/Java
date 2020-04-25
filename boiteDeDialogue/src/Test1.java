import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog(null, "Veillez entrer votre identité", "Gendarmerie nationale !",
				JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Votre nom est " + nom, "identité ", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
