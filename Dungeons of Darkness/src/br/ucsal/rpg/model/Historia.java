package br.ucsal.rpg.model;

public class Historia {

	private Integer id;
	private String texto;
	private Evento evento;
	
	public Historia() {
		super();
	}

	public Historia(Integer id, String texto) {
		super();
		this.id = id;
		this.texto = texto;
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public void setEventoId(Integer id) {
		evento.setId(id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
