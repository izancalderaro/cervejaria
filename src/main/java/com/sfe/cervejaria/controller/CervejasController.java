package com.sfe.cervejaria.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Erro na validação do formulário");
		} 

		System.out.println(">>> sku: " + cerveja.getSku());
		return "cerveja/CadastroCerveja";		

	}

}
