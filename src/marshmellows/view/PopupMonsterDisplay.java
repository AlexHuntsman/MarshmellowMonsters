package marshmellows.view;

import javax.swing.JOptionPane;

public class PopupMonsterDisplay
	{
		public void displayMonsterConsole(String info)
		{
		
		}
		public void showResponce(String info)
		{
			JOptionPane.showMessageDialog(null, info);
		}
		public String grabAnswer(String stuff)
		{
			String answer = "";
			
			answer = JOptionPane.showInputDialog(null, stuff);
			
			return answer;
		}

	}
