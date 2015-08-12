package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.julianfernando.model.Cliente;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private Cliente cliente = new Cliente();
	
	private Map<String, String> sexos = new LinkedHashMap<String, String>();
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	private boolean exibeMsgListaVazia = false; 
	
	public UsuarioBean() {
		super();
		sexos.put("Masculino","M");
		sexos.put("Feminino","F");
		sexos.put("Gay","G");
		sexos.put("Lésbica","L");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Map<String, String> getSexos() {
		return sexos;
	}

	public void setSexos(Map<String, String> sexos) {
		this.sexos = sexos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void preencheListCliente() {
		if (this.clientes.isEmpty()) {
			this.exibeMsgListaVazia = true;
		}
		
		clientes.add(this.getCliente());
		cliente = new Cliente();			
	}
	
	public void reset() {
		
	}

	public boolean isExibeMsgListaVazia() {
		return exibeMsgListaVazia;
	}

	public void setExibeMsgListaVazia(boolean exibeMsgListaVazia) {
		this.exibeMsgListaVazia = exibeMsgListaVazia;
	}
}
