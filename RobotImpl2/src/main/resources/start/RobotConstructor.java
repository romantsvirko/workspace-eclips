package src.main.resources.start;

import src.main.resources.sony.SonyHand;

public class RobotConstructor {
	
	public static void main(String[] args) {
		
		SonyHand sonyHand = new SonyHand();
		ToshibaLeg toshibaLeg = new ToshibaLeg();
		
		SonyHead sonyHead = new SonyHead();
		
		Robot robot = new Robot(sonyHand, toshibaLeg,sonyhead);
		robot.action();
	}		
}
