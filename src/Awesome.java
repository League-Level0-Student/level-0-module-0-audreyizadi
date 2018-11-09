import javax.swing.JOptionPane;

public class Awesome {
public static void main(String[] args) {
	String audrey = JOptionPane.showInputDialog("What do you like?");
	
	JOptionPane.showMessageDialog(null, audrey +" is super awesome");
}
}
