package swing_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class SetTextListener implements ActionListener {


	private JTextField textField;
	private String text;
	
	
	
	public SetTextListener(JTextField textField, String text) {
		super();
		this.textField = textField;
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		textField.setText( text +" (" +actionEvent.getActionCommand()+ ")");		 
		System.out.println(actionEvent.getActionCommand());
	}

}
