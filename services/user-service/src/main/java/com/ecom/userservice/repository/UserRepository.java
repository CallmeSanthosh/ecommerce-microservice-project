package com.ecom.userservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.userservice.entity.AccountStatus;
import com.ecom.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);
	boolean existsByEmail(String email);
	boolean existsByUsername(String username);
    List<User> findByAccountStatus(AccountStatus status);	
}
