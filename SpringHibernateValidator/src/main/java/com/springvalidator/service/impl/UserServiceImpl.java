package com.springvalidator.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springvalidator.entity.User;
import com.springvalidator.repository.UserRepository;
import com.springvalidator.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUSer(User userDetails) {

		Long userId = userRepository.getUserId();
		userDetails.setUserId(userId + 1);

		String createdBy = "Test";
		userDetails.setCreatedBy(createdBy);

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		userDetails.setCreatedDate(timestamp);

		return userRepository.save(userDetails);
	}

	@Override
	public User checUsernameExist(String username) {
		return userRepository.checUsernameExist(username);
	}

}
