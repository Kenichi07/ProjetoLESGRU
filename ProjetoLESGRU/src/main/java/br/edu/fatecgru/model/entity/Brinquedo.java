package br.edu.fatecgru.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brinquedo {
	
	//Atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	private String categoria;
	private String marca;
	private float preco;
	@Column(columnDefinition = "LONGTEXT")
	private String url;
	@Column(columnDefinition = "LONGTEXT")
	private String detalhes;
	
	//Construtores
	public Brinquedo() {}

	public Brinquedo(int id, String descricao, String categoria, String marca, float preco, String url,
			String detalhes) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
		this.url = url;
		this.detalhes = detalhes;
	}

	//Getters 'n Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
