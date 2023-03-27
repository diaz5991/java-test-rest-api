package com.test.rest.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.api.model.User_model;
import com.test.rest.api.service.User_service;

@RestController
@RequestMapping("user")
public class User_controller {

	@Autowired
	User_service userService;

	@GetMapping("getUsers")
	public ArrayList<User_model> getUsers() {

		return userService.getUsers();
	}

	@PostMapping("saveUser")
	public User_model saveUser(@RequestBody User_model user) {

		return userService.saveUser(user);

	}

	@PutMapping("updateUser")
	public User_model updateUser(@RequestBody User_model user) {

		return userService.updateUser(user);

	}

	@DeleteMapping("deleteUser/{id}")
	public void deleteUser(@PathVariable Integer id) {

		userService.deleteUserById(id);
	}

}
