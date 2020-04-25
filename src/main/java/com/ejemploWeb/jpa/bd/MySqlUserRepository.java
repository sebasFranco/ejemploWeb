package com.ejemploWeb.jpa.bd;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ejemploWeb.domain.model.User;
import com.ejemploWeb.domain.ports.UserRepository;
import com.ejemploWeb.jpa.jpaRepositoty.JpaUserRepository;

@Component
public class MySqlUserRepository implements UserRepository{
	private JpaUserRepository jpaUserRepository;

	public MySqlUserRepository(JpaUserRepository jpaUserRepository) {
		super();
		this.jpaUserRepository = jpaUserRepository;
	}

	@Override
	public String saveUser(User user) {
		try {
			jpaUserRepository.save(user);
			return "Usuario creado exitosamente";
		} catch (Exception e) {
			return "Usuario no creado";
		}
		
	}

	@Override
	public List<User> findAllUsers() {
		return jpaUserRepository.findAll();
	}
	
	
}
