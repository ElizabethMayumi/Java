package br.com.projetoTraveller;

public class Restaurante {
	private int id;
	private String fone;
	private String descrição;
	private String nome;
	private String email;
	
	
	public Restaurante() {
		super();
	}

	public Restaurante(int id, String fone, String descrição, String nome ,String email) {
		super();
		this.id = id;
		this.fone = fone;
		this.descrição = descrição;
		this.nome = nome;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
