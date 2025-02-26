package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoLesgruApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoLesgruApplication.class, args);
	//alteração 
		System.out.print("Ola mundo");
	//Oia a cagada para fazer esse projeto meu cria 
	}
	//para de travar caralho
  
	public String joaoMetodo() {
		return "Vagabunda";
	}

	public String CoringadaMetodo() {
		return "Não aguento mais saporra";
	}

	public void metodo3() {
		String s = "todo dia tem uma merda";
	}
}