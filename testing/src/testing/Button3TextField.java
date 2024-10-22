package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Button3TextField extends BankAccount implements ActionListener { //this class represents a JLabel and JTextfield for when after the "deposit" button is pressed
	GridBagConstraints layoutConst;  //fields of a Button3TextField object
	JTextField depositTextField;
	
	public Button3TextField() { //default constructor of a Button3TextField
		depositTextField = new JTextField(10);
		depositTextField.setEditable(true);
		depositTextField.setForeground(Color.black);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(depositTextField, layoutConst);
		depositTextField.addActionListener(this); //adds an actionlistener to the text field
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {  //method is executed when the enter key is pressed
		String depositAmount = depositTextField.getText();  //gets the user inputted text from the textfield and contains it in a String
		
		int depositAmountConvert = Integer.valueOf(depositAmount);   //converts string to an int

		super.deposit(depositAmountConvert);  //calls deposit method that adds the parameter to the balance
	

		
		
		Frame.mainPanel.repaint();
		Frame.mainPanel.revalidate();
		
		JLabel newBalanceLabel = new JLabel("New balance: ");  //Code block creates a new JLabel and its constraints
		newBalanceLabel.setForeground(Color.white);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceLabel, layoutConst);
		
		JTextField newBalanceTextField = new JTextField(10);   //creates a new JtextField
		newBalanceTextField.setText("$" + Integer.toString(BankAccount.balance));
		newBalanceTextField.setEditable(false);
		newBalanceTextField.setForeground(Color.black);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceTextField, layoutConst);   //adds the TextField and its constraints to the panel
}
}
