package com.video.sourChat.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.video.sourChat.model.User;
import com.video.sourChat.repository.UserRepository;

@Service
public class UserDaoImpl implements UserRepository {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void deleteAllInBatch() {
	}

	@Override
	public void deleteInBatch(Iterable<User> arg0) {
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findByFirstname(String firstname) {		
		return userRepository.findByFirstname(firstname);
	}

	@Override
	public List<User> findByLastname(String lastname) {
		return userRepository.findByLastname(lastname);
	}

	@Override
	public List<User> findByPhone(String phone) {		
		return userRepository.findByPhone(phone);
	}

	@Override
	public List<User> findByOrganization(String organization) {
		return userRepository.findByOrganization(organization);
	}

	@Override
	public List<User> findAll(Sort arg0) {
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0) {
		return null;
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> arg0, Sort arg1) {
		return null;
	}

	@Override
	public List<User> findAllById(Iterable<Integer> arg0) {
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public User getOne(Integer arg0) {
		return null;
	}

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> arg0) {
		return null;
	}

	@Override
	public <S extends User> S saveAndFlush(S arg0) {
		return null;
	}

	@Override
	public Page<User> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<User> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S arg0) {		
		return userRepository.save(arg0);
	}

	@Override
	public <S extends User> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends User> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
