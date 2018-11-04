package com.mujib.airline.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujib.airline.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
