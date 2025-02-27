package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoLesgruApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoLesgruApplication.class, args);
		System.out.print("Ola mundo");
	//Comentario teste
	}
	
  
	public String metodo1() {
		return "Metodo 1 excutado";
	}

	public String metodo2() {
		return "Metodo 2 executado";
	}
	
	public String metodo3() {
		return "Metodo 3 executado";
	}

	public void metodo4() {
		String s = "Laboratorio de Engenharia";
		System.out.print(s);
	}

	public Integer metodo5() {
		return 20 + 25;
  }

}