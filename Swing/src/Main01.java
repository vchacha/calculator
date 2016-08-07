import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main01 {

	public static void main(String[] args) throws InterruptedException {
		JFrame f = new JFrame("Swing Frame");
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
                //TODO fixed
		f.setLocationRelativeTo(null);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JButton("Button1"), BorderLayout.NORTH);
		panel.add(new JButton("Button2"), BorderLayout.SOUTH);
		panel.add(new JButton("Button3"), BorderLayout.WEST);
		panel.add(new JButton("Button4"), BorderLayout.EAST);
		panel.add(new JButton("Button5"), BorderLayout.CENTER);

		f.add(panel);

		for (int i = 1; i <= 3; i++) {
			Thread.sleep(1000);
			f.setSize(500 + i * 100, 500 + i * 100);
			f.setLocationRelativeTo(null);
		}

	}

}
