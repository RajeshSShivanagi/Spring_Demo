package spring_demo_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Showroom {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
		
		
		System.out.println(context.getBean("car"));
		System.out.println(context.getBean(Car.class));
		
//		System.out.println(context.getBean("bus"));
	}

}
