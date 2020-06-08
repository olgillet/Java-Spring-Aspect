package com.springaspect.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//2 versions : 
			// 1
		//myContext.getBeanFactory().createBean(ApplicationSpringAspect.class).run();
		
			// 2
		UserDao userDao = myContext.getBean("userDao", UserDao.class);
		userDao.addUser("tim", new User("Tim", "Porter", 456456));
		
		myContext.close();
	}

}
