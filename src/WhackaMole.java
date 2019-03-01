import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackaMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button = new JButton();

	public static void main(String[] args) {
	WhackaMole mole = new WhackaMole();
	mole.whack();
	
}

	public void whack() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	drawButtons();
	panel.add(label);
	frame.setSize(600, 175);
	
	
}
	public void drawButtons() {
		int whacks = new Random().nextInt(24);
		for(int i=0; i<24; i++) {
			if(i == whacks) {
				panel.add(new JButton("Mole!"));
			} else {
			panel.add(new JButton());
			}
		}
		
		
		
	}
}

