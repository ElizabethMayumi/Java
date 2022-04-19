package br.com.projetoTraveller;

public class Cardapio {
	private int id;
	private String valor;
	private String descrição;
	private String nome;
	
	public Cardapio() {
		super();
	}
	public Cardapio(int id, String valor, String descrição, String nome) {
		super();
		this.id = id;
		this.valor = valor;
		this.descrição = descrição;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
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
