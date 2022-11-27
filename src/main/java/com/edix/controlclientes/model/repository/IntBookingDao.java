package com.edix.controlclientes.model.repository;

import java.util.List;

import com.edix.controlclientes.model.beans.Booking;

public interface IntBookingDao {
	boolean createBooking(Booking booking, int eventId);
	List<Booking> getAllBookings();
	
}
