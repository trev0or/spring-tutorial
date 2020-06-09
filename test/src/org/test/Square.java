package org.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Square implements Shape , BeanPostProcessor{

		private Point s1;
		private Point s2;
		private Point s3;
		private Point s4;
		public Point getS1() {
			return s1;
		}
		public void setS1(Point s1) {
			this.s1 = s1;
		}
		public Point getS2() {
			return s2;
		}
		public void setS2(Point s2) {
			this.s2 = s2;
		}
		public Point getS3() {
			return s3;
		}
		public void setS3(Point s3) {
			this.s3 = s3;
		}
		public Point getS4() {
			return s4;
		}
		public void setS4(Point s4) {
			this.s4 = s4;
		}
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println(s1.getX()+" "+s1.getY());
			
		}
		 public Object postProcessBeforeInitialization(Object bean, String beanName) 
			      throws BeansException {
			      
			      System.out.println("BeforeInitialization : " + beanName);
			      return bean;  // you can return any other object as well
			   }
		
		
}
