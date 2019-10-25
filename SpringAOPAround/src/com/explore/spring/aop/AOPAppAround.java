package com.explore.spring.aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.services.TrafficFortuneService;


public class AOPAppAround {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		TrafficFortuneService fortuneService = ctxt.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("In AOPAppAround ");
		
		System.out.println("Calling getFortune()");
		
		String data= fortuneService.getFortune();
		
		System.out.println("Fortune is : "+data);
		
		System.out.println("Done!!!!");
		
		ctxt.close();


	}

}
