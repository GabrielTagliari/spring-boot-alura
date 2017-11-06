package br.com.alura.listavip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alura.enviadorEmail.enviadorEmail.EmailService;
import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;
import br.com.alura.listavip.service.ConvidadoService;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoService convidadoService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/listaconvidados")
	public String lista(Model model) {
		Iterable<Convidado> convidados = convidadoService.findAllConvidados();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}
	
	@RequestMapping(value="salvar", method=RequestMethod.POST)
	public String salvar(Convidado convidado, Model model) {
		convidadoService.salvar(convidado);
		
		convidadoService.enviarEmail(convidado);
		
		return lista(model);
	}
}
