package org.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	
	private Point center;
	//private String dmsg = "default";
	@Autowired
	private MessageSource messageSource;
	public Point getCenter() {
		return center;
	}	
/*	study  of required annotation
 * @SuppressWarnings("deprecation")
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
*/	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("circlerelated") public void setCenter(Point center) { this.center
	 * = center; }
	 */
	
	
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		//System.out.println(this.messageSource.getMessage("draw.circle",null,"dmsg",null));
		System.out.println("center :- "+ center.getX()+" "+center.getY());
		//System.out.println(this.messageSource.getMessage("greeting",null,"ddd",null));
		
		
	}
	public void init() {
		System.out.println("initialized");
	}
	
	public void destroy() {
		System.out.println("destroyed");
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}


	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
