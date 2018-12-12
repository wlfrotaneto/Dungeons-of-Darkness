package br.ucsal.rpg.model;

import java.util.List;

public class Usuario {
	
	private Integer id;
	private String usuario;
	private String nome;
	private String senha;
	private String email;
	private Integer idade;
	private String sexo;
	private List<Personagem> personagens;
	
	public Usuario() {
		super();
	}

	public Usuario(Integer id, String usuario, String nome, String senha, String email, Integer idade, String sexo) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
