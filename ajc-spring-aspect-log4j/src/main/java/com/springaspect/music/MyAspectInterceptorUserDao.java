package com.springaspect.music;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class MyAspectInterceptorUserDao {
	
	private static final Logger logger = LogManager.getLogger(Application.class);
	
	@Before("execution(* com.springaspect.music.UserDao.addUser(..))")
	public void interceptAddUser() {
		System.out.println("Before - UserDao addUser");

		if (logger.isDebugEnabled()) {
            logger.debug("{}", "Before - UserDao addUser - from log4j");
        }
	}
	
}
