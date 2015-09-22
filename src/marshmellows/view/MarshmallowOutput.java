package marshmellows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
	{
		public void displayMonsterConsole(String info)
		{
			System.out.println("My monster info is: " + info);
		}
		public void displayMonsterGUI(String info)
		{
			JOptionPane.showMessageDialog(null, "My monster information is:" + info);
		}
		public void displayMonsterAdGUI(String info)
		{
			JOptionPane.showMessageDialog(null, "Buy our product!!! " + info + " Buy while supplyes last");
			
		}
		public void displayNotVirusGUI(String info)
		{
			JOptionPane.showMessageDialog(null, "Press OK to share CC info to download defenetly NotAVirus AntiVirus Softwere today!!!!!!!!!!!");
		}

	}
