package com.ejemploWeb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemploWeb.domain.model.User;
import com.ejemploWeb.domain.ports.UserRepository;

@Service
public class FindAllUsersService {
	
	private UserRepository userRepository;

	public FindAllUsersService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAllUsers(){
		return userRepository.findAllUsers();
	}
	
}
