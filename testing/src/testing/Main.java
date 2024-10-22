package testing;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		BankAccount newAccount = new BankAccount();    // creates a bank account object that has a int balance field
		
		Frame mainWindow = new Frame();                 //creates a frame object from the programmer created class Frame that contains a JFrame and JPanel
		TextField bankAccountTextField = new TextField();         //Creates an object from the TextField class that contains a text field for the user inputted balance
		bankAccountTextField.addTextField(Frame.mainPanel);      //method from the TextField class that adds the textfield that allow user input into the panel inside Frame
		Button1 button1 = new Button1();     //creates the first button which is the display balance button.
		button1.addButton(Frame.mainPanel);   //adds the display balance button to the panel inside frame inside Jframe
		
		Button2 button2 = new Button2();   //creates the 2nd button which is the withdraw button
		button2.addButton2(Frame.mainPanel);   //adds withdraw button to panel inside frame
		
		Button3 button3 = new Button3();     //creates a 3rd button which is the deposit button
		button3.addButton3(Frame.mainPanel);  //adds the deposit button to the panel inside frame
		
		
		
		
	}

}
