package com.edix.controlclientes.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edix.controlclientes.model.beans.Event;
import com.edix.controlclientes.model.repository.IntEventDao;

@Controller
public class EventsController {
	
	//Atributes
	@Autowired
	private IntEventDao edao;
	
	//Mappings
	/**
	 * Muestra los eventos, en el jsp filtra por activos
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/active")
	public String activeEvents(Model model, HttpSession session) {
		List<Event> eventsList = edao.getAll();
		model.addAttribute("eventsList",eventsList);
		return "active";
	}
	
	/**
	 * Muestra el detalle de evento con el formulario de reserva
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/detail/{id}")
	public String showEvent(Model model, @PathVariable("id") int id) {
		Event event = edao.findById(id);
		model.addAttribute("event",event);
		return "detail";
	}
	
	/**
	 * Muestra los eventos, en el jsp filtra por highlighted
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/highlighted")
	public String highlighted(Model model) {
		List<Event> eventsList = edao.getAll();
		model.addAttribute("eventsList",eventsList);
		return "highlighted";
	}
	
	

}
