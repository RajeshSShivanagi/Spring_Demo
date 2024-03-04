package spring_demo_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
	
	@PostConstruct
	void installEngine( ) {
		
		System.out.println("Engine is installed");
	}

	@PreDestroy
     void scrap( ) {
		
		System.out.println("Car is Scrapped");
	}

}
