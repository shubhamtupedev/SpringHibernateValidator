package com.springvalidator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springvalidator.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT COALESCE(MAX(userId),0) FROM User")
	public Long getUserId();
	
	@Query("SELECT u FROM User u WHERE u.username=:username")
	public User checUsernameExist(String username);

}
