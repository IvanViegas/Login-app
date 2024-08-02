package com.example.demo;

import com.example.demo.login.SQLservice.IUserservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

	@Autowired
	private IUserservice userService;
	private static final Logger logger = LoggerFactory.getLogger(LoginApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(LoginApplication.class, args);
		logger.info("Aplicación terminada");
	}

	public void run(String... args) throws Exception{
		{

		}
	}


}
