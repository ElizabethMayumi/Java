package br.com.projetoTraveller.testes;

import javax.swing.JOptionPane;

import br.com.projetoTraveller.Cidade;
import br.com.projetoTraveller.Restaurante;

public class TesteRestaurante {

	public static void main(String[] args) {
		Restaurante restaurante = (Restaurante) new Cidade();
		restaurante.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		restaurante.setFone(JOptionPane.showInputDialog("Digite o logadouro:"));
		restaurante.setNome(JOptionPane.showInputDialog("Digite o logadouro:"));
		restaurante.setEmail(JOptionPane.showInputDialog("Digite o logadouro:"));
		restaurante.setDescrição(JOptionPane.showInputDialog("Digite o logadouro:"));
		
		System.out.println(restaurante.getId());
		System.out.println(restaurante.getFone());
		System.out.println(restaurante.getNome());
		System.out.println(restaurante.getEmail());
		System.out.println(restaurante.getDescrição());
	}

}
