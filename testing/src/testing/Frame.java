package testing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame {
	protected static JFrame mainWindow;
	protected static JPanel mainPanel;
	protected static JLabel bankAccountLabel;         //all these are protected fields of a frame object
	protected GridBagConstraints layoutConst;
	
	public Frame() {      //default constructor of a frame that creates a JFrame when called
		Frame.mainWindow = new JFrame();  //creates a JFrame
		mainWindow.setSize(900, 900);
		mainWindow.setTitle("Bank Account");
		mainWindow.setLayout(new GridBagLayout());  //creates a new layout manager for the JFrame
		layoutConst = new GridBagConstraints();  // creates new constraints for the layout manager
		mainPanel = new JPanel();   //creates the JPanel
		mainPanel.setBackground(Color.black);
		layoutConst.gridx = 50;
		layoutConst.gridy = 50;
		layoutConst.insets = new Insets(10,10, 10, 10);
		mainWindow.add(mainPanel, layoutConst);    //method which adds the panel and the constraints of it to the JFrame
		
		bankAccountLabel = new JLabel("Enter Bank Account Balance: ");   //creates JLabel which prompts user for balance
		bankAccountLabel.setForeground(Color.white);
		layoutConst = new GridBagConstraints();  //create constrains for the label
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.insets = new Insets(10, 10, 10, 10);
		mainPanel.add(bankAccountLabel, layoutConst);   //adds the JLabel to the panel
		
		
		
		mainWindow.setVisible(true);  //This makes the JFrame visible
		

		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //this makes sure that the program exits when the window is closed
	}
}
