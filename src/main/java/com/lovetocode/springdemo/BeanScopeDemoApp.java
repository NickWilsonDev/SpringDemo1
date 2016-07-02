package com.lovetocode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
			// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		// display results
		System.out.println("pointing to same coach " + result);
		System.out.println("memory location of theCoach " + theCoach);
		System.out.println("memory location of alphaCoach " + alphaCoach);
	}

}
