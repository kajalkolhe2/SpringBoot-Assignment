package com.example.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}

