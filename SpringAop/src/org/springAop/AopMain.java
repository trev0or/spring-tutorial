package org.springAop;

import org.springAop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ShapeService shapeService =context.getBean("shapeservice",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getCircle().message());
	}

}
