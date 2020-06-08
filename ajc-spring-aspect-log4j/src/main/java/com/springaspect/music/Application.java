package com.springaspect.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBeanFactory().createBean(ApplicationSpringAspect.class).run();
        context.close();
	}

}
