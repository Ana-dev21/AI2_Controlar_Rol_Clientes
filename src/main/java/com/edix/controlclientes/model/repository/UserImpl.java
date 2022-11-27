package com.edix.controlclientes.model.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.edix.controlclientes.model.beans.User;
import com.edix.controlclientes.utils.CalendarManager;

@Repository
public class UserImpl implements IntUserDao{
	List<User> users;
	
	public UserImpl() {
		users = new ArrayList<User>();
		loadUsers();
	}

	/**
	 * Carga los usuarios ya creados por defecto
	 */
	private void loadUsers() {
		users.add(new User(1, "ana.darvoy", "1234", "adarvoy@gmail.com", "Ana Darvoy Espigulé", 
				"Palma de Mallorca", 1, CalendarManager.getDate(2022, 11, 15)));	
		users.add(new User(1, "carlos.parra", "4321", "cparra@gmail.com", "Carlos Parra Martínez", 
				"Madrid", 1, CalendarManager.getDate(2022, 11, 16)));
	}
	
	/**
	 * Añade al listado de usuarios el usuario que se pasa por parámetro
	 */
	@Override
	public boolean createUser(User user) {
	
		return users.add(user);
	}


	/**
	 * Valida que el username pasado por parámetro exista 
	 * y que el password de ese user sea el mismo que el del user pasado por parámetro
	 */
	@Override
	public boolean validateUser(User userToCheck) {
		for (User user : users) {
			if (userToCheck.getUsername().equals(user.getUsername())
					&& userToCheck.getPassword().equals(user.getPassword())) {
				return true;				
			}
		}
		
		return false;
	}

	/**
	 * Comprueba si ese username ya corresponde a algun user
	 */
	@Override
	public boolean validateUsername(User userToCheck) {
		for (User user : users) {
			if (userToCheck.getUsername().equals(user.getUsername())){
				return true;				
			}
		}
		
		return false;
	}
	
	/**
	 * Comprueba que los campos nombre, usuario y password estén indicados
	 */
	@Override
	public boolean checkUserIsNotEmpty(User user){
		
		if (user.getName() != null
				&& user.getPassword() != null
				&& user.getUsername() != null) {
			return true;
		}
		
		return false;
		
	}

	
	
	
	
	
	
}
