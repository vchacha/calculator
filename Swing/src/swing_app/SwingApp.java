package swing_app;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingApp {

	public static void main(String[] args) throws InterruptedException {
		JFrame f = new JFrame("Swing Frame");
		f.setSize(300, 500);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout( new GridLayout(2,1) );
		/* Place at center */
		f.setLocationRelativeTo(null);

		
		JTextField textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Verdana",Font.BOLD,16));
		
		textField.addMouseMotionListener( new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Get out of here!");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) { /* Do nothing */ }
		} );
		
		JPanel bottomPanel = new JPanel( new GridLayout( 1,2 ));
		
		JButton okButton = new JButton("Ok");
		
		/* Create an instance of the listener */
		ActionListener okListener = new SetTextListener(textField,"OKAY");
		
		/* Bind the listener to the component */
		okButton.addActionListener(okListener);
		okButton.setActionCommand("OkPressedCommand");
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new SetTextListener(textField,"CANCEL"));
		cancelButton.setActionCommand("CancelPressedCommand");
		
		bottomPanel.add(okButton);
		bottomPanel.add(cancelButton);
		
			
		f.add(textField);
		f.add(bottomPanel);
		
		f.setVisible(true);
		//f.revalidate();
		//f.repaint();

		
	}
	
}
