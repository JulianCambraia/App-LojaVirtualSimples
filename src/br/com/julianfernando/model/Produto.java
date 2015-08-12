package br.com.julianfernando.model;

public class Produto {

	private String nome;
	
	private Double preco;
	
	private Boolean exibeProduto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Boolean getExibeProduto() {
		return exibeProduto;
	}

	public void setExibeProduto(Boolean exibeProduto) {
		this.exibeProduto = exibeProduto;
	}
}
