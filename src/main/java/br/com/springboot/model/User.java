package br.com.springboot.model;

public class User {

  private Long id;
  private String name;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

  public String getNome() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
  
}
