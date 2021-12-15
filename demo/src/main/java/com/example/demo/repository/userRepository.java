package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;


@Repository
public interface userRepository extends JpaRepository<User, Long> {
	
	User findById(long id);

	}



