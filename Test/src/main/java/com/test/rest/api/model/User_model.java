package com.test.rest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User_model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true, nullable = false)
	private String login;
	private String name;
	private String dob;
	private String Gender;

	public User_model() {
		super();
	}

	public User_model(Integer id, String login, String name, String dob, String gender) {
		super();
		this.id = id;
		this.login = login;
		this.name = name;
		this.dob = dob;
		Gender = gender;
	}

	
	public User_model(String login, String name, String dob, String gender) {
		super();
		this.login = login;
		this.name = name;
		this.dob = dob;
		Gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

}
