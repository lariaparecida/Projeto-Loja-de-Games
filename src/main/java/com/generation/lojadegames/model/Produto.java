package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo 'nome do produto' é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo 'nome do produto' deve conter no mínimo 5 e no máximo 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "O atributo 'descrição do produto' é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo 'descrição do produto' deve conter no mínimo 5 e no máximo 100 caracteres.")
	private String descricao;
	
	@NotNull(message = "O atributo 'preço do produto' é obrigatório!")
	@DecimalMin(value = "0.01", message = "O atributo 'preço do produto' deve ser um número decimal positivo, a partir de R$ 0.01 !")
	private BigDecimal preco;
	
	@NotNull(message = "O atributo 'quantidade em estoque' é obrigatório!")
	@Min(value = 0, message = "O atributo 'quantidade em estoque' deve ser um número positivo!")
	private Integer quantidade;

	//
	
	@ManyToOne
	@JsonIgnoreProperties("produto") 
	private Categoria categoria; 
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	//
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	//
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	//
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
