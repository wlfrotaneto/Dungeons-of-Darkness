package br.ucsal.rpg.model;

public class Item {

	private Integer id;
	private String nome;
	private Integer dano;
	private Classe classe;
	
	public Item() {
		super();
	}

	public Item(Integer id, String nome, Integer dano) {
		super();
		this.id = id;
		this.nome = nome;
		this.dano = dano;
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

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}
	
}
