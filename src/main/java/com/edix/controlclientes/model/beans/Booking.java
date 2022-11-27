package com.edix.controlclientes.model.beans;

import java.util.UUID;

public class Booking {
	public int id;
	public int eventId;
	public User user;
	public Event event;
	public Double price;
	public String observation;
	public int amount;
	
	
	public Booking() {
		super();
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}
	public void generateId() {
		this.id = UUID.randomUUID().hashCode();
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", eventId=" + eventId + ", user=" + user + ", event=" + event + ", price=" + price
				+ ", observation=" + observation + ", amount=" + amount + "]";
	}

	
	
}
