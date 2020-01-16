package com.sfe.cervejaria.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sfe.cervejaria.model.Cerveja;

@Controller
public class CervejasController {

	/* @RequestMapping("/cervejas/novo") */
	@GetMapping("/cervejas/novo")
	public String novo() {
		System.out.println("get");
		return "cerveja/CadastroCerveja";
	}

//	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	@PostMapping("/cervejas/novo") 
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			model.addAttribute("mensagem", result.getFieldErrors().toString());			
			return "cerveja/CadastroCerveja";
		} 
		
		//Salvar no banco de dados
		
		redirectAttributes.addFlashAttribute("mensagem", "Cerveja cadastrada com sucesso");
		return "redirect:/cervejas/novo";		

	}

}
