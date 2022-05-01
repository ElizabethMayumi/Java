package br.com.projetoTraveller.testes;

import javax.swing.JOptionPane;

import br.com.projetoTraveller.Cardapio;
import br.com.projetoTraveller.Cidade;

public class TesteCardapio {

	public static void main(String[] args) {
		Cardapio cardapio = (Cardapio) new Cidade();
		cardapio.setNome(JOptionPane.showInputDialog("Digite o logadouro:"));
		cardapio.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		cardapio.setDescrição(JOptionPane.showInputDialog("Digite o logadouro:"));
		cardapio.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		
		
		System.out.println(cardapio.getNome());
		System.out.println(cardapio.getId());
		System.out.println(cardapio.getDescrição());
		System.out.println(cardapio.getValor());

	}

}
