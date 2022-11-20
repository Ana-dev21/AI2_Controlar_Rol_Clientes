package com.edix.controlclientes.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idUser;
	private String username;
	private String password;
	private String email;
	private String name;
	private String location;
	private int enabled;
	private Date registrationDate;
	private List<Booking> bookings;
	
	//Constructor
	public User() {
		super();
	}
	
	public User(int idUser, String username, String password, String email, String name, String location, int enabled,
			Date registrationDate) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.location = location;
		this.enabled = enabled;
		this.registrationDate = registrationDate;
	}

	//Getters & Setters
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	//For Lists & Sets
	@Override
	public int hashCode() {
		return Objects.hash(idUser);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		return idUser == other.idUser;
	}

	//To String
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", name=" + name + ", location=" + location + ", enabled=" + enabled + ", registrationDate="
				+ registrationDate + "]";
	}


	
	
	
	

}
