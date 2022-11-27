package com.edix.controlclientes.model.repository;

import com.edix.controlclientes.model.beans.User;

public interface IntUserDao {
	boolean validateUser(User user);
	boolean createUser(User user);
	boolean validateUsername(User user);
	public boolean checkUserIsNotEmpty(User user);
	
	
	
}
