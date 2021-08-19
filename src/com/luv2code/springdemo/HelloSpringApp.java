package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve beans from spring container
		//avoid the class cast exception we pass Coach in getBean method
		//we can also do thid by this getBean("");
		Coach coach = context.getBean("myCoach", Coach.class);

		// call method on bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		// close the context
		context.close();
	}

}
