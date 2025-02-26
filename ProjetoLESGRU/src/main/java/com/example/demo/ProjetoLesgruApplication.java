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
	public String metodo1() {
		int i = 2;
		String s = "Rodrigadas";
		return i + s + "ta foda";
	}
	
	public Integer metodo2() {
		int soma;
		soma = 1 + 1;
		if(soma == 2) {return 2;}
		return 3;
  }
  
	public String joaoMetodo() {
		return "Vagabunda";
	}

}