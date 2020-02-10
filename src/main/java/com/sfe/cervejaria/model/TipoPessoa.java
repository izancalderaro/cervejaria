package com.sfe.cervejaria.model;

public enum TipoPessoa {

	f("Física"), j("Jurídica");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	private TipoPessoa(String descricao){
		this.descricao = descricao;
	}

	
}
