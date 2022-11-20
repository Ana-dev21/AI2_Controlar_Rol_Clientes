package com.edix.controlclientes.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.edix.controlclientes.model.beans.Event;
import com.edix.controlclientes.utils.CalendarManager;

public class EventImpl implements IntEventDao{
List<Event> events;
	
	public EventImpl() {
		events = new ArrayList<Event>();
		loadEvents();
	}

	private void loadEvents(){
		IntEventTypeDao eventTypes = new EventTypeImpl();
		
		events.add(new Event(1, "Boda María y Carlos", "Descripción Boda María y Carlos",CalendarManager.getDate(2022, 10, 3), 4, "Mallorca", "Activo",
				true, 300, 30, 60.55, eventTypes.findById(4)));
		events.add(new Event(2, "Despedida María", "Descripción Despedida María",CalendarManager.getDate(2022, 9, 3), 4, "Ibiza", null,
				true, 300, 30, 30.50, eventTypes.findById(2)));
		events.add(new Event(3, "Cumpleaños Javi", "Descripción Cumpleaños Javi",CalendarManager.getDate(2022, 4, 10), 4, "Mallorca", "Activo",
				true, 300, 30, 50, eventTypes.findById(3)));
	}
	
	
	public List<Event> getAll() {
		return events;
	}
	
	/**
	 * Método que recorre el listado de eventos y recoge los eventos activos
	 */
	public List<Event> getActive() {
		List<Event> activeEvents = new ArrayList<Event>();
		for (Event e : events) {
			if(e.getStatus()!=null && e.getStatus().toLowerCase().equals("activo")){
				activeEvents.add(e);
			}
		}
		return activeEvents;
	}
	
	/**
	 * Método que inserta un nuevo evento en el listado de eventos
	 */
	public int insert(Event event) {
		return events.add(event)?1:0;
	}

	/**
	 * Método que busca la posición del evento pasado por parámetro 
	 * y lo sustituye  por el mismo
	 */
	public int modify(Event event) {
		//El método set necesita la posición
		//la obtenemos
		int pos = events.indexOf(event);
		//si la posición es -1 no lo encuentra
		if (pos == -1)
			return 0;
		else
			return (events.set(pos, event) != null)?1:0;
	}
	
	/**
	 * Método que recupera un evento a partir de la posición del id pasado por parámetro
	 */
	public Event findById(int id) {	
		Event aux = new Event();
		aux.setId(id);
		int pos = events.indexOf(aux);
		if (pos == -1)
			return null;
		else
			return events.get(pos);
	}
	
	/**
	 * Método que elimina un evento del listado
	 */
	public int delete(Event event) {
		return events.remove(event)?1:0;
	}

}
