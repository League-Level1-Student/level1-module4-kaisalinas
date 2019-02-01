import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet {
JFrame frame = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField textfield = new JTextField();
public static void main(String[] args) {
System.out.println("Tweet, Tweet");
LatestTweet tweets = new LatestTweet();
tweets.tweet();
}
public void tweet() {
	frame.setVisible(true);
	
}
}
