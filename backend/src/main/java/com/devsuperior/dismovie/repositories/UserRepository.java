package com.devsuperior.dismovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dismovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
