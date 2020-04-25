package com.ejemploWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploWeb.domain.model.User;
import com.ejemploWeb.services.FindAllUsersService;
import com.ejemploWeb.services.SaveUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.POST,RequestMethod.GET})
@RequestMapping("/user")
public class UserController {

	@Autowired
	private SaveUserService saveUserService;
	
	@Autowired
	private FindAllUsersService findAllUsersService;
	
	@PostMapping(value = "/guardarUsuario")
	public String saveUser(@RequestBody User user) {
		return saveUserService.saveUser(user);
	}
	
	@GetMapping(value = "/obtenerUsuarios")
	public List<User> findAllUsers(){
		return findAllUsersService.findAllUsers();
	}
}
