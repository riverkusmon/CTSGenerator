package View;

import javax.swing.*;
import Controller.Controller;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class Panel extends JPanel
{
    private SpringLayout appLayout;
	private Controller appController;
    private JLabel logo;
    private JButton resButton;
    private JButton genButton;
    private JTextField output;
    private JTextField input;
    
    
    
    public Panel(Controller appController)
    {
   	 super();
   	 setBorder(null);
   	 this.appController = appController;

   	 appLayout = new SpringLayout();
       
       genButton = new JButton("generate");
       appLayout.putConstraint(SpringLayout.NORTH, genButton, 137, SpringLayout.NORTH, this);
       appLayout.putConstraint(SpringLayout.WEST, genButton, -85, SpringLayout.EAST, this);
       appLayout.putConstraint(SpringLayout.SOUTH, genButton, -10, SpringLayout.SOUTH, this);
       appLayout.putConstraint(SpringLayout.EAST, genButton, -10, SpringLayout.EAST, this);

       resButton = new JButton("reset");
       appLayout.putConstraint(SpringLayout.NORTH, resButton, 0, SpringLayout.NORTH, genButton);
       appLayout.putConstraint(SpringLayout.EAST, resButton, 109, SpringLayout.WEST, this);
       appLayout.putConstraint(SpringLayout.SOUTH, resButton, -10, SpringLayout.SOUTH, this);
       appLayout.putConstraint(SpringLayout.WEST, resButton, 28, SpringLayout.WEST, this);
       resButton.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       	}
       });

       
       input = new JTextField();
       input.setText("Amount of people");
       appLayout.putConstraint(SpringLayout.NORTH, input, 137, SpringLayout.NORTH, this);
       appLayout.putConstraint(SpringLayout.WEST, input, 57, SpringLayout.EAST, resButton);
       appLayout.putConstraint(SpringLayout.SOUTH, input, -93, SpringLayout.SOUTH, this);
       appLayout.putConstraint(SpringLayout.EAST, input, -55, SpringLayout.WEST, genButton);
       input.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 255, 0)));
       input.setHorizontalAlignment(SwingConstants.LEFT);

       output = new JTextField();
       output.setCaretColor(SystemColor.controlDkShadow);
       output.setText("Generated Number");
       appLayout.putConstraint(SpringLayout.NORTH, output, 13, SpringLayout.SOUTH, input);
       appLayout.putConstraint(SpringLayout.WEST, output, 57, SpringLayout.EAST, resButton);
       appLayout.putConstraint(SpringLayout.SOUTH, output, -10, SpringLayout.SOUTH, this);
       appLayout.putConstraint(SpringLayout.EAST, output, -55, SpringLayout.WEST, genButton);
       appLayout.putConstraint(SpringLayout.WEST, input, 166, SpringLayout.WEST, this);
       output.setEditable(false);

       logo = new JLabel();

     setupPanel();
   	 setupLayout();
   	 setupListeners();
    }
    
    private void setupPanel()
    {
   	 this.setLayout(appLayout);
   	 
   	 this.setBackground(Color.WHITE);
 //  	 this.setBorder(new java.awt.Color(E51E44));
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
        		String outputNum = " ";
        		
        		for (int i = 1; i < input; i++)
        		{
        			num = input;
        			random = Math.random();
        			num = (int) (num * random);
        			
        			if (num == 0)
        			{
        				num = 1;
        			}
        			
        			outputNum = Integer.toString(num);
        			output.setText(outputNum);
        			
        			System.out.println("test loop");
        			try
					{
						Thread.sleep(80);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
        			
        		}		
		    }
        });
    }
}
