package br.ucsal.rpg.model;

import java.util.List;

public class NPC {

	private Integer id;
	private String nome;
	private Status status;
	private List<Item> itens;
	
	public NPC() {
		super();
	}

	public NPC(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setStatusId(Integer id) {
		status.setId(id);
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setItemId(Integer id) {
		itens.get(0).setId(id);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
