package com.video.sourChat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.video.sourChat.dao.impl.UserDaoImpl;
import com.video.sourChat.model.User;
import com.video.sourChat.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Override
	public List<User> getAllUsersList() {
		return userDaoImpl.findAll();
	}

	@Override
	public User createNewUser(User user) {
		return userDaoImpl.save(user);
	}

	@Override
	public List<User> findByFirstname(String firstname) {		
		return userDaoImpl.findByFirstname(firstname);
	}

	@Override
	public List<User> findByLastname(String lastname) {
		return userDaoImpl.findByLastname(lastname);
	}

	@Override
	public User updateUserById(User user) {
		return userDaoImpl.save(user);
	}

}
