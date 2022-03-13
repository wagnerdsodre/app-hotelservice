package com.hotelgestao.gerencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelgestao.gerencia.models.User;
import com.hotelgestao.gerencia.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repo.findById(id);
		return user.get();
		
	}
	
	

}
