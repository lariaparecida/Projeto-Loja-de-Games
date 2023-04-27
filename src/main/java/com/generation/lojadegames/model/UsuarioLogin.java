package com.generation.lojadegames.model;

public class UsuarioLogin {
	
	private Long id;
	private String nomeUser;
	private String usuario;
	private String senha;
	private String foto;
	private String token;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUser() {
		return this.nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}