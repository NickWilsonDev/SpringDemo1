package com.lovetocode.springdemo;

public class TrackCoach implements Coach {

	// define private field for dependency
	private FortuneService fortuneService;
		
	// define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to give fortune
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// custom init-method and destroy-method
	// must be public void methods
	public void doMyStartupStuff() {
		System.out.println("trackCoach: inside doMyStartupStuff()");
	}

	public void doMyCleanupStuff() {
		System.out.println("trackCoach: inside doMyCleanupStuff()");
	}

}
