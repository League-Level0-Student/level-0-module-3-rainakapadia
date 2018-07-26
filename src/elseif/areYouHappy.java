package elseif;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("are you happy");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		} else if (answer.equals("no")) {
			String b = JOptionPane.showInputDialog("Do you want to be happy");
			if (b.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else if (b.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
			}
		}

	}
}
