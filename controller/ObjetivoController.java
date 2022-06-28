package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivoController {
	@GetMapping
	public String objetivo() {
		return "Aprimorar minhas habilidades "
				+ "pessoais para que assim eu consiga "
				+ "atender às necessidades do mercado de "
				+ "trabalho de modo efetivo.";
	}

}
