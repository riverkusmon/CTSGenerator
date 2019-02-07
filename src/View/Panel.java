package View;

import javax.swing.*;
import Controller.Controller;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel
{
    private SpringLayout appLayout;
	private Controller appController;
    private JLabel logo;
    private JButton resButton;
    private JButton genButton;
    private JTextArea output;
    private JTextField input;
    
    
    
    public Panel(Controller appController)
    {
   	 super();
   	 this.appController = appController;   	 
//   	 fortnite
   	 
   	 appLayout = new SpringLayout();
       
       genButton = new JButton("generate");
       resButton = new JButton("reset");
       
       input = new JTextField();
       output = new JTextArea();
       logo = new JLabel();

     setupPanel();
   	 setupLayout();
   	 setupListeners();
    }
    
    private void setupPanel()
    {
   	 this.setLayout(appLayout);
   	 
   	 this.setBackground(Color.GRAY);
   	 
   	 this.add(logo);
   	 this.add(resButton);
   	 this.add(genButton);
   	 this.add(output);
   	 this.add(input);
   	 
   			 
    }
    
    private void setupLayout()
    {
   	 
   	 
    }
    





    private void setupListeners()
    {
   	 
    	
    	
    	
    	genButton.addActionListener(new ActionListener()
   			 {
    		public void actionPerformed(ActionEvent click)
			{
				String input = input.getText();
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
   			 
   			 
   			 
   			 
   			 }
   			 });   	 
    	

   			 
    }
}
