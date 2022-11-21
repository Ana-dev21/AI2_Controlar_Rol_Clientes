package com.edix.controlclientes.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.edix.controlclientes.model.repository.IntUserDao;

@Controller
@RequestMapping("/users")
public class UserHandler {
	//@Autowired
	//private IntUserDao udao;
	
	@GetMapping("/login")
		public String logInUser () {
		//TO-DO
		return "users";
	}
	
	@GetMapping("/logout")
		public String logOutUser () {
		//TO-DO
		return "users";
	}
	
	@GetMapping("/actives")
		public String exitSesion () {
		//TO-DO
		return "users";
	}
	
	@GetMapping("/Highlighted")
		public String getHighlightedEvents () {
		//TO-DO
		return "users";
	}
	
	@GetMapping("/detail/{id}")
	public String getDetail () {
	//TO-DO
	return "users";
}
	
	 @PostMapping("/reservar/{}id")
	 	public String sendBooking() { 
		//TO-DO  
		return "users";
	 }
	 
	 
	 
	
	

}
