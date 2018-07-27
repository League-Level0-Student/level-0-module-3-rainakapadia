
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		
		
		// 1. Set the X position of the robot so that it starts on the left.
rob.setSpeed(200);
		rob.setX(20);
		rob.move(5);
		// You also need to show the robot to see the result of this line.
		rob.show();
		// 2. Make the robot draw a star shape. Hint: 144.
		for(int t=0;t<15;t++) {
			for (int i = 0; i < 5; i++) {
				rob.penDown();
			rob.turn(144);
			rob.move(30);

			// 3. Set the size of the star to 30.
		}
			rob.setAngle(90);
			rob.move(50);
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
