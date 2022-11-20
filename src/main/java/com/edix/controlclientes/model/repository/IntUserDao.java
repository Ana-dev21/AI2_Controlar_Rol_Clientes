package com.edix.controlclientes.model.repository;

import java.util.List;

import com.edix.controlclientes.model.beans.Booking;
import com.edix.controlclientes.model.beans.User;

public interface IntUserDao {
	List<Booking> getAllBookings();
	List<User> getActiveUsers();
	int validateUserPassword();
	int validateUser();
	
	
	
}
