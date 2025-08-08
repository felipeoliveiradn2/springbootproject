package com.projectspringboot.projectspring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projectspringboot.projectspring.entities.User;
import com.projectspringboot.projectspring.repositories.UserRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner { // CommandLIneRunner para iniciar o testconfig quando o programa for iniciado
	
	@Autowired //injecao de dependencias associar userRepository no TestCOnfig
	private UserRepository userRepository;
		
	@Override
	public void run(String... args) throws Exception { //tudo dentro do run é executado quando a aplicação for iniciada
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
