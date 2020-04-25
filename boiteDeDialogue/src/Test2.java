import javax.swing.JOptionPane;

public class Test2 {
  public static void main(String[] args) {
	  
    String[] sexe = {"masculin", "féminin", "indéterminé"};
    String nom = (String)JOptionPane.showInputDialog(null, 
      "Veuillez indiquer votre sexe !",
      "Gendarmerie nationale !",
      JOptionPane.QUESTION_MESSAGE,
      null,
      sexe,
      sexe[2]);
    JOptionPane.showMessageDialog(null, "Votre sexe est " + nom, "Etat civil", JOptionPane.INFORMATION_MESSAGE);
  }
}