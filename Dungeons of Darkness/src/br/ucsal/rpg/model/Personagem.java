package br.ucsal.rpg.model;

import java.util.List;

public class Personagem {
	
	private Integer id;
	private String nome;
	private Classe classe;
	private List<Item> itens;
	private Status status;
	private Historia historia;
	private Usuario usuario;

	public Personagem() {
		super();
	}

	public Personagem(Integer id, String nome) {
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
	
	public Historia getHistoria() {
		return historia;
	}

	public void setHistoria(Historia historia) {
		this.historia = historia;
	}

	public void setHistoriaId(Integer id) {
		historia.setId(id);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void setUsuarioId(Integer id) {
		usuario.setId(id);
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	public void setClasseId(Integer id) {
		classe.setId(id);
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
	
	public List<Item> getItens() {
		return itens;
	}
	
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void setItemId(Integer id) {
		itens.get(0).setId(id);
	}
			
}
