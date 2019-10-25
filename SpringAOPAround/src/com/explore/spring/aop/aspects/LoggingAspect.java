package com.explore.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Around("execution(* com.explore.spring.aop.services.TrafficFortuneService.getFortune(..))")
	public Object aroundGetFortuneAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		String method = proceedingJoinPoint.getSignature().toShortString();
		
		System.out.println("Intercepted method is : "+method);
		
		long begin = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		
		long end=  System.currentTimeMillis();
		
		long duration=end-begin;
		
		System.out.println("Duration is --->"+duration/1000.0 +"Seconds");
		
		
		
		return result;
		
	}
		

}
