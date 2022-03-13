package com.hotelgestao.gerencia.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelgestao.gerencia.models.User;
import com.hotelgestao.gerencia.repository.UserRepository;

@RestController
@RequestMapping(value = "/api/user")
public class UserResources {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping
	public ResponseEntity<User>  findAll(){
		User u1 = new User(1L,"Wagner","wagner@gmail.com");
		return ResponseEntity.ok().body(u1);
	}

}
