
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robotDraw = new Robot();
		int e = 1;
		while (true) {
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robotDraw.setSpeed(50);
		robotDraw.penDown();
		robotDraw.move(50);
		robotDraw.turn(90);
		robotDraw.move(50);
		robotDraw.turn(90);
		robotDraw.move(50);
		robotDraw.turn(90);
		robotDraw.move(50);
		robotDraw.turn(90);
		
		//3. Set the pen width to 10
		robotDraw.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String answer = JOptionPane.showInputDialog(null, "What color would you like to draw with:");
		if (answer.equalsIgnoreCase("Red")) {
			robotDraw.setPenColor(Color.RED);
		}
		else if(answer.equalsIgnoreCase("Green")){
			robotDraw.setPenColor(Color.GREEN);
		}
		else if(answer.equalsIgnoreCase("Blue")) {
			robotDraw.setPenColor(Color.BLUE);
		}
		else if(answer.equalsIgnoreCase("Exit")) {
			break;}
		else{
			Random rand = new Random();
			int randomNum = rand.nextInt(3-1+1)+1;
			if (randomNum == 1) {
				robotDraw.setPenColor(Color.RED);
			}
			if (randomNum == 2) {
				robotDraw.setPenColor(Color.GREEN);
			}
			if (randomNum == 3) {
				robotDraw.setPenColor(Color.BLUE);
			}
		}
		}
			
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}

