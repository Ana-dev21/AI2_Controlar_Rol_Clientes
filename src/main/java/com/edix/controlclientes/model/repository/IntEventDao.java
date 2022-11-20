package com.edix.controlclientes.model.repository;
import java.util.List;

import com.edix.controlclientes.model.beans.Event;

public interface IntEventDao {
	List<Event> getAll();
	List<Event> getActive();
	int insert(Event event);
	int modify(Event event);
	int delete(Event event);
	Event findById(int id);	
}








