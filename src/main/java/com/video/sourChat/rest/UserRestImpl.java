package com.video.sourChat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.video.sourChat.model.User;
import com.video.sourChat.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserRestImpl {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/getAllUsersList")
	public List<User> getAllUsersList() {
		return userService.getAllUsersList();
	}

	@PostMapping("/createNewUser")
	public User createNewUser(@RequestBody User user) {
		return userService.createNewUser(user);
	}

	@PostMapping("/updateUserById")
	public User updateUserById(@RequestBody User user) {
		return userService.updateUserById(user);
	}

	@GetMapping("/findByFirstname")
	public List<User> findByFirstname(@RequestParam(name="firstname") String firstname) {
		return userService.findByFirstname(firstname);
	}

	@GetMapping("/findByLastname")
	public List<User> findByLastname(@RequestParam(name="lastname") String lastname) {
		return userService.findByLastname(lastname);
	}
}
