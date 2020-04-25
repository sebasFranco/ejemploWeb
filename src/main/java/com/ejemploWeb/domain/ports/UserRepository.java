package com.ejemploWeb.domain.ports;

import java.util.List;

import com.ejemploWeb.domain.model.User;

public interface UserRepository {

	public String saveUser(User user);
	
	public List<User> findAllUsers();
}
