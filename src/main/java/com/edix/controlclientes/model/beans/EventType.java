package com.edix.controlclientes.model.beans;

import java.io.Serializable;

public class EventType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	
	
	//Constructors
	public EventType() {
		super();
	}

	public EventType(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.name = nombre;
		this.description = descripcion;
	}

	//Methods Hashcode & equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	//Getters & Setters
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EventType))
			return false;
		EventType other = (EventType) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}


