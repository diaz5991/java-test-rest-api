package com.test.rest.api.serviceTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.test.rest.api.model.User_model;
import com.test.rest.api.repository.User_repository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class User_Test {

	@Autowired
	User_repository userRepository;

	@Test
	public void saveUserTest() {
		User_model user = new User_model("Hector123", "Hector", "10/48/15", "male");

		User_model savedUser = userRepository.save(user);

		assertNotNull(savedUser);

	}

	@Test
	public void getUsersTest() {

		ArrayList<User_model> userList = (ArrayList<User_model>) userRepository.findAll();

		assertNotNull(userList);
	}

	@Test
	public void updateUserTest() {
		User_model user = new User_model(1, "Hector123", "Hector", "10/48/15", "male");

		User_model savedUser = userRepository.save(user);

		assertNotNull(savedUser);

	}

}
