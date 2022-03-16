package com.springvalidator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class User extends AuditModel {

	@Id
	private long userId;

	@NotEmpty(message = "firstname should not be empty")
	private String firstName;

	@NotEmpty(message = "lastname should not be empty")
	private String lastName;

	@NotEmpty(message = "email should not be empty")
	@Email(message = "Please check your email address")
	private String email;

	@NotEmpty(message = "username should not be empty")
	@Pattern(regexp = "^[A-Za-z]\\w{5,29}$", message = "Please check your username")
	private String username;

	@NotEmpty(message = "password should not be empty")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", message = "Please check your password")
	private String password;

	@NotEmpty
	@Pattern(regexp = "^\\d{10}$", message = "Please check your mobile number")
	private String phoneNumber;

	public User() {
		super();
	}

	public User(long userId, String firstName, String lastName, String email, String username, String password,
			String phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}

}
