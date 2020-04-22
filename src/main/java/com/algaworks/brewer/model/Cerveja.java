package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message="SKU é obrigatório")
	private String sku;

	@NotBlank(message="Nome é obrigatório")
	private String nome;

	@Size(min=1,max = 50,message="O tamanho da descrição deve estar 1 a 50 caracteres")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "sku:" + sku + " - nome: "+nome;
	}
}
