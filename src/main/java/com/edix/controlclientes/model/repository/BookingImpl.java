package com.edix.controlclientes.model.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.controlclientes.model.beans.Booking;
import com.edix.controlclientes.model.beans.Event;

@Repository
public class BookingImpl implements IntBookingDao{
	
	@Autowired
	private IntEventDao edao;
	
	private List<Booking> bookings;
	
	public BookingImpl() {
		bookings = new ArrayList<Booking>();
	}

	/**
	 * Crea la reserva, asignando el evento que recupera por id
	 */
	@Override
	public boolean createBooking(Booking booking, int eventId) {
		
		Event event = edao.findById(eventId);
		
		booking.generateId();	
		booking.setEvent(event);
		
		return bookings.add(booking);
	}

	/**
	 * Recupera el listado de todas las reservas
	 */
	@Override
	public List<Booking> getAllBookings() {

		return bookings;
	}
	

}
