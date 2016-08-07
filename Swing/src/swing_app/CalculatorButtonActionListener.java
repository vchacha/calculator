package swing_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorButtonActionListener implements ActionListener {

	private SwingCalculator swingCalculator;

	public CalculatorButtonActionListener(SwingCalculator swingCalculator) {
		this.swingCalculator = swingCalculator;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		Object obj = actionEvent.getSource();
		
		if ( obj instanceof JButton ) {
			JButton button = (JButton) obj;
			swingCalculator.textField.setText( swingCalculator.textField.getText() + button.getText() );
		}
		
	}

}
