package extra;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("what is you  zodiac sign?");
		if (a.equals("scorpio")) {
			JOptionPane.showMessageDialog(null,
					"The symbol for Scorpio is the scorpion. \nThis creature was chosen because it typifies many of the characteristics of this sign.\n The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative.");
		} else if (a.equals("libra")) {
			JOptionPane.showMessageDialog(null,
					"Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign. Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives.");
		} else {
			JOptionPane.showMessageDialog(null, "that is not a star sign");
		}

	}
}
