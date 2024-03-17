package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repo.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	public UserRepository userRepository;

	public User saveUser(User user) {
		log.info("Inside save method of UserService..");
		return userRepository.save(user);
	}

	public User findByUserId(Long id) {
		log.info("Inside find method of UserService..");
		return userRepository.findByUserId(id);
	}

}
