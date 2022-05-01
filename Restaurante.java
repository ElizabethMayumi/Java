package br.com.projetoTraveller;

public class Restaurante extends Cidade {
	private int id;
	private String fone;
	private String descrição;
	private String nome;
	private String email;
	
	
	public Restaurante(int id, String cidade, String estado, String siglaEstado, String pais, String siglaPais, int id2,
			String fone, String descrição, String nome, String email) {
		super(id, cidade, estado, siglaEstado, pais, siglaPais);
		id = id2;
		this.fone = fone;
		this.descrição = descrição;
		this.nome = nome;
		this.email = email;
	}


	public Restaurante() {
		super();
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
