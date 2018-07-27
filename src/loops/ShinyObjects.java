//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class ShinyObjects {
	public static void main(String[] args) {
		// 2. Ask the user how many shiny objects they want
		String a = JOptionPane.showInputDialog("how many objects do you want");
		int b = Integer.parseInt(a);
		// 3. Play the sound that many times
		for (int i = 0; i < b; i++) {
			// 1. Call the method below
			playMisterZee();
		}
	}

	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
