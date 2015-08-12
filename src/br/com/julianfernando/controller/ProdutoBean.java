package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.julianfernando.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {

	Produto produto = null;
	
	List<Produto> produtos = new ArrayList<Produto>();

	String mensgem = null;
	
	public ProdutoBean() {
		super();
		produto = new Produto();
		this.produto.setExibeProduto(true);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void gravarProduto() {
		try {
			this.produtos.add(getProduto());
			FacesMessage msg = new FacesMessage("Dados gravados com sucesso.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.produto = new Produto();
	}
	
	public String listarProdutos() {
		if (this.produtos.isEmpty()) {
			FacesMessage msg = new FacesMessage("Sem Dados para consulta.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		return "lista-de-produtos";
	}
	
	private void msg(FacesMessage mensagem) {
		FacesContext.getCurrentInstance().addMessage("lista-de-produtos:tb", mensagem);
		//FacesContext.getCurrentInstance().addMessage(mensagem, new FacesMessage(FacesMessage.SEVERITY_ERROR, null, null));
		
	}

	public String exibeMensagem() {
		String mensagem = "Adicione o produto ao carrinho para ver o preço.";
		return mensagem;
	}
}
