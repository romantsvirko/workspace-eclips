package src.main.resources.start;

import src.main.resources.interfaces.Hand;

public class Robot {
	
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public Robot(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}
}

