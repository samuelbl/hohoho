package br.com.hohoho.modelo;

import br.com.hohoho.modelo.BaseEntity;

public class Usuario extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String email;
	private String senha;
	
	public Usuario() {
		this("", "");
	}

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public void setId(Long id) {
		this.id = id; 
		
	}
}
