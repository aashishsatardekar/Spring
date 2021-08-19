package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define Private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "30 min batting";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortuneService to get fortune
		return fortuneService.getFotune();
	}
}
