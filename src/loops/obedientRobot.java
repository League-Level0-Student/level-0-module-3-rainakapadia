package loops;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	Robot rob = new Robot();
	String c= JOptionPane.showInputDialog("color");
	void color() {
		if(c.equals("red")) {
			rob.setPenColor(Color.RED);
		}else if(c.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}
	}
	

	public static void main(String[] args) {
		String a =JOptionPane.showInputDialog("shape");
		
		
				obedientRobot r=new obedientRobot();
				
		if(a.equals("square")){
			r.drawSquare();
		}else if(a.equals("triangle")) {
			r.drawTriangle();
		}else if(a.equals("circle")) {
			r.drawCircle();
		}
		
	}

	  void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.turn(90);
			rob.move(30);
		}
	}
	 void drawTriangle() {
		
			 rob.penDown();
			 rob.turn(45);
			 rob.move(30);
			 rob.turn(90);
			 rob.move(30);
			 rob.turn(135);
			 rob.move(30);

		
		 
	 }
	 void drawCircle() {
		 for(int w=0;w<360;w++) {
			 rob.penDown();
			 rob.turn(1);
			 rob.move(5);
		 }
	 }
}
