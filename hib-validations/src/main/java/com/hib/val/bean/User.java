package com.hib.val.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {

	@Size(min=2, max=5)
	private String name;
	
	@Email(message="Email not valid")
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
	public User() {
		super();
	}
	
}
