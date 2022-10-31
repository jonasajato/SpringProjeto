package com.senac.SpringProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProjetoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringProjetoApplication.class, args);
	}

	@GetMapping("/ola")
	public String digaOla(@RequestParam(value = "meuNome", defaultValue = "Sem Nome") String name)
 {
	return String.format("Olá %s!", name);
		}
}