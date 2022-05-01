package br.com.projetoTraveller.testes;

import javax.swing.JOptionPane;

import br.com.projetoTraveller.Cidade;
import br.com.projetoTraveller.Endereço;

public class TesteEndereço  {

	public static void main(String[] args) {
		Endereço endereço = (Endereço) new Cidade();
		endereço.setLogadouro(JOptionPane.showInputDialog("Digite o logadouro:"));
		endereço.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		endereço.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero")));
		endereço.setBairro(JOptionPane.showInputDialog("Digite o bairro:"));
		endereço.setCep(JOptionPane.showInputDialog("Digite o cep:"));
		
		
		System.out.println(endereço.getLogadouro());
		System.out.println(endereço.getId());
		System.out.println(endereço.getNumero());
		System.out.println(endereço.getBairro());
		System.out.println(endereço.getCep());

	}

}
