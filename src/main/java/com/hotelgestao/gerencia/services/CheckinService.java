package com.hotelgestao.gerencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelgestao.gerencia.models.Checkin;
import com.hotelgestao.gerencia.repository.CheckinRepository;

@Service
public class CheckinService {
	
	@Autowired
	private CheckinRepository repoCheckin;
	
	public List<Checkin> findAll(){
		return repoCheckin.findAll();
	}
	
	public Checkin findById(Long id) {
		Optional<Checkin> checkin = repoCheckin.findById(id);
		return checkin.get();
		
	}
	
	

}
