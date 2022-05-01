
package br.com.projetoTraveller;

public class Cardapio extends Cidade {
	private int id;
	private int valor;
	private String descrição;
	private String nome;

	
	public Cardapio(int id, String cidade, String estado, String siglaEstado, String pais, String siglaPais, int id2,
			int valor, String descrição, String nome) {
		super(id, cidade, estado, siglaEstado, pais, siglaPais);
		id = id2;
		this.valor = valor;
		this.descrição = descrição;
		this.nome = nome;
	}

	public Cardapio() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int i) {
		this.valor = i;
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

