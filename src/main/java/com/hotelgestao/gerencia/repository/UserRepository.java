package com.hotelgestao.gerencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelgestao.gerencia.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
