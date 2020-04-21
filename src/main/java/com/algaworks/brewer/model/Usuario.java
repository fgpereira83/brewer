package com.algaworks.brewer.model;

import java.util.Date;

public class Usuario {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	public Boolean getVendedor() {
		return vendedor;
	}

	public void setVendedor(Boolean vendedor) {
		this.vendedor = vendedor;
	}

	private String nome;
	private String email;
	private Date dataNascimento;
	private String senha;
	private Boolean status;
	private Boolean administrador;
	private Boolean vendedor;
}
