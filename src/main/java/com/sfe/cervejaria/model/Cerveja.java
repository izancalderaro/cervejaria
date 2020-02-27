package com.sfe.cervejaria.model;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;


public class Cerveja {
    
	@NotBlank(message = "SKU obrigatório")
	public String sku;
	
	@NotBlank(message = "Nome obrigatório")
	public String nome;
	
	@Size(min = 20, max = 300, message = "Descrição deve ter entre 20 e 300 caracteres")
	public String descricao;
	
	@NotBlank(message="Estilo obrigatório")
	public String estilo;
	
	@NotBlank(message="Sabor obrigatório")
	public String sabor;
	
	@NotNull(message="Teor obrigatório")	
	public Byte teor;
	
	@NotNull(message="Origem obrigatória")
	public Character origem;

	@NotNull(message="Preço obrigatório")
	@DecimalMin(value="0.01", message="Preço unitário não pode ser menor que 0,01")
	@DecimalMax(value="9999999.99", message="Preço unitário não pode ser maior que R$ 9.999.999,00")	
	@NumberFormat(pattern="#,##0.00")	
	public BigDecimal preco;
	
	@DecimalMin(value="2", message="Comissão não pode ser menor que 2%")
	@DecimalMax(value="100", message="Comissão não pode ser maior que 100%")	
	@NotNull(message="Comissão obrigatório")	
	public Byte comissao;
	
	@DecimalMin(value="2", message="Estoque não pode ser menor que 2%")
	@DecimalMax(value="100", message="Comissão não pode ser maior que 100%")	
	@NotNull(message="Estoque obrigatório")
	public Short estoque;

	
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Byte getTeor() {
		return teor;
	}

	public void setTeor(Byte teor) {
		this.teor = teor;
	}

	public Character getOrigem() {
		return origem;
	}

	public void setOrigem(Character origem) {
		this.origem = origem;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Byte getComissao() {
		return comissao;
	}

	public void setComissao(Byte comissao) {
		this.comissao = comissao;
	}

	public Short getEstoque() {
		return estoque;
	}

	public void setEstoque(Short estoque) {
		this.estoque = estoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerveja other = (Cerveja) obj;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		return true;
	}

	
	

	
}
