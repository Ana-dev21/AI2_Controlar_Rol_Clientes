package com.edix.controlclientes.model.beans;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String description;
	private Date startDate;
	private int duration;
	private String location;
	private String status;
	private boolean highlighted;
	private int maxCapacity;
	private int minAttendants;
	private double price;
	private EventType eventType;
	
	
	//Constructors
	public Event() {
		super();
	}
	
	public Event(int id, String name, String description, Date startDate, int duration, String location, String status,
			boolean highlighted, int maxCapacity, int minAttendants, double price, EventType eventType) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.duration = duration;
		this.location = location;
		this.status = status;
		this.highlighted = highlighted;
		this.maxCapacity = maxCapacity;
		this.minAttendants = minAttendants;
		this.price = price;
		this.eventType = eventType;
	}

	//HashCode & equals methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Event))
			return false;
		Event other = (Event) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	//Getters & setters
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isHighlighted() {
		return highlighted;
	}
	public void setHighlighted(boolean highlighted) {
		this.highlighted = highlighted;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public int getMinAttendants() {
		return minAttendants;
	}
	public void setMinAttendants(int minAttendants) {
		this.minAttendants = minAttendants;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	//to String
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", duration=" + duration + ", location=" + location + ", status=" + status + ", highlighted="
				+ highlighted + ", maxCapacity=" + maxCapacity + ", minAttendants=" + minAttendants + ", price=" + price
				+ ", eventType=" + eventType + "]";
	}
	
}


