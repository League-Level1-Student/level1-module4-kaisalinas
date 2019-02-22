import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackaMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JTextField field = new JTextField();
JButton button = new JButton();

	public static void main(String[] args) {
	
	
	
}

	public void whack() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(field);
	panel.add(button);
	panel.add(label);
	
	frame.pack();
	
}
}

