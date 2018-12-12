package br.ucsal.rpg.model;

public class Status {

	private Integer id;
	private Integer saude;
	private Integer energia;
	
	public Status() {
		super();
	}

	public Status(Integer id, Integer saude, Integer energia) {
		super();
		this.id = id;
		this.saude = saude;
		this.energia = energia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSaude() {
		return saude;
	}

	public void setSaude(Integer saude) {
		this.saude = saude;
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
}
