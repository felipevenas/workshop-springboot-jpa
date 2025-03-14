package com.felipevenas.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipevenas.course.entities.User;
import com.felipevenas.course.repositories.UserRepository;

@Configuration
@Profile("test") // Está acessando o perfil localizado no 'application.properties'.
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepostory;

	@Override // Esse método é executado sempre que a aplicação roda.
	public void run(String... args) throws Exception { 
		
		User u1 = new User(null, "Felipe Venas", "felipe@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Maria Farias", "maria@gmail.com", "977777777", "123456");
		
		userRepostory.saveAll(Arrays.asList(u1, u2));
		
	} 
	
	
	
}
