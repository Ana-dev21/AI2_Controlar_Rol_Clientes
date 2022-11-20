package com.edix.controlclientes.model.repository;

import com.edix.controlclientes.model.beans.Booking;

public class BookingImpl implements IntBookingDao{

	@Override
	public int insert(Booking booking) {
		// Debe comprobar que el número de asistentes es inferior a 10
		//(amount<=10) 
		return 0;
	}

}
