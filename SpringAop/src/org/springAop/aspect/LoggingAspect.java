package org.springAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect {
	@Before("allGetters()  && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advicerun.");
	}
	
	@Before("allGetters() ")
	public void SecondAdvice() {
		System.out.println(" SecondAdvicerun.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	  @Pointcut("within(org.springAop.model.Circle)") 
	  public void  allCircleMethods() {}
	 
	 
	
	/*
	 * public class LoggingAspect {
	 * 
	 * @Before("execution(public String org.springAop.model.Circle.getName())")
	 * public void LoggingAdvice() { System.out.println("Advicerun."); }
	 */
		
}
