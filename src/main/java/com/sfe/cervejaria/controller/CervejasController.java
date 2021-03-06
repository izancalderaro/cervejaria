package com.sfe.cervejaria.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sfe.cervejaria.model.Cerveja;

@Controller
public class CervejasController {

	// @RequestMapping("/cervejas/novo")
	// @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	// model.addAttribute(new Cerveja());
	// model.addAttribute("mensagem", result.getFieldErrors().toString());
	// model.addAttribute(cerveja);
	/*   if (logger.isDebugEnabled()) {
        	logger.debug("O objeto cerveja é:" + cerveja);                	
        }*/

	private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);
	
	@GetMapping("/cervejas/novo")
	public String CervejasNovo(Cerveja cerveja) {
		
        logger.error("the built-in ERROR level");
        

        return "cerveja/CadastroCerveja";
	}

	@PostMapping("/cervejas/novo")
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model,
			RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			return CervejasNovo(cerveja);
		}

	
		redirectAttributes.addFlashAttribute("mensagem", "Cerveja cadastrada com sucesso");
		return "redirect:/cervejas/novo";

	}
	
	@GetMapping("/cervejas/fragmentos")
	public String teste() {
		return "layout/Fragmentos";
	}

	@GetMapping("/clientes/novo")
	public String ClientesNovo() {
		return "cerveja/CadastroCliente";
	}
	
	@GetMapping("/usuarios/novo")
	public String UsuariosNovo() {
		return "cerveja/CadastroUsuario";
	}
	
	@GetMapping("/cidades/novo")
	public String CidadesNovo() {
		return "cerveja/CadastroCidade";
	}
	
	@GetMapping("/estilos/novo")
	public String EstiloNovo() {
		return "cerveja/CadastroEstilo";
	}
	
}
