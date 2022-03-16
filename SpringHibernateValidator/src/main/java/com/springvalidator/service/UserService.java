package com.springvalidator.service;

import com.springvalidator.entity.User;

public interface UserService {

	public User createUSer(User userDetails);

	public User checUsernameExist(String username);

}
