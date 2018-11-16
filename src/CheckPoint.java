import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	String audrey = JOptionPane.showInputDialog(null, "What is your favorite color");
	JOptionPane.showMessageDialog(null, "I know that your " + "favorite color is " + audrey);
	Robot r2d2 = new Robot ();
	r2d2.penDown();
	r2d2.move(50);
	r2d2.turn(120);
	r2d2.move(50);
	r2d2.turn(120);
	r2d2.move(50);
	r2d2.hide();
}
}
