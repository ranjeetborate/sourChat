package com.video.sourChat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.video.sourChat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByFirstname(String firstname);
	List<User> findByLastname(String lastname);
	List<User> findByPhone(String phone);
	List<User> findByOrganization(String organization);
	
}
