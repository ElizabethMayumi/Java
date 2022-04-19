package br.com.projetoTraveller.testes;

import br.com.projetoTraveller.Cardapio;
import br.com.projetoTraveller.Cidade;
import br.com.projetoTraveller.Endereço;
import br.com.projetoTraveller.Restaurante;

public class TestesCidade {

	public static void main(String[] args) {
		Cidade objeto = new Cidade();
			objeto.setCidade("São Paulo");
			objeto.setEstado("SP");
			objeto.setId(1);
			objeto.setPais("Brasil");
			objeto.setSiglaPais("BR");
			
			Endereço endereço = new Endereço();
			endereço.setLogadouro("AV. Paulista");
			endereço.setId(1);
			endereço.setNumero("123");
			endereço.setBairro("Aclimação");
			endereço.setCep("02335-000");
			
			
			Restaurante restaurante = new Restaurante();
			restaurante.setId(1);
			restaurante.setFone("65135-65135");
			restaurante.setNome("peixes");
			restaurante.setEmail("peixes@peixes.com.br");
			restaurante.setDescrição("restaurante de peixes");
			
			Cardapio cardapio = new Cardapio();
			cardapio.setNome("peixe");
			cardapio.setId(1);
			cardapio.setDescrição("peixe assado");
			cardapio.setValor("R$98.00");
			
			
			System.out.println(objeto.getCidade());
			System.out.println(objeto.getEstado());
			System.out.println(objeto.getId());
			System.out.println(objeto.getPais());
			System.out.println(objeto.getSiglaPais());
			System.out.println(endereço.getLogadouro());
			System.out.println(endereço.getId());
			System.out.println(endereço.getNumero());
			System.out.println(endereço.getBairro());
			System.out.println(endereço.getCep());
			System.out.println(cardapio.getNome());
			System.out.println(cardapio.getId());
			System.out.println(cardapio.getDescrição());
			System.out.println(cardapio.getValor());
	}

}
