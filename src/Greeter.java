import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String audrey = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null, "hi " + audrey);
		
		
	}

}
