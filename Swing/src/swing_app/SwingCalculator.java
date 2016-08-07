package swing_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingCalculator {

	private JFrame frmCalculator;
	protected JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingCalculator window = new SwingCalculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 250, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mouseEvent) {
				if ( mouseEvent.getClickCount() == 2 ) {
					textField.setText("");	
				}				
			}
		});
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBackground(Color.WHITE);
		frmCalculator.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		textField.setPreferredSize(new Dimension(5, 60));
		
		JPanel panel = new JPanel();
		frmCalculator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 0, 0));
		
		addButtonToButtonsPanel(panel, "7");
		addButtonToButtonsPanel(panel, "8");
		addButtonToButtonsPanel(panel, "9");
		addButtonToButtonsPanel(panel, "0");
		addButtonToButtonsPanel(panel, "=");
		addButtonToButtonsPanel(panel, "4");
		addButtonToButtonsPanel(panel, "5");
		addButtonToButtonsPanel(panel, "6");
		addButtonToButtonsPanel(panel, "+");
		addButtonToButtonsPanel(panel, "-");
		addButtonToButtonsPanel(panel, "1");
		addButtonToButtonsPanel(panel, "2");
		addButtonToButtonsPanel(panel, "3");
		addButtonToButtonsPanel(panel, "*");
		addButtonToButtonsPanel(panel, "/");

	}

	private void addButtonToButtonsPanel(JPanel panel, String buttonText) {
		JButton btnNewButton = new JButton(buttonText);
		btnNewButton.addActionListener(new CalculatorButtonActionListener(this));
		panel.add(btnNewButton);
	}

}
