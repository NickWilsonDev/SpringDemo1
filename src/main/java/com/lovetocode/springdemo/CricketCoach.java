package com.lovetocode.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add fields for setter injection
	private String emailAddress;
	
	private String team;
	
	// make a no argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter for email address for CricketCoach");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter for team for CricketCoach");
		this.team = team;
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
