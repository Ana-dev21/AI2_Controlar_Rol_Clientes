package com.edix.controlclientes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edix.controlclientes.model.beans.User;
import com.edix.controlclientes.model.repository.IntUserDao;

//import com.edix.controlclientes.model.repository.IntUserDao;

@Controller
@RequestMapping("/register")
public class UserHandler {
	//Atributes
	@Autowired
	private IntUserDao udao;
	
	//Mappings
	/**
	 * Borra la sesión y redirecciona a registro
	 * @param session
	 * @return
	 */
	@GetMapping("/logout")
		public String logOutUser (HttpSession session) {
		session.removeAttribute("user");
		return "register";
	}
	
	/**
	 * Comprueba que el los campos obligatorios no estén vacíos, que no exista el username 
	 * y si se cumple redirecciona a login que lleva a index. De lo contrario muestra el error correspondiente
	 * @param session
	 * @param user
	 * @param rattr
	 * @return
	 */
	@PostMapping("/newUser")
		public String registerUser (HttpSession session, User user, RedirectAttributes rattr) {
		
		if (udao.checkUserIsNotEmpty(user)) {
			if (!udao.validateUsername(user)) {
				udao.createUser(user);
				session.setAttribute("user", user);
				return "forward:/login";
			}
			else {
				rattr.addFlashAttribute("message", "El nombre de usuario indicado ya existe");
			}
		}else {
			rattr.addFlashAttribute("message", "Faltan datos por indicar");
		}
		
		return "redirect:/";
	}
	
	 
	 
	 
	
	

}
