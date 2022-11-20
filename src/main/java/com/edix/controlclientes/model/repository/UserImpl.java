package com.edix.controlclientes.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.edix.controlclientes.model.beans.Booking;
import com.edix.controlclientes.model.beans.User;
import com.edix.controlclientes.utils.CalendarManager;

public class UserImpl implements IntUserDao{
	List<User> users;
	
	public UserImpl() {
		users = new ArrayList<User>();
		loadUsers();
	}

	private void loadUsers() {
		users.add(new User(1, "ana.darvoy", null, "adarvoy@gmail.com", "Ana Darvoy Espigulé", 
				"Palma de Mallorca", 1, CalendarManager.getDate(2022, 11, 15)));	
		users.add(new User(1, "carlos.parra", null, "cparra@gmail.com", "Carlos Parra Martínez", 
				"Madrid", 1, CalendarManager.getDate(2022, 11, 16)));
	}

	@Override
	public List<Booking> getAllBookings() {
		// Método que devuelva todas las reservas activas (?) de ese usuario
		return null;
	}

	@Override
	public List<User> getActiveUsers() {
		// TODO (Es necesario?) Método que devuelve una lista de usuarios activos
		// Con esa info podemos validar el login
		return null;
	}

	@Override
	public int validateUserPassword() {
		// Método que valida el Password del Usuario
		// Revisar qué tipo de dato debe devolver
		return 0;
	}

	@Override
	public int validateUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
