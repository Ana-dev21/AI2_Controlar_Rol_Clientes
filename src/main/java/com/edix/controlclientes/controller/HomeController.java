package com.edix.controlclientes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edix.controlclientes.model.beans.User;
import com.edix.controlclientes.model.repository.IntUserDao;

@Controller
public class HomeController {
	// Atributes
	@Autowired
	private IntUserDao udao;

	// Mappings
	/**
	 * Redirecciona a registro
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String procHome(Model model) {
		return "register";
	}

	/**
	 * Redirecciona a la pantalla de login
	 * @param model
	 * @return
	 */
	@GetMapping("/login")
	public String procLoginGet(Model model) {
		return "login";
	}

	/**
	 * Comprueba si hay una sesión, si devuelve true, redirecciona a la pantalla principal. 
	 * Si no, a la pantalla de login
	 * @param session
	 * @param model
	 * @return
	 */
	@GetMapping("/index")
	public String procIndex(HttpSession session, Model model) {		
		if (checkUserSession(session)) {
			return "index";
		}
		return "login";
	}

	/**
	 * Método de logueo. Comprueba si el usuario es valido(el user y passwords son correctos) 
	 * y  si no tiene session(si viene de registro, ya estará creada la genera  
	 * @param session
	 * @param rattr
	 * @param user
	 * @return
	 */
	@PostMapping("/login")
	public String procLoginPost(HttpSession session, RedirectAttributes rattr, User user) {
		if (udao.validateUser(user)) {					
			if (!checkUserSession(session))session.setAttribute("user", user);		
			return "index";
		} else {
			rattr.addFlashAttribute("message", "Usuario incorrecto");
		}

		return "redirect:/login";
	}
	
	/**
	 * Comprueba que hay una sesión creada
	 * @param session
	 * @return 
	 */
	private boolean checkUserSession(HttpSession session) {
		
		User user = (User) session.getAttribute("user");		
		return user != null;
	}

}
