package com.example.springjpa.springbootjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springjpa.springbootjpa.entity.User;
import com.example.springjpa.springbootjpa.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Ram", "Admin");
		long insert = userDaoService.insert(user);
		logger.info("New User created: " + user);
	}

}
