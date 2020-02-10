package com.sfe.cervejaria.model;

public enum Nacionalidade {

	i("Importado"), n("Nacional");

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private Nacionalidade(String descricao) {
		this.descricao = descricao;
	}
   
}
