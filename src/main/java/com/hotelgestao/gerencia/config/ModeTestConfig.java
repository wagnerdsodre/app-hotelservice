package com.hotelgestao.gerencia.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hotelgestao.gerencia.models.User;
import com.hotelgestao.gerencia.repository.UserRepository;

@Configuration
@Profile("test")
public class ModeTestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Tom Jobim","tomjobim@gmail.com");
		User u2 = new User(null,"Bono Vox","bonovox@gmail.com");
		repo.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
