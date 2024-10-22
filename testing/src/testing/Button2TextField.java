package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Button2TextField extends BankAccount implements ActionListener {  //this class represents a JLabel and JTextfield for when after the "withdraw" button is pressed
	GridBagConstraints layoutConst;
	JTextField withdrawTextField;
	
	public Button2TextField() {  //default constructor of a Button2TextField
		withdrawTextField = new JTextField(10);
		withdrawTextField.setEditable(true);
		withdrawTextField.setForeground(Color.black);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(withdrawTextField, layoutConst);
		withdrawTextField.addActionListener(this);  //adds an actionlistener to the text field
	}
	@Override
	public void actionPerformed(ActionEvent e) {  //method is executed when the enter key is pressed
		String withdrawalAmount = withdrawTextField.getText();  //gets the user inputted text from the textfield and contains it in a String
		System.out.println("String" + withdrawalAmount);
		int WithdrawAmountConvert = Integer.valueOf(withdrawalAmount);  //converts string to an int

		BankAccount.withdrawal(WithdrawAmountConvert);  //calls withdrawal method that deducts the parameter from the balance
		

		
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
