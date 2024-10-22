package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button1 extends TextField implements ActionListener {
	JButton button1;  //this class represents the 1st button or the "display balance" button.
	
	public Button1() {   //default constructor of button
		button1 = new JButton("Display Balance");
		button1.setBackground(Color.white);
		button1.addActionListener(this);  //adds the button to the actionlistener
		
		
	}
	
	public void addButton(JPanel mainPanel) {  //void method that adds the button to the panel
		mainPanel.add(button1);
	}

	@SuppressWarnings("static-access")
	
	@Override
	public void actionPerformed(ActionEvent e) {  //method that executes when the button is pressed
		Frame.mainPanel.remove(bankAccountTextField);
		Frame.bankAccountLabel.setVisible(false);
		Frame.mainPanel.repaint();
		JLabel newBalanceLabel = new JLabel("Initial balance: ");  //creates a JLabel
		newBalanceLabel.setForeground(Color.white);
		super.layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceLabel, layoutConst);
		
		JTextField newBalanceTextField = new JTextField(5);   //creates a JTextField
		newBalanceTextField.setText("$" + Integer.toString(super.balance));  //sets the JTextField's text to the string type of the balance
		newBalanceTextField.setEditable(false);  //makes the textfield not editable
		newBalanceTextField.setForeground(Color.black);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceTextField, layoutConst);  //adds the text field to the panel
		
		
		
	}
}
