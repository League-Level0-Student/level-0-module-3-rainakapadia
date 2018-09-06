package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot r= new Robot();
	
public static void main(String[] args) {
	r.penDown();
	String c= JOptionPane.showInputDialog("what color do you want?");
	if(c.equals("red")) {
		r.setPenColor(Color.red );
		
	} else if(c.equals("blue")) {
		r.setPenColor(Color.BLUE);
	}else if(c.equals("green")) {
		r.setPenColor(Color.green);
	}
	r.setSpeed(200);
	String a= JOptionPane.showInputDialog(null, "what shape do you want to draw?");
	if(a.equals("square")) {
	drawSquare();
	}else if (a.equals("triangle")) {
	drawTriangle();
	}else if (a.equals("circle")) {
	drawCircle();
	

}
}
static void drawSquare() {
	
		for(int i=0;i<4;i++) {
			r.move(100);
			r.turn(90);
		}
}
static void drawTriangle() {
 for(int t=0;t<3;t++) {
	r.move(100);
	r.turn(120);
}
}
 static void drawCircle() {
	 for(int c=0;c<360;c++) {
		 r.move(1);
		 r.turn(1);
	 }
 }
	
}
