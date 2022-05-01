package br.com.projetoTraveller.testes;

import javax.swing.JOptionPane;

import br.com.projetoTraveller.Cidade;


public class TestesCidade {


	public static void main(String[] args) {
		Cidade objeto = new Cidade();
			objeto.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
			objeto.setEstado(JOptionPane.showInputDialog("Digite o Estado:"));
			objeto.setSiglaEstado(JOptionPane.showInputDialog("Digite a sigla do Estado:"));
			objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:")));
			objeto.setPais(JOptionPane.showInputDialog("Digite o Pais:"));
			objeto.setSiglaPais(JOptionPane.showInputDialog("Digite a sigla do Pais:"));
		
			
			System.out.println( "Cidade" + objeto.getCidade());
			System.out.println("Estado" + objeto.getEstado());
			System.out.println("SiglaEstado " + objeto.getSiglaEstado());
			System.out.println("ID: " + objeto.getId());
			System.out.println("Pais" +  objeto.getPais());
			System.out.println("SiglaPais" + objeto.getSiglaPais());
			
			
	}

}
