import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	
	String audrey = JOptionPane.showInputDialog("What is your name");
	String r2d2 = JOptionPane.showInputDialog(null, "What did you do in the summer");
	JOptionPane.showMessageDialog(null, "I know that you " + r2d2 + " last summer " + audrey);
	
	
	
}
}
