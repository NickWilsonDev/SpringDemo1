package com.lovetocode.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting cage";
	}
}
