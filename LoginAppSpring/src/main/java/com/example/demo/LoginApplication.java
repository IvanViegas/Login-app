package com.example.demo;

import com.example.demo.login.SQLrepository.UserRepository;
import com.example.demo.login.SQLservice.IUserservice;
import com.example.demo.login.SQLservice.User;
import com.example.demo.login.SQLservice.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner {

	@Autowired
	private IUserservice userService;
	private static final Logger logger = LoggerFactory.getLogger(LoginApplication.class);
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(LoginApplication.class, args);
		logger.info("Aplicación terminada");
	}

	@Override
	public void run(String... args) throws Exception {
		{
			boolean salir = true;
			Scanner sc = new Scanner(System.in);
			User user1;
			while (salir) {
				logger.info("Introduzca el tipo de interfaz que quiera ejecutar");
				logger.info(" 1. grafica \n 2. consola \n 3. salir");
				int opcion = sc.nextInt();
				switch (opcion) {
					default:
						salir = false;
						break;

					case 1: {
						System.out.println("hola mundo");
						break;

					}
					case 2: {
						logger.info("**** LoginApp ******");
						while (salir) {
							logger.info(" 1. listar usuario \n 2. ingresar usuario \n 3. crear usuario \n 4. eliminar usuario");
							opcion = sc.nextInt();
							switch (opcion) {
								default: {
									salir = false;
									break;
								}

								case 1: {
									var usuarios = userService.listarUsers();
									usuarios.forEach(System.out::println);
								}

								case 2: {
									logger.info("Ingrese nombre de usuario");
									String name = sc.next();
									logger.info("Ingrese contraseña");
									String password = sc.next();
									user1 = new User(null, name, password);
									userService.crearUser(user1);
								}
							}
						}
						break;
					}
				}


			}
		}
	}
}



