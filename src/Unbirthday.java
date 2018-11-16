import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String audrey = JOptionPane.showInputDialog("What is your birthday");
	if (audrey.equals("11-15")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
	
}
}
