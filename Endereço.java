package br.com.projetoTraveller;

public class Endereço  extends Cidade{
	private int id;
	private String logadouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	
	public Endereço(int id, String cidade, String estado, String siglaEstado, String pais, String siglaPais, int id2,
			String logadouro, int numero, String bairro, String cidade2, String cep) {
		super(id, cidade, estado, siglaEstado, pais, siglaPais);
		id = id2;
		this.logadouro = logadouro;
		this.numero = numero;
		this.bairro = bairro;
		cidade = cidade2;
		this.cep = cep;
	}

	public Endereço() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int i) {
		this.numero = i;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
