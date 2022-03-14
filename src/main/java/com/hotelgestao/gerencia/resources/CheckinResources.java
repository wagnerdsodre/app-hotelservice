package com.hotelgestao.gerencia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hotelgestao.gerencia.models.Checkin;
import com.hotelgestao.gerencia.services.CheckinService;

@RestController
@RequestMapping(value = "/checkins")
public class CheckinResources {
	
	@Autowired
	private CheckinService service;
	
	@GetMapping
	public ResponseEntity<List<Checkin>>  findAll(){
		List<Checkin> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Checkin> findById(@PathVariable Long id) {
		Checkin obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
