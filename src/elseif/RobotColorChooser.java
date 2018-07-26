//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		while (true) {
			rob.setPenWidth(10);
			rob.hide();
			rob.setSpeed(20);
			// 3. Ask the user what color they would like the robot to draw
			String answer = JOptionPane.showInputDialog("what color do you want your robot to draw?");
			// 5. Use an if/else statement to set the pen color that the user requested
			rob.penDown();
			if (answer.equals("red")) {
				rob.setPenColor(Color.red);
			}
			if (answer.equals("yellow")) {
				rob.setPenColor(Color.YELLOW);
			}
			if (answer.equals("blue")) {
				rob.setPenColor(Color.blue);
			} else if (answer.equals(null)) {
				rob.setRandomPenColor();
			}

			for (int i = 0; i < 4; i++) {
				rob.turn(90);
				rob.move(50);
			}

		}
		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}
