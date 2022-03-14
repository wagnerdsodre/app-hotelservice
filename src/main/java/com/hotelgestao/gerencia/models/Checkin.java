package com.hotelgestao.gerencia.models;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Checkin implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Instant start;
	
	private Instant end;
	
	private long dias; 
	
	private Double estadia;
		
		
	@ManyToOne
	private User client;

	public Checkin(Long id, Instant start, Instant end, User client) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		d();
		this.estadia = estadia();
		this.client = client;
	}
	
	
	
	public long d() {
		Duration n = Duration.between(start, end);
		if(n.toDays() == 0 ) {
			return  dias = 1;
		}
		return  dias = n.toDays();
		
	}
	
	
	
	public Double estadia() {
		Double valor;
		return valor = d() * 120.0;
		
		
	}
	
	
	

}
