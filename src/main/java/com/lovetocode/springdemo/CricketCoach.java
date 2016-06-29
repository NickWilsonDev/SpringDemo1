package com.lovetocode.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// make a no argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach inside no-arg constructor");
	}
	
	
	// setter method for injections, called by spring when dependency is to be injected
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach inside setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
