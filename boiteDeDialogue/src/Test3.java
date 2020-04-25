import javax.swing.JOptionPane;

public class Test3 {
  public static void main(String[] args) {
	  
    String[] sexe = {"masculin", "féminin", "indéterminé"};
    int rang = JOptionPane.showOptionDialog(null, 
      "Veuillez indiquer votre sexe !",
      "Gendarmerie nationale !",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null,
      sexe,
      sexe[2]);
    JOptionPane.showMessageDialog(null, "Votre sexe est " + sexe[rang], "Etat civil", JOptionPane.INFORMATION_MESSAGE);
  }
}