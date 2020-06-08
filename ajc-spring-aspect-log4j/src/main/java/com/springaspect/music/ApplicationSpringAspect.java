package com.springaspect.music;

import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationSpringAspect {
	@Autowired
    UserDao userDao;

    public void run() {
        userDao.addUser("tom", new User("Tom", "Waits", 100000));
    }
}
