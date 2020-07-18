package com.video.sourChat.service;

import java.util.List;

import com.video.sourChat.model.User;

public interface IUserService {
	List<User> getAllUsersList();

	User createNewUser(User user);

	List<User> findByFirstname(String firstname);

	List<User> findByLastname(String lastname);

	User updateUserById(User user);
}
