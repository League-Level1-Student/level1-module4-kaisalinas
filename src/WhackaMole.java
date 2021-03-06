import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackaMole implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	int moley = 0;
	static Date start;
	public static void main(String[] args) {
		WhackaMole mole = new WhackaMole();
		start = new Date();
		mole.whack();
		
	}

	public void whack() {
		frame =  new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		drawButtons();
		panel.add(label);
		frame.setSize(600, 175);
		// .addMouseListener(this);

	}

	public void drawButtons() {
		int whacks = new Random().nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addMouseListener(this);
			panel.add(button);
			if (i == whacks) {
				button.setText("Mole!");
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Mole!")) {
			moley++;
		}
		if(moley == 10) {
			endGame(start,moley);
			System.exit(0);
		}
		frame.dispose();
		whack();
		
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
