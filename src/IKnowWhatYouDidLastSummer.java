import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[] args) {
	String candy = JOptionPane.showInputDialog("What is your name");
	String food = JOptionPane.showInputDialog(null, "What did you do last summer");
	 JOptionPane.showMessageDialog(null, "You like" + food + "and so do I" + candy);
}
}
