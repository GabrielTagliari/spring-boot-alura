package br.com.alura.listavip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrei no controller");
		return "index";
	}
}