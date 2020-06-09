package org.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle t = new Triangle();
		@SuppressWarnings("deprecation")
		//BeanFactory factory =new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		//Triangle triangle= (Triangle)factory.getBean("triangle");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		context.start();
		Shape shape1= (Shape)context.getBean("circle");
		shape1.draw();
		//Shape shape= (Shape)context.getBean("triangle"); 
		//shape.draw();
	//	System.out.println(context.getMessage("draw.msg",null,"default draw msg",null));
		context.registerShutdownHook();
		//System.out.println(context.getMessage("greeting", null,"msg",null));
	}
		 
}
