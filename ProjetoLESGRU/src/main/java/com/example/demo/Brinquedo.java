package com.example.demo;

public class Brinquedo {
	
	//Atributos
	private int code;
	private String nome;
	private Float peso;
	private Float preco;
	private String descricao;
	
	//Construtores
	public Brinquedo() {}
	
	public Brinquedo(int code, String nome, Float peso, Float preco, String descricao) {
		super();
		this.code = code;
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	//Getters 'n Setters
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
 
	//teste do krlh
}
