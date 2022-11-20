package com.edix.controlclientes.model.repository;

import com.edix.controlclientes.model.beans.EventType;

/**
 * 
 * @author adarv
 *
 * Se ha creado esta Interface para poder recuperar los tipos de evento 
 * al crear Eventos
 */
public interface IntEventTypeDao {
	
	EventType findById(int id);


}
