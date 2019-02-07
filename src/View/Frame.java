package View;


	import java.awt.Container;
	import javax.swing.JFrame;
	import Controller.Controller;

	public class Frame extends JFrame
	{
		private Controller appController;
		private Panel appPanel;
		
		public Frame(Controller appController)
		{
			super();
			this.appController = appController;
			this.appPanel = new Panel(appController);
			setupFrame();
			
		}
		
		private void setupFrame()
		{
			this.setContentPane(appPanel);
			this.setSize(800, 800);
			this.setTitle("banana");
			this.setResizable(true);
			this.setVisible(true);
		}
	}

