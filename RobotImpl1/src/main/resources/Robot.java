package com.javabegin.training.spring.objects.src.main.resources;

import ru.javabegin.training.spring.objects.SonyHand;

public class Robot {

	private SonyHand hand = new SonyHand();
	private SonyLeg leg = new SonyLeg();
	private SonyHead head = new SonyHead();

	public void action() {
		head.calc();
		               hand.catchSomething();
		leg.go();
	}
}
