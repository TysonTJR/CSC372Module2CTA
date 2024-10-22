package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Button3 implements ActionListener {  //class that represents a button3 or a "deposit" button
	JButton button3;
	JLabel  newBalanceLabel = new JLabel("Deposit amount: ");  //fields of the button3 object
	
	public Button3() {   //default constructor of a button3 object
		button3 = new JButton("Deposit");
		button3.setBackground(Color.white);
		button3.addActionListener(this);  //adds actionlistener to a button3 object
		
		
	}
	
	public void addButton3(JPanel mainPanel) {  //method that adds button3 to a panel
		mainPanel.add(button3);
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {   //method that executes when a button is pressed
		GridBagConstraints layoutConst;
		
		this.newBalanceLabel = new JLabel("Deposit amount: ");
		this.newBalanceLabel.setForeground(Color.white);
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		Frame.mainPanel.add(newBalanceLabel, layoutConst);
		
		Button3TextField button3TextField = new Button3TextField();  //this object provides an JTextField for when the button is pressed
		
		
		
		
	}
}
