package testing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends BankAccount implements ActionListener {   //this a class that represents a JTextField that extends the BankAccount class that implements ActionListner
	JTextField bankAccountTextField;   //these are fields of the TextField class
	GridBagConstraints layoutConst;
	
	public TextField() {   //default constructor of a TextField
		bankAccountTextField = new JTextField(5);   //creates a JTextField 5 pixels wide
		bankAccountTextField.setEditable(true);   //makes sure the JTextField is editable
		Frame.mainPanel.setLayout(new GridBagLayout());   //creates a layout manager for the panel
		layoutConst = new GridBagConstraints();   //creates constraints
		layoutConst.gridx = 1;   //sets x axis of component
		layoutConst.gridy = 0; //sets y axis of component
		layoutConst.insets = new Insets(10,10, 10, 10);   //gives component padding on all sides
		bankAccountTextField.addActionListener(this);    //adds the actionlistner object to the bankaccounttextfield. "this" means that the program will look for the actionPerformed method inside this class
		
	}
	public void addTextField(JPanel mainPanel) {   //method with no return type that adds the JText field and its constraints to the panel
		mainPanel.add(bankAccountTextField, layoutConst);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {    //method that is a part of the ActionListener interface, the code block executes when an action happens, e.g enter is pressed
		String balance = bankAccountTextField.getText();
		int balanceConvert = Integer.valueOf(balance);
		super.deposit(balanceConvert);
		bankAccountTextField.remove(bankAccountTextField);
		bankAccountTextField.setVisible(false);
		
		
		
	}
}
