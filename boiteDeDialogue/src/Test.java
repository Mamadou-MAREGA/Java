import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
    	
        
        ImageIcon img = new ImageIcon("images/information.png");
        JOptionPane.showMessageDialog(null, "Message informatif", "Information", JOptionPane.INFORMATION_MESSAGE, img);
        
        img = new ImageIcon("images/preventif.png");
        JOptionPane.showMessageDialog(null, "Message préventif", "Attention", JOptionPane.WARNING_MESSAGE, img);
        
        img = new ImageIcon("images/erreur.png");
        JOptionPane.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE, img);
    }
}