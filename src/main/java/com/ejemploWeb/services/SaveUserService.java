package com.ejemploWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemploWeb.domain.model.User;
import com.ejemploWeb.domain.ports.UserRepository;

@Service
public class SaveUserService {
	@Autowired
	private UserRepository userRepository;

	public SaveUserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String saveUser(User user) {
		return userRepository.saveUser(user);
	}
	
}
