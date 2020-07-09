package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		Robot[] robots = {new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
		//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[0].setY(550);
		robots[1].setY(550);
		robots[2].setY(550);
		robots[3].setY(550);
		robots[4].setY(550);
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(i*200+50);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(new Random().nextInt(50));
		}
		robots[0].move(505);
		robots[1].move(505);
		robots[2].move(505);
		robots[3].move(505);
		robots[4].move(505);
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}