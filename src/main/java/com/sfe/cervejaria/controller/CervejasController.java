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

	// @RequestMapping("/cervejas/novo")
	// @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	// model.addAttribute(new Cerveja());
	// model.addAttribute("mensagem", result.getFieldErrors().toString());
	// model.addAttribute(cerveja);

	@GetMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/CadastroCerveja";
	}

	@PostMapping("/cervejas/novo")
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model,
			RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			return novo(cerveja);
		}

	
		redirectAttributes.addFlashAttribute("mensagem", "Cerveja cadastrada com sucesso");
		return "redirect:/cervejas/novo";

	}

	
	
}
