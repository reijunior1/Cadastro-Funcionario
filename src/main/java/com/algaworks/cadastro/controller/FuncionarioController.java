package com.algaworks.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionarioController {
	
	@RequestMapping("/titulos/novo")
	public String novo() {
		return "CadastroFuncionario";
	}
}
