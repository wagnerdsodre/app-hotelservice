package com.hotelgestao.gerencia.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hotelgestao.gerencia.models.Checkin;
import com.hotelgestao.gerencia.models.User;
import com.hotelgestao.gerencia.repository.CheckinRepository;
import com.hotelgestao.gerencia.repository.UserRepository;

@Configuration
@Profile("test")
public class ModeTestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private CheckinRepository repocheckin;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Tom Jobim","tomjobim@gmail.com");
		User u2 = new User(null,"Bono Vox","bonovox@gmail.com");
		
		
		Checkin c1 = new Checkin(null, Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-22T19:53:07Z"), u1);
		Checkin c2 = new Checkin(null, Instant.parse("2019-06-25T03:42:10Z"),Instant.parse("2019-06-29T19:53:07Z"), u2);
		Checkin c3 = new Checkin(null, Instant.parse("2019-06-22T15:21:22Z"),Instant.parse("2019-06-22T19:53:07Z"), u1);
		
		repo.saveAll(Arrays.asList(u1,u2));
		repocheckin.saveAll(Arrays.asList(c1,c2,c3));
		
		
	}
	
	

}
