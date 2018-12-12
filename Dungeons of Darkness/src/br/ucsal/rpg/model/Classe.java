package br.ucsal.rpg.model;

public class Classe {
	
	private Integer id;
	private String nome;
	private Integer buffEnergia;
	private Integer buffSaude;
	private String atributos;
	
	public Classe() {
		super();
	}

	public Classe(Integer id, String nome, Integer buffEnergia,Integer buffSaude, String atributos) {
		super();
		this.id = id;
		this.nome = nome;
		this.buffEnergia = buffEnergia;
		this.buffSaude = buffSaude;
		this.atributos = atributos;
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
	
	public Integer getBuffEnergia() {
		return buffEnergia;
	}

	public void setBuffEnergia(Integer buffEnergia) {
		this.buffEnergia = buffEnergia;
	}

	public Integer getBuffSaude() {
		return buffSaude;
	}

	public void setBuffSaude(Integer buffSaude) {
		this.buffSaude = buffSaude;
	}

	public String getAtributos() {
		return atributos;
	}
	
	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}
	
}
