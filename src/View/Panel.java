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
        		String people = input.getText();
        		int input = Integer.valueOf(people);
        		int num = 0;
        		double random = 0;
        		String outputNum = "";
        		
        		for (int i = 1; i < input + 100; i++)
        		{
        			num = input;
        			random = Math.random();
        			num = (int) (num * random);
        			
        			outputNum = Integer.toString(num);
        			output = new JTextArea(outputNum,20,50);
        			
        			
        			
        		}
        		
        		
		    }
        });
    	

   			 
    }
}
