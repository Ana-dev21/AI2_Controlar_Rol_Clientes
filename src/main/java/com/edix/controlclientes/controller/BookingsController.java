package com.edix.controlclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edix.controlclientes.model.beans.Booking;
import com.edix.controlclientes.model.repository.IntBookingDao;

@Controller
public class BookingsController {
	
	//Atributos
	@Autowired
	private IntBookingDao bdao;
	
	//Mappings
	/**
	 * Crea la reserva y muestra el mensaje de exito/error 
	 * @param id
	 * @param booking
	 * @param rattr
	 * @return
	 */
	@PostMapping("booking/{id}")
	public String bookEvent(@PathVariable("id") int id, Booking booking, RedirectAttributes rattr ) {
		if (bdao.createBooking(booking, id)) {
			rattr.addFlashAttribute("mensaje","Tu Reserva se ha realizado con éxito");
		}
		else {
			rattr.addFlashAttribute("mensaje","Lo sentimos, no se ha podido realizar la reserva");	
		}
		return "redirect:/confirmation";
	}
	
	/**
	 * Muestra una página de con la confirmación de la reserva
	 * @param model
	 * @return
	 */
	@GetMapping("/confirmation")
	public String bookingConfirmation(Model model) {
		return "confirmation";
	}
	
	/**
	 * Muestra todas las reservas creadas
	 * @param model
	 * @return
	 */
	@GetMapping("/bookings")
	public String showEvent(Model model) {
		List<Booking> allBookings = bdao.getAllBookings();
		model.addAttribute("bookings", allBookings);
		return "bookings";
	}
}
