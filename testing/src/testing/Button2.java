package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Button2 extends BankAccount implements ActionListener {  //class that represents a button2 object or a "withdraw" button
	JButton button2;
	JLabel  newBalanceLabel = new JLabel("Withdrawal amount: ");   //fields of the button2 object
	
	public Button2() {   //default constructor of button2 object
		button2 = new JButton("Withdraw");
		button2.setBackground(Color.white);
		button2.addActionListener(this);
		
		
	}
	
	public void addButton2(JPanel mainPanel) {   //method that adds button2 to the panel
		mainPanel.add(button2);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {  //method that executes when button is pressed
		GridBagConstraints layoutConst;
		
		this.newBalanceLabel = new JLabel("Withdrawal amount: ");
		this.newBalanceLabel.setForeground(Color.white);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceLabel, layoutConst);
		
		Button2TextField button2TextField = new Button2TextField();  //this created object provides a textfield for when button is pressed
		
		
		
		
		
	}
}
