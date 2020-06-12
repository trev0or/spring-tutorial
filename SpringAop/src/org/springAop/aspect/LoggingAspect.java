package org.springAop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class LoggingAspect {
	@Before("allGetters()  && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advicerun.");
		// System.out.println("Method Signature: "  + jp.getClass());  
	}
	
	@Before("allGetters() ")
	public void SecondAdvice() {
		System.out.println(" SecondAdvicerun.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	  @Pointcut("within(org.springAop.model.Circle)") 
	  public void  allCircleMethods() {}
	 
	 @AfterReturning(pointcut="execution(* message())" , returning="res")
	 public void afterReturingadvice(Object res) {
		 System.out.println("afterReturingadvice run");
		 System.out.println(res);
	 }
	 
	
	/*
	 * public class LoggingAspect {
	 * 
	 * @Before("execution(public String org.springAop.model.Circle.getName())")
	 * public void LoggingAdvice() { System.out.println("Advicerun."); }
	 */
		
}
