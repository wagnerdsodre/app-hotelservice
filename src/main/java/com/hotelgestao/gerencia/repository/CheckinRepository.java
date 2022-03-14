package com.hotelgestao.gerencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelgestao.gerencia.models.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Long> {

}
