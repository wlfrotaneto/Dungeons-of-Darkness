package br.ucsal.rpg.model;

public class Evento {

	private Integer id;
	private String nome;
	private NPC npc;
	
	public Evento() {
		super();
	}

	public Evento(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public NPC getNpc() {
		return npc;
	}

	public void setNpc(NPC npc) {
		this.npc = npc;
	}
	
	public void setNpcId(Integer id) {
		npc.setId(id);
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
