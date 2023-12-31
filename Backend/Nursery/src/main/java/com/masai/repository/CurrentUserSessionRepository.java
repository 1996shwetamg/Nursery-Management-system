package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.CurrentUserSession;



public interface CurrentUserSessionRepository extends JpaRepository<CurrentUserSession, Integer> {

	
	public  CurrentUserSession  findByToken(String token);
}
