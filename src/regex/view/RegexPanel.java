package regex.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import regex.controller.RegexController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneField;
	private JTextField emailField;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	private JButton button;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstNameField = new JTextField();
		lastNameField = new JTextField();
		phoneField = new JTextField();
		emailField = new JTextField();
		firstNameLabel = new JLabel();
		lastNameLabel = new JLabel();
		phoneLabel = new JLabel();
		emailLabel = new JLabel();
		button = new JButton();
		
		
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	
	//Adds the components of the program to the screen
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(phoneField);
		this.add(emailField);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneLabel);
		this.add(emailLabel);
		this.add(button);
	}
	
	//Dump method for auto-generated code from Window Builder
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, 28, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 211, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, 24, SpringLayout.SOUTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 0, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneField, 28, SpringLayout.SOUTH, lastNameField);
		baseLayout.putConstraint(SpringLayout.WEST, phoneField, 211, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 27, SpringLayout.SOUTH, phoneField);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 211, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, button, 179, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
	}
	//Listeners for actions
	private void setupListeners()
	{
		
	}
}
