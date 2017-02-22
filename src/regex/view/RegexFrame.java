package regex.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import regex.controller.RegexController;

//Frame for the window
public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;
	
	//Sets up the frame
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	//Frame properties
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Regex");
		this.setSize(new Dimension(300, 600));
		this.setResizable(false);
		this.setVisible(true);
	}
}	


